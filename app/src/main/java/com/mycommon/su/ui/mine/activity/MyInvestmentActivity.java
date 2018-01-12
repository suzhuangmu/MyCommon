package com.mycommon.su.ui.mine.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.app.common.base.BaseActivity;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter;
import com.mycommon.su.R;
import com.mycommon.su.bean.MyInvestBean;
import com.mycommon.su.ui.mine.adapter.MyInvestAdapter;
import com.mycommon.su.ui.mine.view.MyInvestmentHeadView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by su on 2018/1/8.
 */

public class MyInvestmentActivity extends BaseActivity {
    @Bind(R.id.title_name)
    TextView titleName;
    @Bind(R.id.title_back_button)
    RelativeLayout titleBackButton;
    @Bind(R.id.recylcerview)
    LRecyclerView recylcerview;

    private LRecyclerViewAdapter recyclerViewAdapter;
    private MyInvestAdapter myInvestAdapter;
    private List<MyInvestBean> beanList = new ArrayList<>();
    private MyInvestmentHeadView headView;

    @Override
    public int getLayoutId() {
        return R.layout.act_myinvest;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        titleName.setText("我的投资");
        for (int i = 0; i < 8; i++){
            beanList.add(new MyInvestBean());
        }
        myInvestAdapter = new MyInvestAdapter(this, R.layout.myinvest_item, beanList);
        recyclerViewAdapter = new LRecyclerViewAdapter(myInvestAdapter);
        headView = new MyInvestmentHeadView(this);
        headView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        recyclerViewAdapter.addHeaderView(headView);
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
