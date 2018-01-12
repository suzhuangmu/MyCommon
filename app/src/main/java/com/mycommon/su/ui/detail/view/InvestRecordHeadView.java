package com.mycommon.su.ui.detail.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import com.mycommon.su.R;

/**
 * Created by su on 2018/1/2.
 */

public class InvestRecordHeadView extends LinearLayout {
    public InvestRecordHeadView(Context context) {
        super(context);
        init(context);
    }

    public InvestRecordHeadView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public InvestRecordHeadView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private View itemView;
    private void init(Context context){
        itemView = View.inflate(context, R.layout.invest_record_headview, this);

    }
}
