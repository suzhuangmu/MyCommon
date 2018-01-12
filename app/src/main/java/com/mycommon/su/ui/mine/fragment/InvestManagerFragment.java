package com.mycommon.su.ui.mine.fragment;

import android.support.v7.widget.LinearLayoutManager;

import com.app.common.base.BaseFragment;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter;
import com.mycommon.su.R;
import com.mycommon.su.bean.InvestManagerBean;
import com.mycommon.su.ui.mine.adapter.InvestManagerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by su on 2018/1/3.
 */

public class InvestManagerFragment extends BaseFragment {
    @Bind(R.id.recylcerview)
    LRecyclerView lRecyclerView;
    private LRecyclerViewAdapter recyclerViewAdapter;
    private InvestManagerAdapter investManagerAdapter;
    private List<InvestManagerBean> beanList;

    @Override
    protected int getLayoutResource() {
        return R.layout.invest_manager_fragment;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    protected void initView() {
        beanList = new ArrayList<>();
        beanList.add(new InvestManagerBean());
        lRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        investManagerAdapter = new InvestManagerAdapter(getContext(), R.layout.invest_manager_item, beanList);
        recyclerViewAdapter = new LRecyclerViewAdapter(investManagerAdapter);
        lRecyclerView.setAdapter(recyclerViewAdapter);
    }
}
