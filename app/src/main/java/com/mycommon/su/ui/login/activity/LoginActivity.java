package com.mycommon.su.ui.login.activity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.common.base.BaseActivity;
import com.mycommon.su.R;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by su on 2017/12/29.
 */

public class LoginActivity extends BaseActivity {
    @Bind(R.id.iv_back)
    ImageView ivBack;
    @Bind(R.id.ed_username)
    EditText edUsername;
    @Bind(R.id.ed_password)
    EditText edPassword;
    @Bind(R.id.btn_login)
    Button btnLogin;
    @Bind(R.id.tv_forget)
    TextView tvForget;
    @Bind(R.id.tv_regist)
    TextView tvRegist;

    @Override
    public int getLayoutId() {
        return R.layout.act_login;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        SetTranslanteBar();

    }



    @OnClick({R.id.iv_back, R.id.btn_login, R.id.tv_forget, R.id.tv_regist})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.btn_login:
                break;
            case R.id.tv_forget:
                startActivity(new Intent(this, FindPasswordActivity.class));

                break;
            case R.id.tv_regist:
                startActivity(new Intent(this, RegisterActivity.class));
                break;
        }
    }
}
