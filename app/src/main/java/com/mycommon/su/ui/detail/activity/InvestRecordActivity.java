package com.mycommon.su.ui.detail.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.app.common.base.BaseActivity;
import com.github.jdsjlzx.interfaces.OnRefreshListener;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter;
import com.mycommon.su.R;
import com.mycommon.su.bean.InvestRecord;
import com.mycommon.su.ui.detail.adapter.InvestRecordAdapter;
import com.mycommon.su.ui.detail.view.InvestRecordHeadView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by su on 2018/1/2.
 */

public class InvestRecordActivity extends BaseActivity implements OnRefreshListener {
    @Bind(R.id.title_name)
    TextView titleName;
    @Bind(R.id.title_back)
    ImageView titleBack;
    @Bind(R.id.title_back_button)
    RelativeLayout titleBackButton;
    @Bind(R.id.bt_right)
    Button btRight;
    @Bind(R.id.rl_right)
    RelativeLayout rlRight;
    @Bind(R.id.tv_title_right)
    TextView tvTitleRight;
    @Bind(R.id.rl_title_bg)
    RelativeLayout rlTitleBg;
    @Bind(R.id.recylcerview)
    LRecyclerView recyclerView;
    LRecyclerViewAdapter recyclerViewAdapter;
    private InvestRecordAdapter investRecordAdapter;
    private List<InvestRecord> datas = new ArrayList<>();

    @Override
    public int getLayoutId() {
        return R.layout.act_invest_record;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        titleName.setText("投资记录");
        for (int i =0; i < 7; i++){
            datas.add(new InvestRecord());
        }
        investRecordAdapter = new InvestRecordAdapter(this, R.layout.invest_record_item, datas);
        recyclerViewAdapter = new LRecyclerViewAdapter(investRecordAdapter);
        recyclerViewAdapter.addHeaderView(new InvestRecordHeadView(this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setOnRefreshListener(this);

    }


    @OnClick(R.id.title_back_button)
    public void onViewClicked() {
        finish();
    }

    @Override
    public void onRefresh() {

    }
}
