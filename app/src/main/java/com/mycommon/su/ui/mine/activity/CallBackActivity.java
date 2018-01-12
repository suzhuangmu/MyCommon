package com.mycommon.su.ui.mine.activity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.app.common.base.BaseActivity;
import com.mycommon.su.R;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by su on 2018/1/9.
 */

public class CallBackActivity extends BaseActivity {
    @Bind(R.id.title_name)
    TextView titleName;
    @Bind(R.id.title_back_button)
    RelativeLayout titleBackButton;
    @Bind(R.id.edittext)
    EditText edittext;
    @Bind(R.id.btn_confirm)
    Button btnConfirm;

    @Override
    public int getLayoutId() {
        return R.layout.act_callback;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        titleName.setText("意见反馈");
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
