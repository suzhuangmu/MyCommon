package com.mycommon.su.ui.mine.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import com.mycommon.su.R;

/**
 * Created by su on 2018/1/8.
 */

public class MyInvestmentHeadView extends LinearLayout {
    public MyInvestmentHeadView(Context context) {
        super(context);
        init(context);
    }

    public MyInvestmentHeadView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public MyInvestmentHeadView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context){
        View.inflate(context, R.layout.my_investment_head_view, this);
    }
}
