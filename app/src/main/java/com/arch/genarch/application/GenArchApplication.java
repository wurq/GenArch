package com.arch.genarch.application;

import android.app.Application;
import android.content.Context;

import com.arch.genarch.BuildConfig;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wurongqiu on 2017/4/26.
 */

public class GenArchApplication extends Application  implements ReactApplication {
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

    private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
        @Override
        public boolean getUseDeveloperSupport() {
            return BuildConfig.DEBUG;
        }
        @Override
        protected List getPackages() {
            return Arrays.<ReactPackage>asList(   new MainReactPackage());
        }
    };

    @Override
    public ReactNativeHost getReactNativeHost() {
        return mReactNativeHost;
    }
}
