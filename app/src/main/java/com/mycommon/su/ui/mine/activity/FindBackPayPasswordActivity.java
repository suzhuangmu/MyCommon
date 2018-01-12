package com.mycommon.su.ui.mine.activity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.app.common.base.BaseActivity;
import com.mycommon.su.R;
import com.mycommon.su.ui.mine.view.ValidationCode;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by su on 2018/1/9.
 */

public class FindBackPayPasswordActivity extends BaseActivity {
    @Bind(R.id.title_name)
    TextView titleName;
    @Bind(R.id.title_back_button)
    RelativeLayout titleBackButton;
    @Bind(R.id.ed_login_password)
    EditText edLoginPassword;
    @Bind(R.id.ed_phone)
    EditText edPhone;
    @Bind(R.id.ed_certify)
    EditText edCertify;
    @Bind(R.id.btn_get_certify)
    Button btnGetCertify;
    @Bind(R.id.iv_help)
    ImageView ivHelp;
    @Bind(R.id.ed_pay_password)
    EditText edPayPassword;
    @Bind(R.id.ed_pay_password_again)
    EditText edPayPasswordAgain;
    @Bind(R.id.ed_id_number)
    EditText edIdNumber;
    @Bind(R.id.ed_img_certify)
    EditText edImgCertify;
    @Bind(R.id.validation_code)
    ValidationCode validationCode;
    @Bind(R.id.btn_confirm)
    Button btnConfirm;

    @Override
    public int getLayoutId() {
        return R.layout.act_find_back_pay_password;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        titleName.setText("找回支付密码");
    }


    @OnClick({R.id.title_back_button, R.id.iv_help, R.id.btn_confirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.title_back_button:
                finish();
                break;
            case R.id.iv_help:
                break;
            case R.id.btn_confirm:
                break;
        }
    }
}
