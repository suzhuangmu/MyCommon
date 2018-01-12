package com.mycommon.su.ui.mine.adapter;

import android.content.Context;

import com.github.jdsjlzx.universaladapter.ViewHolderHelper;
import com.github.jdsjlzx.universaladapter.recyclerview.CommonRecycleViewAdapter;
import com.mycommon.su.bean.MyInvestBean;

import java.util.List;

/**
 * Created by su on 2018/1/8.
 */

public class MyInvestAdapter extends CommonRecycleViewAdapter<MyInvestBean> {
    public MyInvestAdapter(Context context, int layoutId, List<MyInvestBean> mDatass) {
        super(context, layoutId, mDatass);
    }

    @Override
    public void convert(ViewHolderHelper helper, MyInvestBean myInvestBean) {

    }
}
