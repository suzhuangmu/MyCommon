package com.app.common.commonwidget;

import android.app.Activity;
import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.app.common.R;


/**
 * Created by su on 2017/12/8.
 */

public class LoadingDialog {
    private static Dialog mLoadingDialog;


    public static Dialog showDialogForLoading(Activity context, String msg, boolean cancelable){
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_loading, null);
        TextView loadingText = (TextView)view.findViewById(R.id.id_tv_loading_dialog_text);
        loadingText.setText(msg);

        mLoadingDialog = new Dialog(context, R.style.CustomProgressDialog);
        mLoadingDialog.setCancelable(cancelable);
        mLoadingDialog.setCanceledOnTouchOutside(false);
        mLoadingDialog.setContentView(view, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        mLoadingDialog.show();
        return  mLoadingDialog;
    }

    public static Dialog showDialogForLoading(Activity context) {
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_loading, null);
        TextView loadingText = (TextView)view.findViewById(R.id.id_tv_loading_dialog_text);
        loadingText.setText("加载中...");

        mLoadingDialog = new Dialog(context, R.style.CustomProgressDialog);
        mLoadingDialog.setCancelable(true);
        mLoadingDialog.setCanceledOnTouchOutside(false);
        mLoadingDialog.setContentView(view, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        mLoadingDialog.show();
        return  mLoadingDialog;
    }

    /**
     * 关闭加载对话框
     */
    public static void cancelDialogForLoading() {
        if(mLoadingDialog != null) {
            mLoadingDialog.cancel();
        }
    }
}
