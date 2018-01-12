package com.mycommon.su.ui.mine.activity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.app.common.base.BaseActivity;
import com.mycommon.su.R;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by su on 2018/1/9.
 */

public class SettingActivity extends BaseActivity {
    @Bind(R.id.title_name)
    TextView titleName;
    @Bind(R.id.title_back_button)
    RelativeLayout titleBackButton;
    @Bind(R.id.ll_login_password)
    LinearLayout llLoginPassword;
    @Bind(R.id.ll_pay_password)
    LinearLayout llPayPassword;
    @Bind(R.id.ll_phone_number)
    LinearLayout llPhoneNumber;
    @Bind(R.id.ll_email)
    LinearLayout llEmail;
    @Bind(R.id.ll_callback)
    LinearLayout llCallback;
    @Bind(R.id.ll_acache)
    LinearLayout llAcache;
    @Bind(R.id.btn_login_out)
    Button btnLoginOut;

    @Override
    public int getLayoutId() {
        return R.layout.act_setting;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        titleName.setText("设置");
    }


    @OnClick({R.id.title_back_button, R.id.ll_login_password, R.id.ll_pay_password, R.id.ll_phone_number, R.id.ll_email, R.id.ll_callback, R.id.ll_acache, R.id.btn_login_out})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.title_back_button:
                finish();
                break;
            case R.id.ll_login_password:
                startActivity(new Intent(this, ChangeLoginPasswordActivity.class));
                break;
            case R.id.ll_pay_password:
                startActivity(new Intent(this, PayPasswordActivity.class));
                break;
            case R.id.ll_phone_number:
                startActivity(new Intent(this, ChangePhoneNumberActivity.class));
                break;
            case R.id.ll_email:
                startActivity(new Intent(this, BangEmailActivity.class));
                break;
            case R.id.ll_callback:
                startActivity(new Intent(this, CallBackActivity.class));
                break;
            case R.id.ll_acache:
                startActivity(new Intent(this,  FindBackPayPasswordActivity.class));

                break;
            case R.id.btn_login_out:
                break;
        }
    }
}
