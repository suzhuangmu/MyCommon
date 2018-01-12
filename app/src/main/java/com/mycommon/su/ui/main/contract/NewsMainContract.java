package com.mycommon.su.ui.main.contract;

import com.app.common.base.BaseModel;
import com.app.common.base.BasePresenter;
import com.app.common.base.BaseView;
import com.mycommon.su.bean.NewsChannelTable;

import java.util.List;

import rx.Observable;

/**
 * Created by su on 2017/12/15.
 */

public interface NewsMainContract {

    interface Model extends BaseModel{
        Observable<List<NewsChannelTable>> lodeMineNewsChannels();
    }

    interface View extends BaseView{
        void returnMineNewsChannels(List<NewsChannelTable> newsChannelTables);
    }

    abstract class Presenter extends BasePresenter<View, Model>{
        public abstract void loadMineChannelsRequest();
    }
}
