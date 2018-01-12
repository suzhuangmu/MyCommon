package com.mycommon.su.ui.detail.activity;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.app.common.base.BaseActivity;
import com.github.jdsjlzx.interfaces.OnRefreshListener;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter;
import com.mycommon.su.R;
import com.mycommon.su.ui.detail.adapter.InvestDetailAdapter;
import com.mycommon.su.ui.detail.view.InvestDetailHeadView;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by su on 2018/1/2.
 */

public class InvestDetailActivity extends BaseActivity implements OnRefreshListener {
    @Bind(R.id.title_name)
    TextView titleName;
    @Bind(R.id.title_back)
    ImageView titleBack;
    @Bind(R.id.title_back_button)
    RelativeLayout titleBackButton;
    @Bind(R.id.bt_share)
    ImageView btShare;
    @Bind(R.id.rl_title_bg)
    RelativeLayout rlTitleBg;
    @Bind(R.id.rc_detail)
    LRecyclerView recyclerView;
    @Bind(R.id.btn_invest)
    Button btnInvest;

    LRecyclerViewAdapter recyclerViewAdapter;
    private InvestDetailAdapter detailAdapter;
    private InvestDetailHeadView headView;
    @Override
    public int getLayoutId() {
        return R.layout.act_invest_detail;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        detailAdapter = new InvestDetailAdapter(this);
        recyclerViewAdapter = new LRecyclerViewAdapter(detailAdapter);
        headView = new InvestDetailHeadView(this);
        recyclerViewAdapter.addHeaderView(headView);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setOnRefreshListener(this);
        recyclerView.setLoadMoreEnabled(false);
    }



    @OnClick({R.id.title_back_button, R.id.bt_share, R.id.btn_invest})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.title_back_button:
                break;
            case R.id.bt_share:
                break;
            case R.id.btn_invest:
                startActivity(new Intent(this, InvestConfirmActivity.class));
                break;
        }
    }

    @Override
    public void onRefresh() {

    }
}
