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
import com.mycommon.su.ui.mine.fragment.AnnounceFragment;
import com.mycommon.su.ui.mine.fragment.RemindFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by su on 2018/1/9.
 */

public class MessageActivity extends BaseActivity {
    @Bind(R.id.title_name)
    TextView titleName;
    @Bind(R.id.title_back_button)
    RelativeLayout titleBackButton;
    @Bind(R.id.tab_layout)
    TabLayout tabLayout;
    @Bind(R.id.viewpager)
    ViewPager viewpager;
    private myPageAdapter myPageAdapter;
    private String[] strTitles = new String[]{"公告", "提醒"};
    private List<Fragment> fragments = new ArrayList<>();

    @Override
    public int getLayoutId() {
        return R.layout.act_message;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        fragments.add(new AnnounceFragment());
        fragments.add(new RemindFragment());
        titleName.setText("消息");
        myPageAdapter = new myPageAdapter(getSupportFragmentManager());

        viewpager.setAdapter(myPageAdapter);
        tabLayout.setupWithViewPager(viewpager);
    }


    @OnClick(R.id.title_back_button)
    public void onViewClicked() {
        finish();
    }

    public class myPageAdapter extends FragmentStatePagerAdapter{

        public myPageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return strTitles.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return strTitles[position];
        }
    }
}
