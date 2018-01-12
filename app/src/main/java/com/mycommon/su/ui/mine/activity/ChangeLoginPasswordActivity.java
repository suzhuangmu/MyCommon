package com.mycommon.su.ui.mine.activity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.app.common.base.BaseActivity;
import com.mycommon.su.R;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by su on 2018/1/9.
 */

public class ChangeLoginPasswordActivity extends BaseActivity {
    @Bind(R.id.title_name)
    TextView titleName;
    @Bind(R.id.title_back_button)
    RelativeLayout titleBackButton;
    @Bind(R.id.ed_phone)
    EditText edPhone;
    @Bind(R.id.ed_certify)
    EditText edCertify;
    @Bind(R.id.btn_get_certify)
    Button btnGetCertify;
    @Bind(R.id.iv_help)
    ImageView ivHelp;
    @Bind(R.id.ed_password)
    EditText edPassword;
    @Bind(R.id.ed_password_again)
    EditText edPasswordAgain;
    @Bind(R.id.btn_confirm)
    Button btnConfirm;

    @Override
    public int getLayoutId() {
        return R.layout.act_find_password;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        titleName.setText("重置登录密码");
    }


    @OnClick({R.id.title_back_button, R.id.btn_get_certify, R.id.iv_help, R.id.btn_confirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.title_back_button:
                finish();
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
