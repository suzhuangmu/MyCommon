package com.mycommon.su.ui.main.fragment;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.ViewGroup;

import com.app.common.base.BaseFragment;
import com.github.jdsjlzx.interfaces.OnItemClickListener;
import com.github.jdsjlzx.interfaces.OnRefreshListener;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter;
import com.mycommon.su.R;
import com.mycommon.su.bean.LicaiBean;
import com.mycommon.su.ui.detail.activity.InvestDetailActivity;
import com.mycommon.su.ui.detail.activity.NewInvestmentActivity;
import com.mycommon.su.ui.main.adapter.HomeLicaiAdapter;
import com.mycommon.su.ui.main.view.LicaiFootView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by su on 2017/12/28.
 */

public class LiCaiFragment extends BaseFragment implements OnRefreshListener {
    @Bind(R.id.irc_licai)
    LRecyclerView iRecyclerView;
    LRecyclerViewAdapter lRecyclerViewAdapter;
    List<LicaiBean> data = new ArrayList<>();
    private HomeLicaiAdapter homeLicaiAdapter;
    private View footView;
    @Override
    protected int getLayoutResource() {
        return R.layout.main_licai_fragment;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    protected void initView() {

//        iRecyclerView.addFooterView(new LicaiFootView(getContext()));
        for (int i = 0; i < 5; i++){
            data.add(new LicaiBean());
        }
        homeLicaiAdapter = new HomeLicaiAdapter(getContext(), data);
        iRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        lRecyclerViewAdapter = new LRecyclerViewAdapter(homeLicaiAdapter);
        footView = new LicaiFootView(getContext());
        footView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        lRecyclerViewAdapter.addFooterView(footView);
        iRecyclerView.setAdapter(lRecyclerViewAdapter);
//        lRecyclerViewAdapter.notifyDataSetChanged();
//        iRecyclerView.setLoadMoreEnabled(false);
        iRecyclerView.setOnRefreshListener(this);

        lRecyclerViewAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                if (position == 0){
                    startActivity(new Intent(getActivity(), NewInvestmentActivity.class));
                }else {
                    startActivity(new Intent(getActivity(), InvestDetailActivity.class));
                }
            }
        });
    }


    @Override
    public void onRefresh() {

    }
}
