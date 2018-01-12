package com.mycommon.su.ui.mine.adapter;

import android.content.Context;

import com.github.jdsjlzx.universaladapter.ViewHolderHelper;
import com.github.jdsjlzx.universaladapter.recyclerview.CommonRecycleViewAdapter;
import com.mycommon.su.bean.InvestManagerBean;

import java.util.List;

/**
 * Created by su on 2018/1/3.
 */

public class InvestManagerAdapter extends CommonRecycleViewAdapter<InvestManagerBean> {
    public InvestManagerAdapter(Context context, int layoutId, List<InvestManagerBean> mDatass) {
        super(context, layoutId, mDatass);
    }

    @Override
    public void convert(ViewHolderHelper helper, InvestManagerBean investManagerBean) {

    }
}
