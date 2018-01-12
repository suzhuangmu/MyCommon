package com.mycommon.su.ui.main.fragment;

import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.app.common.base.BaseFragment;
import com.mycommon.su.R;
import com.mycommon.su.bean.PersonalDesBean;
import com.mycommon.su.ui.login.activity.LoginActivity;
import com.mycommon.su.ui.main.adapter.PersonalAdapter;
import com.mycommon.su.ui.mine.activity.MessageActivity;
import com.mycommon.su.ui.mine.activity.RechargeActivity;
import com.mycommon.su.ui.mine.activity.WithdrawCrashActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by su on 2017/12/28.
 */

public class PersonalFragment extends BaseFragment {
    @Bind(R.id.rc_personal)
    RecyclerView recyclerView;
    @Bind(R.id.tv_title_name)
    TextView tvTitleName;
    @Bind(R.id.ll_title)
    LinearLayout llTitle;
    @Bind(R.id.iv_bg)
    ImageView ivBg;
    @Bind(R.id.iv_portrait)
    ImageView ivPortrait;
    @Bind(R.id.btn_login)
    Button btnLogin;
    @Bind(R.id.rl_portrait)
    RelativeLayout rlPortrait;
    @Bind(R.id.tv_balance)
    TextView tvBalance;
    @Bind(R.id.tv_addprice)
    TextView tv_addprice;
    @Bind(R.id.tv_checkcash)
    TextView tvCheckcash;
    @Bind(R.id.iv_notice)
    ImageView iv_notice;
    private TypedArray icons;
    private String[] desList;
    private List<PersonalDesBean> desBeanList = new ArrayList<>();
    private PersonalAdapter personalAdapter;

    @Override
    protected int getLayoutResource() {
        return R.layout.main_personal_fragment;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    protected void initView() {
        icons = getResources().obtainTypedArray(R.array.personal_item_icons);
        desList = getResources().getStringArray(R.array.personal_items);
        for (int i = 0; i < desList.length; i++) {
            desBeanList.add(new PersonalDesBean(desList[i], icons.getDrawable(i)));
        }
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 4));

        personalAdapter = new PersonalAdapter(getContext(), R.layout.personal_item, desBeanList);
        recyclerView.setAdapter(personalAdapter);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), LoginActivity.class));
            }
        });


    }

    @OnClick({R.id.btn_login, R.id.tv_addprice, R.id.tv_checkcash, R.id.iv_notice})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_notice:
                mContext.startActivity(new Intent(mContext, MessageActivity.class));
                break;
            case R.id.btn_login:
                break;
            case R.id.tv_addprice:
                mContext.startActivity(new Intent(mContext, RechargeActivity.class));
                break;
            case R.id.tv_checkcash:
                mContext.startActivity(new Intent(mContext, WithdrawCrashActivity.class));
                break;
        }
    }
}
