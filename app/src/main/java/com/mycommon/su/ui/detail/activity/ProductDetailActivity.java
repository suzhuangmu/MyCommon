package com.mycommon.su.ui.detail.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.app.common.base.BaseActivity;
import com.mycommon.su.R;
import com.mycommon.su.ui.detail.fragment.ProductFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by su on 2018/1/2.
 */

public class ProductDetailActivity extends BaseActivity {
    @Bind(R.id.title_name)
    TextView titleName;
    @Bind(R.id.title_back_button)
    RelativeLayout titleBackButton;
    @Bind(R.id.tv_title_right)
    TextView tvTitleRight;
    @Bind(R.id.tablayout)
    TabLayout tablayout;
    @Bind(R.id.viewpager)
    ViewPager viewpager;

    private String[] strTitles = new String[]{"项目介绍", "企业信息", "风控措施"};
    List<Fragment> fragments = new ArrayList<>();
    public final String INT_PAGE = "INT_PAGE";
    @Override
    public int getLayoutId() {
        return R.layout.act_pro_detail;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        titleName.setText("项目详情");
        tvTitleRight.setVisibility(View.VISIBLE);
        tvTitleRight.setText("协议范本");
        for (int i = 0; i < strTitles.length; i++){
            Bundle bundle = new Bundle();
            bundle.putInt(INT_PAGE, i);
            bundle.putString("title", strTitles[i]);
            ProductFragment p = new ProductFragment();
            p.setArguments(bundle);
            fragments.add(p);
        }

        viewpager.setAdapter(new ProductPagerAdapter(getSupportFragmentManager()));
        tablayout.setupWithViewPager(viewpager);
    }

    public class ProductPagerAdapter extends FragmentPagerAdapter{

        public ProductPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return strTitles[position];
        }

        @Override
        public int getCount() {
            return strTitles.length;
        }
    }

}
