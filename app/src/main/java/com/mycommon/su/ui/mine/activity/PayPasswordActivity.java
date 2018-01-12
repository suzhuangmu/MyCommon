package com.mycommon.su.ui.mine.activity;

import android.widget.Button;
import android.widget.EditText;
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

public class PayPasswordActivity extends BaseActivity {
    @Bind(R.id.title_name)
    TextView titleName;
    @Bind(R.id.title_back_button)
    RelativeLayout titleBackButton;
    @Bind(R.id.ed_phone)
    EditText edPhone;
    @Bind(R.id.ed_password)
    EditText edPassword;
    @Bind(R.id.ed_password_again)
    EditText edPasswordAgain;
    @Bind(R.id.ed_certify)
    EditText edCertify;
    @Bind(R.id.validation_code)
    ValidationCode validationCode;
    @Bind(R.id.btn_confirm)
    Button btnConfirm;

    @Override
    public int getLayoutId() {
        return R.layout.act_pay_password;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        titleName.setText("设置支付密码");
    }


    @OnClick(R.id.btn_confirm)
    public void onViewClicked() {
        onBackPressed();
    }
}
