package com.mycommon.su.ui.detail.activity;

import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.app.common.base.BaseActivity;
import com.app.common.commonwidget.EditTextDelView;
import com.mycommon.su.R;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by su on 2018/1/2.
 */

public class InvestConfirmActivity extends BaseActivity {
    @Bind(R.id.title_name)
    TextView titleName;
    @Bind(R.id.title_back_button)
    RelativeLayout titleBackButton;
    @Bind(R.id.bt_right)
    Button btRight;
    @Bind(R.id.tv_invest_name)
    TextView tvInvestName;
    @Bind(R.id.tv_percent)
    TextView tvPercent;
    @Bind(R.id.tv_time)
    TextView tvTime;
    @Bind(R.id.tv_invest_price)
    TextView tvInvestPrice;
    @Bind(R.id.tv_balance)
    TextView tvBalance;
    @Bind(R.id.btn_recharge)
    Button btnRecharge;
    @Bind(R.id.ed_invest)
    EditTextDelView edInvest;
    @Bind(R.id.tv_invest_all)
    TextView tvInvestAll;
    @Bind(R.id.tv_yuji)
    TextView tvYuji;
    @Bind(R.id.ed_warning)
    TextView edWarning;
    @Bind(R.id.red_parcket)
    TextView redParcket;
    @Bind(R.id.total_price)
    TextView totalPrice;
    @Bind(R.id.btn_confirm)
    Button btnConfirm;

    @Override
    public int getLayoutId() {
        return R.layout.act_invest_confirm;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        titleName.setText("确认投资");
        btRight.setBackgroundResource(R.drawable.ic_more);
    }



    @OnClick({R.id.btn_recharge, R.id.tv_invest_all, R.id.red_parcket, R.id.btn_confirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_recharge:
                break;
            case R.id.tv_invest_all:
                break;
            case R.id.red_parcket:
                break;
            case R.id.btn_confirm:
                break;
        }
    }
}
