package com.app.common.base;

import android.content.Context;

import com.app.common.baserx.RxManager;

/**
 * Created by su on 2017/12/6.
 */

public abstract class BasePresenter<T,E> {
    public Context mContext;
    public T mView;
    public E mModel;
    public RxManager mRxManager = new RxManager();

    public void setVM(T v, E m){
        this.mView = v;
        this.mModel = m;
        this.onStart();
    }

    //可做注入监听事件
    public void onStart(){}

    public void onDestroy(){
        mRxManager.clear();
    }
}
