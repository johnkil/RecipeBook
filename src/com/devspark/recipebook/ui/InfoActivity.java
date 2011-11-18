package com.devspark.recipebook.ui;

import com.devspark.recipebook.R;

import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import greendroid.app.GDActivity;

/**
 * 
 * @author e.shishkin
 *
 */
public class InfoActivity extends GDActivity {
	private static final String LOG_TAG = InfoActivity.class.getSimpleName();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.v(LOG_TAG, "onCreate() called");
		super.onCreate(savedInstanceState);
		
		setActionBarContentView(R.layout.activity_info);
		
		TextView versionTxt = (TextView) findViewById(R.id.version);
		try {
			String versionName = getPackageManager().getPackageInfo(getPackageName(), PackageManager.GET_META_DATA).versionName;
			// String versionCode = String.valueOf(getPackageManager().getPackageInfo(getPackageName(), PackageManager.GET_META_DATA).versionCode);
			
			versionTxt.setText(String.format(getString(R.string.version_format), versionName));
		} catch (NameNotFoundException e) {			
			Log.w(LOG_TAG, e);
		}
	}

}
