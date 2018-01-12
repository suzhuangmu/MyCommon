package com.mycommon.su.ui.mine.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.app.common.base.BaseActivity;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter;
import com.mycommon.su.R;
import com.mycommon.su.bean.RedPocketBean;
import com.mycommon.su.ui.mine.adapter.RedPocketAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by su on 2018/1/8.
 */

public class RedPockegeActivity extends BaseActivity {
    @Bind(R.id.title_name)
    TextView titleName;
    @Bind(R.id.title_back_button)
    RelativeLayout titleBackButton;
    @Bind(R.id.recylcerview)
    LRecyclerView recylcerview;
    @Bind(R.id.ll_none)
    LinearLayout llNone;
    private List<RedPocketBean> pocketBeans = new ArrayList<>();
    private LRecyclerViewAdapter recyclerViewAdapter;
    private RedPocketAdapter adapter;

    @Override
    public int getLayoutId() {
        return R.layout.act_red_pockege;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        pocketBeans.add(new RedPocketBean());
        pocketBeans.add(new RedPocketBean());
        pocketBeans.add(new RedPocketBean());

        titleName.setText("我的红包");
        adapter = new RedPocketAdapter(this, R.layout.red_pocket_item, pocketBeans);
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
