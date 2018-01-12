package com.mycommon.su.ui.main.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.common.base.BaseFragment;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter;
import com.mycommon.su.R;
import com.mycommon.su.bean.WealthRankingBean;
import com.mycommon.su.ui.main.adapter.WealthListAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by su on 2018/1/9.
 */

public class WealthRankingFragment extends BaseFragment {
    @Bind(R.id.recylcerview)
    LRecyclerView recylcerview;
    private LRecyclerViewAdapter recyclerViewAdapter;
    private List<WealthRankingBean> beans = new ArrayList<>();
    private WealthListAdapter listAdapter;

    @Override
    protected int getLayoutResource() {
        return R.layout.wealth_ranking_fragment;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    protected void initView() {
        beans.add(new WealthRankingBean());
        beans.add(new WealthRankingBean());
        beans.add(new WealthRankingBean());
        beans.add(new WealthRankingBean());
        beans.add(new WealthRankingBean());
        beans.add(new WealthRankingBean());
        beans.add(new WealthRankingBean());
        beans.add(new WealthRankingBean());
        recylcerview.setLayoutManager(new LinearLayoutManager(mContext));
        listAdapter = new WealthListAdapter(mContext, R.layout.wealth_list_item, beans);
        recyclerViewAdapter = new LRecyclerViewAdapter(listAdapter);
        recylcerview.setAdapter(recyclerViewAdapter);
    }

}
