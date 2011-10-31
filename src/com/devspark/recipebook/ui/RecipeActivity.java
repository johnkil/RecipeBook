package com.devspark.recipebook.ui;

import greendroid.app.GDActivity;
import android.os.Bundle;
import android.util.Log;

import com.devspark.recipebook.R;

public class RecipeActivity extends GDActivity {
	private static final String LOG_TAG = RecipeActivity.class.getSimpleName();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.v(LOG_TAG, "onCreate() called");
		super.onCreate(savedInstanceState);
		
		setActionBarContentView(R.layout.activity_info);
	}

}
