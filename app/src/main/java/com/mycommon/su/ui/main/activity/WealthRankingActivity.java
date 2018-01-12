package com.mycommon.su.ui.main.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.app.common.base.BaseActivity;
import com.mycommon.su.R;
import com.mycommon.su.ui.main.fragment.WealthRankingFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by su on 2018/1/9.
 */

public class WealthRankingActivity extends BaseActivity {
    @Bind(R.id.title_name)
    TextView titleName;
    @Bind(R.id.title_back_button)
    RelativeLayout titleBackButton;
    @Bind(R.id.tab_layout)
    TabLayout tabLayout;
    @Bind(R.id.viewpager)
    ViewPager viewpager;
    private WPageAdapter pageAdapter;
    private List<Fragment> fragments = new ArrayList<>();
    private String[] strTitles = new String[]{"投资排行榜", "收益排行榜"};

    @Override
    public int getLayoutId() {
        return R.layout.act_wealth_ranking;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        titleName.setText("财富排行");
        fragments.add(new WealthRankingFragment());
        fragments.add(new WealthRankingFragment());
        pageAdapter = new WPageAdapter(getSupportFragmentManager());
        viewpager.setAdapter(pageAdapter);
        tabLayout.setupWithViewPager(viewpager);

    }

    @OnClick(R.id.title_back_button)
    public void onViewClicked() {
        finish();
    }

    public class WPageAdapter extends FragmentStatePagerAdapter{

        public WPageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return strTitles[position];
        }
    }
}
