package com.begentgroup.samplefacebook;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

/**
 * Created by Administrator on 2016-08-19.
 */
public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(this);
        AppEventsLogger.activateApp(this);
    }
}
