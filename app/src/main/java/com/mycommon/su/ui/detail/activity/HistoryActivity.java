package com.mycommon.su.ui.detail.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.app.common.base.BaseActivity;
import com.github.jdsjlzx.interfaces.OnLoadMoreListener;
import com.github.jdsjlzx.interfaces.OnRefreshListener;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter;
import com.mycommon.su.R;
import com.mycommon.su.bean.HistoryBean;
import com.mycommon.su.ui.detail.adapter.HistoryAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by su on 2018/1/3.
 */

public class HistoryActivity extends BaseActivity implements OnRefreshListener, OnLoadMoreListener {
    @Bind(R.id.title_name)
    TextView titleName;
    @Bind(R.id.title_back_button)
    RelativeLayout titleBackButton;
    @Bind(R.id.recylcerview)
    LRecyclerView recyclerView;
    private LRecyclerViewAdapter recyclerViewAdapter;
    private HistoryAdapter historyAdapter;
    private List<HistoryBean> historyBeans = new ArrayList<>();

    @Override
    public int getLayoutId() {
        return R.layout.act_history;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        for (int i = 0; i < 5; i++){
            historyBeans.add(new HistoryBean());
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        historyAdapter = new HistoryAdapter(this, R.layout.history_item, historyBeans);
        recyclerViewAdapter = new LRecyclerViewAdapter(historyAdapter);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setOnRefreshListener(this);
        recyclerView.setOnLoadMoreListener(this);
    }

    @OnClick(R.id.title_back_button)
    public void onViewClicked() {
        onBackPressed();
    }

    @Override
    public void onRefresh() {

    }

    @Override
    public void onLoadMore() {

    }
}
