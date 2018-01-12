package com.mycommon.su.ui.main.adapter;

import android.content.Context;

import com.github.jdsjlzx.universaladapter.ViewHolderHelper;
import com.github.jdsjlzx.universaladapter.recyclerview.MultiItemRecycleViewAdapter;
import com.github.jdsjlzx.universaladapter.recyclerview.MultiItemTypeSupport;
import com.mycommon.su.R;
import com.mycommon.su.bean.LicaiBean;

import java.util.List;

/**
 * Created by su on 2017/12/28.
 */

public class HomeLicaiAdapter extends MultiItemRecycleViewAdapter<LicaiBean> {
    public static final int LICAIHEAD = 0;
    public static final int LICAIITEM = 1;
    public HomeLicaiAdapter(Context context, List<LicaiBean> datas) {
        super(context, datas, new MultiItemTypeSupport<LicaiBean>() {
            @Override
            public int getLayoutId(int itemType) {
                switch (itemType){
                    case LICAIHEAD:
                        return R.layout.licai_fragment_head_layout;
                    case LICAIITEM:
                        return R.layout.licai_fragment_item_layout;
                }
                return 0;
            }

            @Override
            public int getItemViewType(int position, LicaiBean licaiBean) {
                if (position == 0){
                    return LICAIHEAD;
                }else if (position >= 1){
                    return LICAIITEM;
                }
                return 0;
            }
        });
    }

    @Override
    public void createView(ViewHolderHelper viewHolder, int viewType) {

    }

    @Override
    public void convert(ViewHolderHelper helper, LicaiBean licaiBean) {

    }
}
