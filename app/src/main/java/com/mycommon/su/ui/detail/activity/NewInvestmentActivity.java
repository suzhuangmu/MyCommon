package com.mycommon.su.ui.detail.activity;

import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.app.common.base.BaseActivity;
import com.mycommon.su.R;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by su on 2018/1/10.
 */

public class NewInvestmentActivity extends BaseActivity {
    @Bind(R.id.title_name)
    TextView titleName;
    @Bind(R.id.title_back_button)
    RelativeLayout titleBackButton;
    @Bind(R.id.tv_total_money)
    TextView tvTotalMoney;
    @Bind(R.id.tv_percent)
    TextView tvPercent;
    @Bind(R.id.tv_date)
    TextView tvDate;
    @Bind(R.id.tv_phone)
    TextView tvPhone;
    @Bind(R.id.tv_tiyan_money)
    TextView tvTiyanMoney;
    @Bind(R.id.tv_qitou_money)
    TextView tvQitouMoney;
    @Bind(R.id.tv_des)
    TextView tvDes;
    @Bind(R.id.btn_confirm)
    Button btnConfirm;

    @Override
    public int getLayoutId() {
        return R.layout.act_new_invest;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        titleName.setText("新手专享体验标");
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
