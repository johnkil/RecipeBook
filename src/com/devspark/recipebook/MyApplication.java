package com.devspark.recipebook;

import com.devspark.recipebook.ui.HomeActivity;

import greendroid.app.GDApplication;

public class MyApplication extends GDApplication {
	
	@Override
    public Class<?> getHomeActivityClass() {
        return HomeActivity.class;
    }

}
