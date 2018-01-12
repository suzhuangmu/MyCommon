package com.mycommon.su.ui.main.model;

import com.app.common.baserx.RxSchedulers;
import com.app.common.commonutils.ACache;
import com.mycommon.su.app.AppApplication;
import com.mycommon.su.app.AppConstant;
import com.mycommon.su.bean.NewsChannelTable;
import com.mycommon.su.db.NewsChannelTableManager;
import com.mycommon.su.ui.main.contract.NewsMainContract;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by su on 2017/12/15.
 */

public class NewsMainModel implements NewsMainContract.Model {
    @Override
    public Observable<List<NewsChannelTable>> lodeMineNewsChannels() {
        return Observable.create(new Observable.OnSubscribe<List<NewsChannelTable>>(){

            @Override
            public void call(Subscriber<? super List<NewsChannelTable>> subscriber) {
                ArrayList<NewsChannelTable> newsChannelTables =
                        (ArrayList<NewsChannelTable>) ACache.get(AppApplication.getAppContext()).getAsObject(AppConstant.CHANNEL_MINE);
                if (newsChannelTables == null){
                    newsChannelTables = (ArrayList<NewsChannelTable>) NewsChannelTableManager.loadNewsChannelsStatic();
                    ACache.get(AppApplication.getAppContext()).put(AppConstant.CHANNEL_MINE, newsChannelTables);
                }

                subscriber.onNext(newsChannelTables);
                subscriber.onCompleted();
            }
        }).compose(RxSchedulers.<List<NewsChannelTable>>io_main());
    }










}
