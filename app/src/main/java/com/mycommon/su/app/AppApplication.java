package com.mycommon.su.app;

import com.app.common.baseapp.BaseApplication;
import com.app.common.commonutils.LogUtils;
import com.mycommon.su.BuildConfig;

/**
 * Created by su on 2017/12/14.
 */

public class AppApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        LogUtils.logInit(BuildConfig.LOG_DEBUG);
    }
}
