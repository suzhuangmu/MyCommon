package com.mycommon.su.ui.mine.adapter;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.jdsjlzx.universaladapter.ViewHolderHelper;
import com.github.jdsjlzx.universaladapter.recyclerview.CommonRecycleViewAdapter;
import com.mycommon.su.R;
import com.mycommon.su.bean.RedPocketBean;

import java.util.List;

/**
 * Created by su on 2018/1/8.
 */

public class RedPocketAdapter extends CommonRecycleViewAdapter<RedPocketBean> {
    private ImageView iv_bg, iv_pocket,iv_banner;
    private TextView tv_price,tv_name,tv_money,tv_time;
    private Button btn_use;
    private View line;
    private int STATE = 0;//0,1,2
    public RedPocketAdapter(Context context, int layoutId, List<RedPocketBean> mDatass) {
        super(context, layoutId, mDatass);
    }

    @Override
    public void convert(ViewHolderHelper helper, RedPocketBean redPocketBean) {
        iv_bg = helper.getView(R.id.iv_bg);
        iv_pocket = helper.getView(R.id.iv_pocket);
        iv_banner = helper.getView(R.id.iv_banner);
        tv_price = helper.getView(R.id.tv_price);
        tv_name = helper.getView(R.id.tv_name);
        tv_money = helper.getView(R.id.tv_money);
        tv_time = helper.getView(R.id.tv_time);
        btn_use = helper.getView(R.id.btn_use);
        line = helper.getView(R.id.line);
        setState(helper.getmPosition());
    }

    private void setState(int state){
        switch (state){
            case 0:
                iv_bg.setImageResource(R.drawable.red_space_bg);
                line.setBackgroundResource(R.drawable.vertical_red_line);
                iv_pocket.setImageResource(R.drawable.iv_hongbao);
                tv_price.setTextColor(mContext.getResources().getColor(R.color.font_color_ff6767));
                btn_use.setBackgroundResource(R.drawable.red_radius_3_bg);
                btn_use.setVisibility(View.VISIBLE);
                iv_banner.setVisibility(View.GONE);
                break;
            case 1:
                iv_bg.setImageResource(R.drawable.c3_space_bg);
                line.setBackgroundResource(R.drawable.vertical_line);
                iv_pocket.setImageResource(R.drawable.iv_hongbao_useless);
                tv_price.setTextColor(mContext.getResources().getColor(R.color.bg_color_bb));
                btn_use.setVisibility(View.VISIBLE);
                btn_use.setBackgroundResource(R.drawable.bb_radius_3_bg);
                iv_banner.setVisibility(View.GONE);
                break;
            case 2:
                iv_bg.setImageResource(R.drawable.c3_space_bg);
                line.setBackgroundResource(R.drawable.vertical_line);
                iv_pocket.setImageResource(R.drawable.iv_hongbao_useless);
                tv_price.setTextColor(mContext.getResources().getColor(R.color.bg_color_bb));
                btn_use.setVisibility(View.GONE);
                iv_banner.setVisibility(View.VISIBLE);
                break;
        }
    }
}
