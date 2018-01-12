package com.mycommon.su.ui.news.presenter;

import com.app.common.baserx.RxSubscriber;
import com.mycommon.su.R;
import com.mycommon.su.app.AppConstant;
import com.mycommon.su.bean.NewsSummary;
import com.mycommon.su.ui.news.contract.NewsListContract;

import java.util.List;

import rx.functions.Action1;

/**
 * Created by su on 2017/12/21.
 */

public class NewsListPresenter extends NewsListContract.Presenter {

    @Override
    public void onStart() {
        super.onStart();
        mRxManager.on(AppConstant.NEWS_LIST_TO_TOP, new Action1<Object>() {
            @Override
            public void call(Object o) {
                mView.scrolltoTop();
            }
        });
    }

    @Override
    public void getNewsListDataRequest(String type, String id, int startPage) {
        mRxManager.add(mModel.getNewsListData(type, id, startPage).subscribe(new RxSubscriber<List<NewsSummary>>(mContext, false) {
            @Override
            public void onStart() {
                super.onStart();
                mView.showLoading(mContext.getString(R.string.loading));
            }

            @Override
            protected void _onNext(List<NewsSummary> newsSummaries) {
                mView.returnNewsListData(newsSummaries);
                mView.stopLoading();
            }

            @Override
            protected void _onError(String message) {
                mView.showErrorTip(message);
            }

        }));
    }
}
