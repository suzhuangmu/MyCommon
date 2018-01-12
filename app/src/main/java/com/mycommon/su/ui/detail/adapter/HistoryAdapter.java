package com.mycommon.su.ui.detail.adapter;

import android.content.Context;

import com.github.jdsjlzx.universaladapter.ViewHolderHelper;
import com.github.jdsjlzx.universaladapter.recyclerview.CommonRecycleViewAdapter;
import com.mycommon.su.bean.HistoryBean;

import java.util.List;

/**
 * Created by su on 2018/1/3.
 */

public class HistoryAdapter extends CommonRecycleViewAdapter<HistoryBean> {
    public HistoryAdapter(Context context, int layoutId, List<HistoryBean> mDatass) {
        super(context, layoutId, mDatass);
    }

    @Override
    public void convert(ViewHolderHelper helper, HistoryBean historyBean) {

    }
}
