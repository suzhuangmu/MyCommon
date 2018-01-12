package com.mycommon.su.ui.main.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;

import com.app.common.base.BaseActivity;
import com.app.common.commonutils.LogUtils;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.mycommon.su.R;
import com.mycommon.su.app.AppConstant;
import com.mycommon.su.bean.TabEntity;
import com.mycommon.su.ui.main.fragment.ActivityFragment;
import com.mycommon.su.ui.main.fragment.LiCaiFragment;
import com.mycommon.su.ui.main.fragment.MainPageFragment;
import com.mycommon.su.ui.main.fragment.PersonalFragment;

import java.util.ArrayList;

import butterknife.Bind;


public class MainActivity extends BaseActivity {
    @Bind(R.id.tab_layout)
    CommonTabLayout tabLayout;

    private String[] mTitles = {"首页", "理财","活动","我的"};
    private int[] mIconUnselectIds = {
            R.mipmap.ic_home_normal,R.mipmap.ic_licai_normal,R.mipmap.ic_faxian_normal,R.mipmap.ic_personal_normal};
    private int[] mIconSelectIds = {
            R.mipmap.ic_home_selected,R.mipmap.ic_licai_selected, R.mipmap.ic_faxian_selected,R.mipmap.ic_personal_selected};
    private ArrayList<CustomTabEntity> mTabEntities = new ArrayList<>();
    private MainPageFragment mainPageFragment;
    private LiCaiFragment liCaiFragment;
//    private PhotosMainFragment photosMainFragment;
//    private VideoMainFragment videoMainFragment;
    private ActivityFragment activityFragment;
    private PersonalFragment personalFragment;

    private static int tabLayoutHeight;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        initTab();
    }

    private void initTab() {
        for (int i = 0; i < mTitles.length; i++) {
            mTabEntities.add(new TabEntity(mTitles[i], mIconSelectIds[i], mIconUnselectIds[i]));
        }

        tabLayout.setTabData(mTabEntities);
        //点击监听
        tabLayout.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                SwitchTo(position);
            }
            @Override
            public void onTabReselect(int position) {
            }
        });
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initFragment(savedInstanceState);
    }

    /**
     * 初始化碎片
     */
    private void initFragment(Bundle savedInstanceState) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        int currentTabPosition = 0;
        if (savedInstanceState != null) {
//            newsMainFragment = (NewsMainFragment) getSupportFragmentManager().findFragmentByTag("newsMainFragment");
            mainPageFragment = (MainPageFragment) getSupportFragmentManager().findFragmentByTag("mainPageFragment");
            liCaiFragment = (LiCaiFragment) getSupportFragmentManager().findFragmentByTag("liCaiFragment");
//            photosMainFragment = (PhotosMainFragment) getSupportFragmentManager().findFragmentByTag("photosMainFragment");
//            videoMainFragment = (VideoMainFragment) getSupportFragmentManager().findFragmentByTag("videoMainFragment");
            activityFragment = (ActivityFragment) getSupportFragmentManager().findFragmentByTag("activityFragment");
//            careMainFragment = (CareMainFragment) getSupportFragmentManager().findFragmentByTag("careMainFragment");
            personalFragment = (PersonalFragment) getSupportFragmentManager().findFragmentByTag("personalFragment");
            currentTabPosition = savedInstanceState.getInt(AppConstant.HOME_CURRENT_TAB_POSITION);
        } else {
//            newsMainFragment = new NewsMainFragment();
            mainPageFragment = new MainPageFragment();
            liCaiFragment = new LiCaiFragment();
//            photosMainFragment = new PhotosMainFragment();
//            videoMainFragment = new VideoMainFragment();
            activityFragment = new ActivityFragment();
//            careMainFragment = new CareMainFragment();
            personalFragment = new PersonalFragment();
//            transaction.add(R.id.fl_body, newsMainFragment, "newsMainFragment");
            transaction.add(R.id.fl_body, mainPageFragment, "mainPageFragment");
            transaction.add(R.id.fl_body, liCaiFragment, "liCaiFragment");
//            transaction.add(R.id.fl_body, photosMainFragment, "photosMainFragment");
//            transaction.add(R.id.fl_body, videoMainFragment, "videoMainFragment");
            transaction.add(R.id.fl_body, activityFragment, "activityFragment");
//            transaction.add(R.id.fl_body, careMainFragment, "careMainFragment");
            transaction.add(R.id.fl_body, personalFragment, "personalFragment");
        }
        transaction.commit();
        SwitchTo(currentTabPosition);
        tabLayout.setCurrentTab(currentTabPosition);
    }

    /**
     * 切换
     */
    private void SwitchTo(int position) {
        LogUtils.logd("主页菜单position" + position);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        switch (position) {
            //首页
            case 0:
//                transaction.hide(photosMainFragment);
                transaction.hide(liCaiFragment);
//                transaction.hide(videoMainFragment);
                transaction.hide(activityFragment);
//                transaction.hide(careMainFragment);
                transaction.hide(personalFragment);
//                transaction.show(newsMainFragment);
                transaction.show(mainPageFragment);
                transaction.commitAllowingStateLoss();
                break;
            //美女
            case 1:
//                transaction.hide(newsMainFragment);
                transaction.hide(mainPageFragment);
//                transaction.hide(videoMainFragment);
                transaction.hide(activityFragment);
//                transaction.hide(careMainFragment);
                transaction.hide(personalFragment);
//                transaction.show(photosMainFragment);
                transaction.show(liCaiFragment);
                transaction.commitAllowingStateLoss();
                break;
            //视频
            case 2:
//                transaction.hide(newsMainFragment);
                transaction.hide(mainPageFragment);
                transaction.hide(liCaiFragment);
//                transaction.hide(photosMainFragment);
//                transaction.hide(careMainFragment);
                transaction.hide(personalFragment);
//                transaction.show(videoMainFragment);
                transaction.show(activityFragment);
                transaction.commitAllowingStateLoss();
                break;
            //关注
            case 3:
//                transaction.hide(newsMainFragment);
                transaction.hide(mainPageFragment);
//                transaction.hide(photosMainFragment);
                transaction.hide(liCaiFragment);
//                transaction.hide(videoMainFragment);
                transaction.hide(activityFragment);
                transaction.show(personalFragment);
//                transaction.show(careMainFragment);
                transaction.commitAllowingStateLoss();
                break;
            default:
                break;
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //奔溃前保存位置
        LogUtils.loge("onSaveInstanceState进来了1");
        if (tabLayout != null) {
            LogUtils.loge("onSaveInstanceState进来了2");
            outState.putInt(AppConstant.HOME_CURRENT_TAB_POSITION, tabLayout.getCurrentTab());
        }
    }
}
