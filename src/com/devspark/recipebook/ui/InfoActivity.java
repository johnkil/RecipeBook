package com.devspark.recipebook.ui;

import com.devspark.recipebook.R;

import android.os.Bundle;
import android.util.Log;
import greendroid.app.GDActivity;

public class InfoActivity extends GDActivity {
	private static final String LOG_TAG = InfoActivity.class.getSimpleName();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.v(LOG_TAG, "onCreate() called");
		super.onCreate(savedInstanceState);
		
		setActionBarContentView(R.layout.activity_info);
	}

}
