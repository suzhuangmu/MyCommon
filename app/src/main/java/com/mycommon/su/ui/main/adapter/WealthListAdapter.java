package com.mycommon.su.ui.main.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.jdsjlzx.universaladapter.ViewHolderHelper;
import com.github.jdsjlzx.universaladapter.recyclerview.CommonRecycleViewAdapter;
import com.mycommon.su.R;
import com.mycommon.su.bean.WealthRankingBean;

import java.util.List;

/**
 * Created by su on 2018/1/9.
 */

public class WealthListAdapter extends CommonRecycleViewAdapter<WealthRankingBean>{
    private TextView tv_top, tv_phone_number, tv_money;
    private ImageView iv_top;
    private int[] topResouces = new int[]{R.drawable.ic_top1, R.drawable.ic_top2, R.drawable.ic_top3};
    public WealthListAdapter(Context context, int layoutId, List<WealthRankingBean> mDatass) {
        super(context, layoutId, mDatass);
    }

    @Override
    public void convert(ViewHolderHelper helper, WealthRankingBean wealthRankingBean) {
        tv_top = helper.getView(R.id.tv_top);
        tv_phone_number = helper.getView(R.id.tv_phone_number);
        tv_money = helper.getView(R.id.tv_money);
        iv_top = helper.getView(R.id.iv_top);
        if (helper.getmPosition() >= 3){
            tv_top.setVisibility(View.VISIBLE);
            iv_top.setVisibility(View.GONE);
            tv_top.setText(helper.getmPosition() + "");
        }else {
            tv_top.setVisibility(View.GONE);
            iv_top.setVisibility(View.VISIBLE);
            iv_top.setImageResource(topResouces[helper.getmPosition()]);
        }
    }
}
