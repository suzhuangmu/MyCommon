package com.mycommon.su.ui.news.contract;

import com.app.common.base.BaseModel;
import com.app.common.base.BasePresenter;
import com.app.common.base.BaseView;
import com.mycommon.su.bean.NewsSummary;

import java.util.List;

import rx.Observable;

/**
 * Created by su on 2017/12/21.
 */

public interface NewsListContract {

    interface Model extends BaseModel{
        //请求获取新闻
        Observable<List<NewsSummary>> getNewsListData(String type, final String id, int startPage);
    }

    interface View extends BaseView{
        //返回获取的新闻
        void returnNewsListData(List<NewsSummary> newsSummaries);
        //返回顶部
        void scrolltoTop();
    }

    abstract static class Presenter extends BasePresenter<View, Model>{
        //发起获取新闻请求
        public abstract void getNewsListDataRequest(String type, final String id, int startPage);
    }
}
