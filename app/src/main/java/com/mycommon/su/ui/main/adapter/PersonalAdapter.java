package com.mycommon.su.ui.main.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.jdsjlzx.universaladapter.ViewHolderHelper;
import com.github.jdsjlzx.universaladapter.recyclerview.CommonRecycleViewAdapter;
import com.mycommon.su.R;
import com.mycommon.su.bean.PersonalDesBean;
import com.mycommon.su.ui.mine.activity.BangBankCardActivity;
import com.mycommon.su.ui.mine.activity.BankCardActivity;
import com.mycommon.su.ui.mine.activity.InvestManagerActivity;
import com.mycommon.su.ui.mine.activity.MyInvestmentActivity;
import com.mycommon.su.ui.mine.activity.RedPockegeActivity;
import com.mycommon.su.ui.mine.activity.SettingActivity;
import com.mycommon.su.ui.mine.activity.TradeRecordActivity;

import java.util.List;

/**
 * Created by su on 2017/12/28.
 */

public class PersonalAdapter extends CommonRecycleViewAdapter<PersonalDesBean> {
    private Context context;
    public PersonalAdapter(Context context, int layoutId, List<PersonalDesBean> mDatass) {
        super(context, layoutId, mDatass);
        this.context = context;
    }

    @Override
    public void convert(ViewHolderHelper helper, final PersonalDesBean personalDesBean) {
        ImageView imageView = helper.getView(R.id.iv_personal_item);
        TextView textView = helper.getView(R.id.tv_personal_item);
        imageView.setImageDrawable(personalDesBean.getDrawable());
        textView.setText(personalDesBean.getDes());

        helper.getConvertView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (personalDesBean.getDes().equals("投资管理")){
                    mContext.startActivity(new Intent(mContext, InvestManagerActivity.class));
                }
                if (personalDesBean.getDes().equals("我的投资")){
                    mContext.startActivity(new Intent(mContext, MyInvestmentActivity.class));
                }
                if (personalDesBean.getDes().equals("交易记录")){
                    mContext.startActivity(new Intent(mContext, TradeRecordActivity.class));
                }
                if (personalDesBean.getDes().equals("银行卡")){
                    mContext.startActivity(new Intent(mContext, BankCardActivity.class));
                }
                if (personalDesBean.getDes().equals("我的红包")){
                    mContext.startActivity(new Intent(mContext, RedPockegeActivity.class));
                }
                if (personalDesBean.getDes().equals("设置")){
                    mContext.startActivity(new Intent(mContext, SettingActivity.class));
                }
                if (personalDesBean.getDes().equals("充值提现")){
                    mContext.startActivity(new Intent(mContext, BangBankCardActivity.class));
                }
            }
        });
    }
}
