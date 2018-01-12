package com.mycommon.su.ui.detail.adapter;


import android.content.Context;

import com.github.jdsjlzx.universaladapter.ViewHolderHelper;
import com.github.jdsjlzx.universaladapter.recyclerview.CommonRecycleViewAdapter;
import com.mycommon.su.bean.InvestRecord;

import java.util.List;

/**
 * Created by su on 2018/1/2.
 */

public class InvestRecordAdapter extends CommonRecycleViewAdapter<InvestRecord> {
    public InvestRecordAdapter(Context context, int layoutId, List<InvestRecord> mDatass) {
        super(context, layoutId, mDatass);
    }

    @Override
    public void convert(ViewHolderHelper helper, InvestRecord investRecord) {

    }
}
