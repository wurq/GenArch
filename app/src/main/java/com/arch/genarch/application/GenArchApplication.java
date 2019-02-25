package com.arch.genarch.application;

import android.app.Application;
import android.content.Context;

/**
 * Created by wurongqiu on 2017/4/26.
 */

public class GenArchApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Context context = getApplicationContext();
//        ScreenUtil.GetInfo(context);
        AppProfile.setContext(context);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }
}
