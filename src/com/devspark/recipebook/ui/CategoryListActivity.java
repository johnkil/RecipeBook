package com.devspark.recipebook.ui;

import java.util.List;

import com.devspark.recipebook.R;
import com.devspark.recipebook.data.Category;
import com.devspark.recipebook.data.Data;
import com.devspark.recipebook.data.Recipe;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import greendroid.app.GDListActivity;
import greendroid.widget.ActionBarItem;
import greendroid.widget.ActionBarItem.Type;

/**
 * 
 * @author e.shishkin
 *
 */
public class CategoryListActivity extends GDListActivity {
	private static final String LOG_TAG = CategoryListActivity.class.getSimpleName();
	
	public static final String EXT_CATEGORY = "category";
	
	private RecipeAdapter mRecipeAdapter;
	private List<Recipe> recipies;
	private int category;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.v(LOG_TAG, "onCreate() called");
		super.onCreate(savedInstanceState);
		
		category = getIntent().getExtras().getInt(EXT_CATEGORY);
		
		switch (category) {
		case Category.SNACKS:
			setTitle(getString(R.string.snacks));
			recipies = Data.snacks;
			break;
		case Category.SALADS:
			setTitle(getString(R.string.salads));
			recipies = Data.salads;
			break;
		case Category.FIRST:
			setTitle(getString(R.string.first));
			recipies = Data.first;
			break;
		case Category.SECOND:
			setTitle(getString(R.string.second));
			recipies = Data.second;
			break;
		case Category.DESSERTS:
			setTitle(getString(R.string.desserts));
			recipies = Data.desserts;
			break;
		case Category.BEVERAGES:
			setTitle(getString(R.string.beverages));
			recipies = Data.beverages;
			break;
		}
	
		mRecipeAdapter = new RecipeAdapter(CategoryListActivity.this, R.layout.list_item, recipies);
	    setListAdapter(mRecipeAdapter);
	    
	    addActionBarItem(Type.Gallery, R.id.action_bar_gallery);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		Log.v(LOG_TAG, String.format("onListItemClick() called: position=[%d]", position));
		Intent recipeIntent = new Intent(CategoryListActivity.this, RecipeActivity.class);
		recipeIntent.putExtra(RecipeActivity.EXT_URL, ("file:///android_asset/recipes/salads/salad_1.html"));
		startActivity(recipeIntent);
	}
	
	@Override
    public boolean onHandleActionBarItemClick(ActionBarItem item, int position) {
        switch (item.getItemId()) {
            case R.id.action_bar_gallery:
            	Intent intent = new Intent(CategoryListActivity.this, CategoryGridActivity.class);
            	intent.putExtra(CategoryGridActivity.EXT_CATEGORY, category);
            	startActivity(intent);
            	finish();
                return true;

            default:
                return super.onHandleActionBarItemClick(item, position);
        }
    }
	
	private class RecipeAdapter extends ArrayAdapter<Recipe> {
		
	    private List<Recipe> items;
	
	    public RecipeAdapter(Context context, int textViewResourceId, List<Recipe> items) {
	        super(context, textViewResourceId, items);
	        this.items = items;
	    }
	    @Override
	    public View getView(int position, View convertView, ViewGroup parent) {
	    	View mView = convertView;
	        if (mView == null) {
	            LayoutInflater mLayoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	            mView = mLayoutInflater.inflate(R.layout.list_item, null);
	        }
	        Recipe recipe = items.get(position);
	        if (recipe != null) {
	        	TextView titleTxt = (TextView) mView.findViewById(R.id.title_txt);
	            titleTxt.setText(recipe.getName());
	        }
	        return mView;
	    }
	}

}
