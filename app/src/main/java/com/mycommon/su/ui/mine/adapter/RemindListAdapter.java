package com.mycommon.su.ui.mine.adapter;

import android.content.Context;

import com.github.jdsjlzx.universaladapter.ViewHolderHelper;
import com.github.jdsjlzx.universaladapter.recyclerview.CommonRecycleViewAdapter;
import com.mycommon.su.bean.RemindBean;

import java.util.List;

/**
 * Created by su on 2018/1/9.
 */

public class RemindListAdapter extends CommonRecycleViewAdapter<RemindBean> {
    public RemindListAdapter(Context context, int layoutId, List<RemindBean> mDatass) {
        super(context, layoutId, mDatass);
    }

    @Override
    public void convert(ViewHolderHelper helper, RemindBean remindBean) {

    }
}
