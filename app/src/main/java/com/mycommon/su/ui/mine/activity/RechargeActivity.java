package com.mycommon.su.ui.mine.activity;

import android.content.Intent;
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
 * Created by su on 2018/1/8.
 */

public class RechargeActivity extends BaseActivity {
    @Bind(R.id.title_back_button)
    RelativeLayout titleBackButton;
    @Bind(R.id.tv_balance)
    TextView tvBalance;
    @Bind(R.id.rl_bank)
    RelativeLayout rlBank;
    @Bind(R.id.ed_price)
    EditText edPrice;
    @Bind(R.id.btn_recharge)
    Button btnRecharge;
    @Bind(R.id.title_name)
    TextView title_name;

    @Override
    public int getLayoutId() {
        return R.layout.act_recharge;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        title_name.setText("充值");
    }


    @OnClick({R.id.title_back_button, R.id.btn_recharge, R.id.rl_bank})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.title_back_button:
                break;
            case R.id.btn_recharge:
                startActivity(new Intent(this, RechargeSuccessActivity.class));
                break;
            case R.id.rl_bank:
                startActivity(new Intent(this, BankCardActivity.class));
                break;
        }
    }
}
