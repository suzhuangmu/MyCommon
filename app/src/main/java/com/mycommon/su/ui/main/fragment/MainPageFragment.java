package com.mycommon.su.ui.main.fragment;

import android.support.v7.widget.LinearLayoutManager;

import com.app.common.base.BaseFragment;
import com.github.jdsjlzx.interfaces.OnRefreshListener;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter;
import com.mycommon.su.R;
import com.mycommon.su.bean.MainPageBeen;
import com.mycommon.su.ui.main.adapter.HomePageAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by su on 2017/12/26.
 */

public class MainPageFragment extends BaseFragment implements OnRefreshListener {
    private List<MainPageBeen> data = new ArrayList<>();
    @Bind(R.id.irc)
    LRecyclerView recyclerView;
    LRecyclerViewAdapter lRecyclerViewAdapter;
    private HomePageAdapter pagerAdapter;
    @Override
    protected int getLayoutResource() {
        return R.layout.main_page_fragment;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    protected void initView() {
        for (int i = 0; i < 4; i++){
            data.add(new MainPageBeen());
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        pagerAdapter = new HomePageAdapter(getContext(), data);
        lRecyclerViewAdapter = new LRecyclerViewAdapter(pagerAdapter);
        recyclerView.setAdapter(lRecyclerViewAdapter);
        recyclerView.setOnRefreshListener(this);
        recyclerView.setLoadMoreEnabled(false);
    }


    @Override
    public void onRefresh() {

    }
}
