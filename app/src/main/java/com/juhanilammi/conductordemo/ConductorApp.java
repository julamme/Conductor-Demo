package com.juhanilammi.conductordemo;

import android.app.Application;
import android.content.Context;

/**
 * Created by lammi on 18.12.2016.
 */
public class ConductorApp extends Application {
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext(){
        return context;
    }
}
