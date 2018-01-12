package com.mycommon.su.ui.mine.activity;

import android.view.View;
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

public class BangEmailActivity extends BaseActivity {
    @Bind(R.id.title_name)
    TextView titleName;
    @Bind(R.id.title_back_button)
    RelativeLayout titleBackButton;
    @Bind(R.id.ed_email)
    EditText edEmail;
    @Bind(R.id.ed_certify)
    EditText edCertify;
    @Bind(R.id.validation_code)
    ValidationCode validationCode;
    @Bind(R.id.btn_confirm)
    Button btnConfirm;

    @Override
    public int getLayoutId() {
        return R.layout.act_bang_email;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        titleName.setText("绑定邮箱");
    }


    @OnClick({R.id.title_back_button, R.id.btn_confirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.title_back_button:
                onBackPressed();
                break;
            case R.id.btn_confirm:
                break;
        }
    }
}
