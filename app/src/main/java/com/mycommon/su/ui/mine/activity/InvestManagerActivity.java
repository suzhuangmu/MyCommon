package com.mycommon.su.ui.mine.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.app.common.base.BaseActivity;
import com.mycommon.su.R;
import com.mycommon.su.ui.mine.fragment.InvestManagerFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by su on 2018/1/3.
 */

public class InvestManagerActivity extends BaseActivity {
    @Bind(R.id.title_name)
    TextView titleName;
    @Bind(R.id.title_back_button)
    RelativeLayout titleBackButton;
    @Bind(R.id.tablayout)
    TabLayout tablayout;
    @Bind(R.id.viewpager)
    ViewPager viewpager;
    private List<Fragment> fragments = new ArrayList<>();
    private String[] titles = new String[]{"招募中", "持有中", "已结清"};


    @Override
    public int getLayoutId() {
        return R.layout.act_invest_manager;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        titleName.setText("投资管理");
        fragments.add(new InvestManagerFragment());
        fragments.add(new InvestManagerFragment());
        fragments.add(new InvestManagerFragment());

        viewpager.setAdapter(new InvestManagerPageAdapter(getSupportFragmentManager()));
        tablayout.setupWithViewPager(viewpager);
    }

    @OnClick(R.id.title_back_button)
    public void onViewClicked() {
        onBackPressed();
    }

    public class InvestManagerPageAdapter extends FragmentStatePagerAdapter{

        public InvestManagerPageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return titles.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }
    }
}
