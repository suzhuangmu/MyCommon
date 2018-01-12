package com.mycommon.su.ui.main.view;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import com.mycommon.su.R;
import com.mycommon.su.ui.detail.activity.HistoryActivity;

/**
 * Created by su on 2017/12/28.
 */

public class LicaiFootView extends LinearLayout {
    private CardView licai_more;
    public LicaiFootView(Context context) {
        super(context);
        init(context);
    }

    public LicaiFootView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public LicaiFootView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(final Context context){
        View view = View.inflate(context, R.layout.licai_foot_view, this);
        licai_more = view.findViewById(R.id.licai_more);
        licai_more.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, HistoryActivity.class));
            }
        });
    }
}
