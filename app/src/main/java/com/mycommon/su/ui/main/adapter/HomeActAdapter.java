package com.mycommon.su.ui.main.adapter;

import android.content.Context;

import com.github.jdsjlzx.universaladapter.ViewHolderHelper;
import com.github.jdsjlzx.universaladapter.recyclerview.MultiItemRecycleViewAdapter;
import com.github.jdsjlzx.universaladapter.recyclerview.MultiItemTypeSupport;
import com.mycommon.su.R;
import com.mycommon.su.bean.ActBean;

import java.util.List;

/**
 * Created by su on 2017/12/28.
 */

public class HomeActAdapter extends MultiItemRecycleViewAdapter<ActBean> {
    public HomeActAdapter(Context context, List<ActBean> datas) {
        super(context, datas, new MultiItemTypeSupport<ActBean>() {
            @Override
            public int getLayoutId(int itemType) {
                return R.layout.main_act_item;
            }

            @Override
            public int getItemViewType(int position, ActBean actBean) {
                return 0;
            }
        });
    }

    @Override
    public void createView(ViewHolderHelper viewHolder, int viewType) {

    }

    @Override
    public void convert(ViewHolderHelper helper, ActBean actBean) {

    }
}
