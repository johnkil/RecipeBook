package com.devspark.recipebook;

import android.util.Log;

import com.devspark.recipebook.data.Data;
import com.devspark.recipebook.ui.HomeActivity;

import greendroid.app.GDApplication;

public class MyApplication extends GDApplication {
	private static final String LOG_TAG = MyApplication.class.getSimpleName();
	
	@Override
	public void onCreate() {
		Log.v(LOG_TAG, "onCreate() called");
		Data.onInit();
		
		super.onCreate();
	}
	
	@Override
    public Class<?> getHomeActivityClass() {
        return HomeActivity.class;
    }

}
