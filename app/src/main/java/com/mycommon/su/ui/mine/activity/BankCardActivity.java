package com.mycommon.su.ui.mine.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.app.common.base.BaseActivity;
import com.mycommon.su.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by su on 2018/1/8.
 */

public class BankCardActivity extends BaseActivity {
    @Bind(R.id.title_name)
    TextView titleName;
    @Bind(R.id.title_back_button)
    RelativeLayout titleBackButton;
    @Bind(R.id.ll_add)
    LinearLayout llAdd;
    @Bind(R.id.iv_bank)
    ImageView ivBank;
    @Bind(R.id.tv_bank_name)
    TextView tvBankName;
    @Bind(R.id.tv_bank_type)
    TextView tvBankType;
    @Bind(R.id.tv_card_number)
    TextView tvCardNumber;
    @Bind(R.id.tv_change_card)
    TextView tvChangeCard;
    @Bind(R.id.ll_bank)
    LinearLayout llBank;

    @Override
    public int getLayoutId() {
        return R.layout.act_bankcard;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        titleName.setText("我的银行卡");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.title_back_button, R.id.tv_change_card})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.title_back_button:
                finish();
                break;
            case R.id.tv_change_card:

                break;
        }
    }
}
