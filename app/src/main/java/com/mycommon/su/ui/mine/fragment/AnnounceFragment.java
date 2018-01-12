package com.mycommon.su.ui.mine.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.widget.TextView;

import com.app.common.base.BaseFragment;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter;
import com.mycommon.su.R;
import com.mycommon.su.bean.AnnounceBean;
import com.mycommon.su.ui.mine.adapter.AnnounceListAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by su on 2018/1/9.
 */

public class AnnounceFragment extends BaseFragment {
    @Bind(R.id.recylcerview)
    LRecyclerView recylcerview;
    @Bind(R.id.tv_none)
    TextView tvNone;
    private List<AnnounceBean> beanList = new ArrayList<>();
    private LRecyclerViewAdapter recyclerViewAdapter;
    private AnnounceListAdapter announceListAdapter;

    @Override
    protected int getLayoutResource() {
        return R.layout.remind_fragment;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    protected void initView() {
        beanList.add(new AnnounceBean());
        beanList.add(new AnnounceBean());
        beanList.add(new AnnounceBean());
        beanList.add(new AnnounceBean());
        tvNone.setText("暂无公告信息");
        recylcerview.setLayoutManager(new LinearLayoutManager(mContext));
        announceListAdapter = new AnnounceListAdapter(mContext, R.layout.announce_list_item, beanList);
        recyclerViewAdapter = new LRecyclerViewAdapter(announceListAdapter);
        recylcerview.setAdapter(recyclerViewAdapter);
        recylcerview.setLoadMoreEnabled(false);
    }

}
