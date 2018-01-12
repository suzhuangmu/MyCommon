package com.mycommon.su.ui.main.presenter;

import com.app.common.baserx.RxSubscriber;
import com.mycommon.su.app.AppConstant;
import com.mycommon.su.bean.NewsChannelTable;
import com.mycommon.su.ui.main.contract.NewsMainContract;

import java.util.List;

import rx.functions.Action1;

/**
 * Created by su on 2017/12/15.
 */

public class NewsMainPresenter extends NewsMainContract.Presenter {

    @Override
    public void onStart() {
        super.onStart();
        mRxManager.on(AppConstant.NEWS_CHANNEL_CHANGED, new Action1<List<NewsChannelTable>>() {
            @Override
            public void call(List<NewsChannelTable> newsChannelTables) {
                if (newsChannelTables != null){
                    mView.returnMineNewsChannels(newsChannelTables);
                }
            }
        });
    }

    @Override
    public void loadMineChannelsRequest() {
        mRxManager.add(mModel.lodeMineNewsChannels().subscribe(new RxSubscriber<List<NewsChannelTable>>(mContext, false) {
            @Override
            protected void _onNext(List<NewsChannelTable> newsChannelTables) {
                mView.returnMineNewsChannels(newsChannelTables);
            }

            @Override
            protected void _onError(String message) {

            }
        }));
    }
}
