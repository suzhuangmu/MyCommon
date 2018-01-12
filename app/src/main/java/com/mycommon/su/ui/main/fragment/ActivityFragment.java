package com.mycommon.su.ui.main.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.common.base.BaseFragment;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter;
import com.mycommon.su.R;
import com.mycommon.su.bean.ActBean;
import com.mycommon.su.ui.main.adapter.HomeActAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by su on 2017/12/28.
 */

public class ActivityFragment extends BaseFragment {
    @Bind(R.id.irc_act)
    LRecyclerView iRecyclerView;
    LRecyclerViewAdapter recyclerViewAdapter;
    private List<ActBean> data = new ArrayList<>();
    private HomeActAdapter homeActAdapter;
    @Bind(R.id.title_back)
    ImageView title_back;
    @Bind(R.id.title_name)
    TextView title_name;

    @Override
    protected int getLayoutResource() {
        return R.layout.main_act_fragment;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    protected void initView() {
        title_back.setVisibility(View.GONE);
        title_name.setText("活动中心");
        for (int i = 0; i < 5; i++){
            data.add(new ActBean());
        }
        homeActAdapter = new HomeActAdapter(getContext(), data);
        recyclerViewAdapter = new LRecyclerViewAdapter(homeActAdapter);
        iRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        iRecyclerView.setAdapter(recyclerViewAdapter);
    }
}
