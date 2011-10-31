package com.devspark.recipebook.ui;

import com.devspark.recipebook.R;

import android.os.Bundle;
import android.util.Log;
import greendroid.app.GDActivity;

public class CategoryActivity extends GDActivity {
	private static final String LOG_TAG = "HomeActivity";
	
	public static final String EXT_CATEGORY = "category";
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.v(LOG_TAG, "onCreate() called");
		super.onCreate(savedInstanceState);
		
		setActionBarContentView(R.layout.activity_category);
		int category = getIntent().getExtras().getInt(EXT_CATEGORY);
		
		switch (category) {
		case Category.SNACKS:
			setTitle(getString(R.string.snacks));
			break;
		case Category.SALADS:
			setTitle(getString(R.string.salads));
			break;
		case Category.FIRST:
			setTitle(getString(R.string.first));
			break;
		case Category.SECOND:
			setTitle(getString(R.string.second));
			break;
		case Category.DESSERTS:
			setTitle(getString(R.string.desserts));
			break;
		case Category.BEVERAGES:
			setTitle(getString(R.string.beverages));
			break;
		}
	}

	public final class Category {
		
		public static final int SNACKS 		= 0;
		public static final int SALADS 		= 1;
		public static final int FIRST 		= 2;
		public static final int SECOND 		= 3;
		public static final int DESSERTS 	= 4;
		public static final int BEVERAGES 	= 5;
		
	}
	
}
