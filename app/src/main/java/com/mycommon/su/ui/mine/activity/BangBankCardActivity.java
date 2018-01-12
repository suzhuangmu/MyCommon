package com.mycommon.su.ui.mine.activity;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.app.common.base.BaseActivity;
import com.mycommon.su.R;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by su on 2018/1/10.
 */

public class BangBankCardActivity extends BaseActivity {
    @Bind(R.id.title_name)
    TextView titleName;
    @Bind(R.id.title_back_button)
    RelativeLayout titleBackButton;
    @Bind(R.id.tv_username)
    TextView tvUsername;
    @Bind(R.id.tv_bank_name)
    TextView tvBankName;
    @Bind(R.id.rl_bank)
    RelativeLayout rlBank;
    @Bind(R.id.ed_card_number)
    EditText edCardNumber;
    @Bind(R.id.tv_province)
    TextView tvProvince;
    @Bind(R.id.tv_city)
    TextView tvCity;
    @Bind(R.id.ed_bank_name)
    EditText edBankName;
    @Bind(R.id.ed_phone_number)
    EditText edPhoneNumber;
    @Bind(R.id.btn_get_certify)
    Button btnGetCertify;
    @Bind(R.id.iv_help)
    ImageView ivHelp;
    @Bind(R.id.ed_certify_number)
    EditText edCertifyNumber;
    @Bind(R.id.checkbox)
    CheckBox checkbox;
    @Bind(R.id.btn_confirm)
    Button btnConfirm;
    @Bind(R.id.tv_des)
    TextView tvDes;

    @Override
    public int getLayoutId() {
        return R.layout.act_bang_bankcard;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        titleName.setText("绑定银行卡");
    }


    @OnClick({R.id.title_back_button, R.id.rl_bank, R.id.tv_province, R.id.tv_city, R.id.btn_get_certify, R.id.iv_help, R.id.btn_confirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.title_back_button:
                finish();
                break;
            case R.id.rl_bank:
                break;
            case R.id.tv_province:
                break;
            case R.id.tv_city:
                break;
            case R.id.btn_get_certify:
                break;
            case R.id.iv_help:
                break;
            case R.id.btn_confirm:
                break;
        }
    }
}
