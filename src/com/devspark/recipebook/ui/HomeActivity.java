/*
 * Copyright 2011 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.devspark.recipebook.ui;

import com.devspark.recipebook.R;

import greendroid.app.GDActivity;
import greendroid.widget.ActionBarItem;
import greendroid.widget.ActionBarItem.Type;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * Front-door {@link Activity} that displays high-level features the schedule application offers to
 * users. Depending on whether the device is a phone or an Android 3.0+ tablet, different layouts
 * will be used. For example, on a phone, the primary content is a {@link DashboardFragment},
 * whereas on a tablet, both a {@link DashboardFragment} and a {@link TagStreamFragment} are
 * displayed.
 */
public class HomeActivity extends GDActivity {
    private static final String LOG_TAG = "HomeActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	Log.v(LOG_TAG, "onCreate() called");
		super.onCreate(savedInstanceState);

        setActionBarContentView(R.layout.activity_home);
        addActionBarItem(Type.Search, R.id.action_bar_search);
        addActionBarItem(Type.Star, R.id.action_bar_favorite);
        addActionBarItem(Type.Info, R.id.action_bar_info);
    }
    
    public void onSelectCategory(View v) {
    	int category = Integer.parseInt((String) v.getTag());
    	Log.v(LOG_TAG, String.format("onSelectCategory() called: category=[%d]", category));
    	Intent intent = new Intent(HomeActivity.this, CategoryGridActivity.class);
    	intent.putExtra(CategoryGridActivity.EXT_CATEGORY, category);
    	startActivity(intent);
    }
    
    @Override
    public boolean onHandleActionBarItemClick(ActionBarItem item, int position) {
        switch (item.getItemId()) {
            case R.id.action_bar_info:
                startActivity(new Intent(this, InfoActivity.class));
                return true;

            default:
                return super.onHandleActionBarItemClick(item, position);
        }
    }
    
}
