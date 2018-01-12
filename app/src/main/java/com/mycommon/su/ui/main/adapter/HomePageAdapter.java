package com.mycommon.su.ui.main.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.app.common.commonwidget.MarqueeView;
import com.github.jdsjlzx.universaladapter.ViewHolderHelper;
import com.github.jdsjlzx.universaladapter.recyclerview.MultiItemRecycleViewAdapter;
import com.github.jdsjlzx.universaladapter.recyclerview.MultiItemTypeSupport;
import com.mycommon.su.R;
import com.mycommon.su.bean.MainPageBeen;
import com.mycommon.su.ui.main.activity.WealthRankingActivity;
import com.mycommon.su.ui.news.adapter.PageBannerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by su on 2017/12/27.
 */

public class HomePageAdapter extends MultiItemRecycleViewAdapter<MainPageBeen> {
    public static final int TYPE_CAROUSEL = 1;
    public static final int TYPE_NOTICE = 2;
    public static final int TYPE_BANNER = 3;
    public static final int TYPE_ITEM = 4;
    public HomePageAdapter(Context context, List<MainPageBeen> datas) {
        super(context, datas, new MultiItemTypeSupport<MainPageBeen>() {
            @Override
            public int getLayoutId(int itemType) {
                switch (itemType){
                    case TYPE_CAROUSEL:
                        return R.layout.home_item_carousel;
                    case TYPE_NOTICE:
                        return R.layout.home_item_notice;
                    case TYPE_BANNER:
                        return R.layout.home_item_banner;
                    case TYPE_ITEM:
                        return R.layout.home_item_touzhi;
                }
                return 0;
            }

            @Override
            public int getItemViewType(int position, MainPageBeen mainPageBeen) {

                return position + 1;
            }
        });
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    @Override
    public void convert(ViewHolderHelper helper, MainPageBeen mainPageBeen) {
        switch (helper.getLayoutId()){
            case R.layout.home_item_carousel:

                break;
            case R.layout.home_item_notice:
                MarqueeView marqueeView = helper.getView(R.id.marqueeview);
                List<CharSequence> list = new ArrayList<>();
                SpannableString ss1 = new SpannableString("1、MarqueeView开源项目");
                ss1.setSpan(new ForegroundColorSpan(Color.RED), 2, 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                list.add(ss1);
                SpannableString ss2 = new SpannableString("2、GitHub：sfsheng0322");
                ss2.setSpan(new ForegroundColorSpan(Color.GREEN), 9, 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                list.add(ss2);
                SpannableString ss3 = new SpannableString("3、个人博客：sunfusheng.com");
                ss3.setSpan(new URLSpan("http://sunfusheng.com/"), 7, 21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                list.add(ss3);
                list.add("4、新浪微博：@孙福生微博");

                marqueeView.startWithList(list);
                marqueeView.setOnItemClickListener(new MarqueeView.OnItemClickListener() {
                    @Override
                    public void onItemClick(int position, TextView textView) {
                        Toast.makeText(mContext, textView.getText() + "", Toast.LENGTH_SHORT).show();
                    }
                });
                break;
            case TYPE_BANNER:
//                GridView gridView = helper.getView(R.id.grid_banner);
//                gridView.setAdapter();
                break;
            case TYPE_ITEM:

                break;
        }
    }


    private PageBannerAdapter pageBannerAdapter;
    @Override
    public void createView(ViewHolderHelper helper, int viewType) {
        switch (viewType){
            case TYPE_BANNER:
                GridView gridView = helper.getView(R.id.grid_banner);
                pageBannerAdapter = new PageBannerAdapter(mContext);
                gridView.setAdapter(pageBannerAdapter);
                gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                       if (position == 3){
                           mContext.startActivity(new Intent(mContext, WealthRankingActivity.class));
                       }
                    }
                });
                break;
        }
    }
}
