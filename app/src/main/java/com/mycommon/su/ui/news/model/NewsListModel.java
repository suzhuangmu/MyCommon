package com.mycommon.su.ui.news.model;

import com.app.common.baserx.RxSchedulers;
import com.app.common.commonutils.TimeUtil;
import com.mycommon.su.api.Api;
import com.mycommon.su.api.ApiConstants;
import com.mycommon.su.api.HostType;
import com.mycommon.su.bean.NewsSummary;
import com.mycommon.su.ui.news.contract.NewsListContract;

import java.util.List;
import java.util.Map;

import rx.Observable;
import rx.functions.Func1;
import rx.functions.Func2;

/**
 * Created by su on 2017/12/21.
 */

public class NewsListModel implements NewsListContract.Model {
    @Override
    public Observable<List<NewsSummary>> getNewsListData(String type, final String id, int startPage) {
        return Api.getDefault(HostType.NETEASE_NEWS_VIDEO).getNewsList(Api.getCacheControl(), type, id, startPage)
                .flatMap(new Func1<Map<String, List<NewsSummary>>, Observable<NewsSummary>>() {
                    @Override
                    public Observable<NewsSummary> call(Map<String, List<NewsSummary>> stringListMap) {
                        if (id.endsWith(ApiConstants.HOUSE_ID)) {
                            // 房产实际上针对地区的它的id与返回key不同
                            return Observable.from(stringListMap.get("北京"));
                        }
                        return Observable.from(stringListMap.get(id));
                    }
                })
                .map(new Func1<NewsSummary, NewsSummary>() {
                    @Override
                    public NewsSummary call(NewsSummary newsSummary) {
                        String ptime = TimeUtil.formatDate(newsSummary.getPtime());
                        newsSummary.setPtime(ptime);
                        return newsSummary;
                    }
                })
                .distinct()
                .toSortedList(new Func2<NewsSummary, NewsSummary, Integer>() {
                    @Override
                    public Integer call(NewsSummary newsSummary, NewsSummary newsSummary2) {
                        return newsSummary2.getPtime().compareTo(newsSummary.getPtime());
                    }
                })
                //声明线程调度
                .compose(RxSchedulers.<List<NewsSummary>>io_main());
    }
}
