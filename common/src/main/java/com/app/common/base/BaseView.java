package com.app.common.base;

/**
 * Created by su on 2017/12/8.
 */

public interface BaseView {
    /*******内嵌加载*******/
    void showLoading(String title);
    void stopLoading();
    void showErrorTip(String msg);
}
