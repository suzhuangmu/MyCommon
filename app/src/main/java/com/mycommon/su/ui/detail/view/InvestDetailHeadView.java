package com.mycommon.su.ui.detail.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import com.app.common.commonwidget.HorizontalProgressBar;
import com.mycommon.su.R;

/**
 * Created by su on 2018/1/2.
 */

public class InvestDetailHeadView extends LinearLayout {
    private HorizontalProgressBar progressBar;
    public InvestDetailHeadView(Context context) {
        super(context);
        init(context);
    }

    public InvestDetailHeadView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public InvestDetailHeadView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context){
        View view = View.inflate(context, R.layout.invest_detail_headview, this);
        progressBar = view.findViewById(R.id.head_progress);
        progressBar.setProgressWithAnimation(57);
    }


}
