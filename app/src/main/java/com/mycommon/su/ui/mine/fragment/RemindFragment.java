package com.mycommon.su.ui.mine.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.widget.TextView;

import com.app.common.base.BaseFragment;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter;
import com.mycommon.su.R;
import com.mycommon.su.bean.RemindBean;
import com.mycommon.su.ui.mine.adapter.RemindListAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by su on 2018/1/9.
 */

public class RemindFragment extends BaseFragment {
    @Bind(R.id.recylcerview)
    LRecyclerView recylcerview;
    @Bind(R.id.tv_none)
    TextView tvNone;
    private LRecyclerViewAdapter recyclerViewAdapter;
    private RemindListAdapter listAdapter;
    private List<RemindBean> beans = new ArrayList<>();

    @Override
    protected int getLayoutResource() {
        return R.layout.remind_fragment;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    protected void initView() {
        beans.add(new RemindBean());
        beans.add(new RemindBean());
        beans.add(new RemindBean());
        beans.add(new RemindBean());
        tvNone.setText("暂无提醒消息");
        recylcerview.setLayoutManager(new LinearLayoutManager(mContext));
        listAdapter = new RemindListAdapter(mContext, R.layout.remind_list_item, beans);
        recyclerViewAdapter = new LRecyclerViewAdapter(listAdapter);
        recylcerview.setAdapter(recyclerViewAdapter);

        recylcerview.setLoadMoreEnabled(false);

    }

}
