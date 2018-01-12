package com.mycommon.su.ui.mine.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.app.common.base.BaseActivity;
import com.app.common.commonwidget.EditTextDelView;
import com.mycommon.su.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by su on 2018/1/3.
 */

public class AuthencertifyActivity extends BaseActivity {

    @Bind(R.id.title_name)
    TextView titleName;
    @Bind(R.id.title_back_button)
    RelativeLayout titleBackButton;
    @Bind(R.id.ed_name)
    EditTextDelView edName;
    @Bind(R.id.ed_certify)
    EditTextDelView edCertify;
    @Bind(R.id.checkbox)
    CheckBox checkbox;
    @Bind(R.id.btn_confirm)
    Button btnConfirm;

    @Override
    public int getLayoutId() {
        return R.layout.act_authen;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        titleName.setText("实名认证");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }


    @OnClick({R.id.title_back_button, R.id.btn_confirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.title_back_button:
                finish();
                break;
            case R.id.btn_confirm:
                break;
        }
    }
}
