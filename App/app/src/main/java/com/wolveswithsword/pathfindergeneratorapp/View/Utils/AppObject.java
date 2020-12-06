package com.wolveswithsword.pathfindergeneratorapp.View.Utils;

import android.app.Application;
import android.content.Context;

public class AppObject extends Application {
    private static AppObject instance;

    public static AppObject getInstance() {
        return instance;
    }

    public static Context getContext(){
        return instance;
        // or return instance.getApplicationContext();
    }

    @Override
    public void onCreate() {
        instance = this;
        super.onCreate();
    }
}
