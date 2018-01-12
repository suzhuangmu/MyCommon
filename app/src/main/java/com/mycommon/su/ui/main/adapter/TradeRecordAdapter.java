package com.mycommon.su.ui.main.adapter;

import android.content.Context;

import com.github.jdsjlzx.universaladapter.ViewHolderHelper;
import com.github.jdsjlzx.universaladapter.recyclerview.CommonRecycleViewAdapter;
import com.mycommon.su.bean.TradeRecordBean;

import java.util.List;

/**
 * Created by su on 2018/1/8.
 */

public class TradeRecordAdapter extends CommonRecycleViewAdapter<TradeRecordBean> {
    public TradeRecordAdapter(Context context, int layoutId, List<TradeRecordBean> mDatass) {
        super(context, layoutId, mDatass);
    }

    @Override
    public void convert(ViewHolderHelper helper, TradeRecordBean tradeRecordBean) {

    }
}
