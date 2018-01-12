package com.app.common.baserx;

import android.support.annotation.NonNull;

import com.app.common.commonutils.LogUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.subjects.PublishSubject;
import rx.subjects.Subject;

/**
 * Created by su on 2017/12/6.
 * 用RxJava实现的EventBus
 */

public class RxBus {
    private static RxBus instance;

    public static synchronized RxBus getInstance(){
        if (null == instance){
            instance = new RxBus();
        }
        return instance;
    }

    private RxBus(){}

    private ConcurrentHashMap<Object, List<Subject>> subjectMapper = new ConcurrentHashMap<>();

    /**
     * 订阅事件源
     * @param mObservable
     * @param mAction1
     * @return
     */
    public RxBus OnEvent(Observable<?> mObservable, Action1<Object> mAction1){

        mObservable.observeOn(AndroidSchedulers.mainThread()).subscribe(mAction1, new Action1<Throwable>() {
            @Override
            public void call(Throwable throwable) {
                throwable.printStackTrace();
            }
        });
        return getInstance();
    }

    /**
     * 注册事件源
     * @param tag
     * @param <T>
     * @return
     */
    public <T> Observable<T> register(@NonNull Object tag){
        List<Subject> subjectList = subjectMapper.get(tag);
        if (null == subjectList){
            subjectList = new ArrayList<>();
            subjectMapper.put(tag, subjectList);
        }
        Subject<T, T> subject;
        subjectList.add(subject = PublishSubject.create());
        LogUtils.logd("register"+tag + "  size:" + subjectList.size());
        return subject;
    }

    public void unregister(@NonNull Object tag){
        List<Subject> subjects = subjectMapper.get(tag);
        if (null != subjects){
            subjectMapper.remove(tag);
        }
    }

    public RxBus unregister(@NonNull Object tag, @NonNull Observable<?> observable){
        if (null == observable){
            return getInstance();
        }
        List<Subject> subjects = subjectMapper.get(tag);
        if (null != subjects){
            subjects.remove(observable);
            if (isEmpty(subjects)){
                subjects.remove(tag);
                LogUtils.logd("unregister"+ tag + "  size:" + subjects.size());
            }
        }
        return getInstance();
    }

    public void post(@NonNull Object content){
        post(content.getClass().getName(), content);
    }

    public void post(@NonNull Object tag, @NonNull Object content){
        LogUtils.logd("post" + "eventName: " + tag);
        List<Subject> subjectList = subjectMapper.get(tag);
        if (!isEmpty(subjectList)){
            for (Subject subject : subjectList){
                subject.onNext(content);
                LogUtils.logd("onEvent" + "eventName: " + tag);
            }
        }
    }

    public boolean isEmpty(Collection<Subject> collection){
        return null == collection || collection.isEmpty();
    }
}
