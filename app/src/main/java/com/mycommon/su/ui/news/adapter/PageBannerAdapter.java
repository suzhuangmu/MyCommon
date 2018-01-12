package com.mycommon.su.ui.news.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mycommon.su.R;

/**
 * Created by su on 2017/12/27.
 */

public class PageBannerAdapter extends BaseAdapter {

    private String[] strBanner;
    private int[] imgBanner;
    private Context context;
    TypedArray icons;

    public PageBannerAdapter(Context context){
        this.context = context;
        strBanner = context.getResources().getStringArray(R.array.home_page_text_banners);
        imgBanner = context.getResources().getIntArray(R.array.home_page_img_banners);
        Resources res = context.getResources();
        icons = res.obtainTypedArray(R.array.home_page_img_banners);
    }

    @Override
    public int getCount() {
        return strBanner.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = View.inflate(context, R.layout.home_item_banner_view, null);
        ImageView imageView = view.findViewById(R.id.iv_banner);
        TextView tv = view.findViewById(R.id.tv_banner);
        imageView.setImageDrawable(icons.getDrawable(position));
        tv.setText(strBanner[position]);
        return view;
    }
}
