package com.devspark.recipebook.ui;

import greendroid.app.GDActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

import com.devspark.recipebook.R;

/**
 * 
 * @author e.shishkin
 *
 */
public class RecipeActivity extends GDActivity {
	private static final String LOG_TAG = RecipeActivity.class.getSimpleName();
	
	public static final String EXT_URL = "url";
	
	WebView mWebView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.v(LOG_TAG, "onCreate() called");
		super.onCreate(savedInstanceState);
		
		setActionBarContentView(R.layout.activity_recipe);
		setTitle("Салат «Морковка»");
		
		String url = getIntent().getStringExtra(EXT_URL);
		
		mWebView = (WebView) findViewById(R.id.webview);
	    mWebView.getSettings().setJavaScriptEnabled(true);
	    mWebView.loadUrl(url);
	    mWebView.setHorizontalScrollBarEnabled(false);
	}

}
