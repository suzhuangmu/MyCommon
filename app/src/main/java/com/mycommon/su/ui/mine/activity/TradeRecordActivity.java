package com.mycommon.su.ui.mine.activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.app.common.base.BaseActivity;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter;
import com.mycommon.su.R;
import com.mycommon.su.bean.TradeRecordBean;
import com.mycommon.su.ui.main.adapter.TradeRecordAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by su on 2018/1/8.
 */

public class TradeRecordActivity extends BaseActivity {
    @Bind(R.id.title_name)
    TextView titleName;
    @Bind(R.id.title_back_button)
    RelativeLayout titleBackButton;
    @Bind(R.id.recylcerview)
    LRecyclerView recylcerview;

    private LRecyclerViewAdapter recyclerViewAdapter;
    private TradeRecordAdapter adapter;
    private List<TradeRecordBean> beans = new ArrayList<>();

    @Override
    public int getLayoutId() {
        return R.layout.act_trade_record;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        titleName.setText("交易记录");
        for (int i = 0; i < 8; i++){
            beans.add(new TradeRecordBean());
        }
        adapter = new TradeRecordAdapter(this, R.layout.trade_record_item, beans);
        recyclerViewAdapter = new LRecyclerViewAdapter(adapter);
        recylcerview.setLayoutManager(new LinearLayoutManager(this));
        recylcerview.setAdapter(recyclerViewAdapter);
        recylcerview.setLoadMoreEnabled(false);
        recylcerview.setPullRefreshEnabled(false);
    }

    @OnClick(R.id.title_back_button)
    public void onViewClicked() {
        finish();
    }
}
