package com.devspark.recipebook.ui;

import com.devspark.recipebook.R;
import com.devspark.recipebook.data.Category;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import greendroid.app.GDActivity;
import greendroid.widget.ActionBarItem;
import greendroid.widget.AsyncImageView;
import greendroid.widget.ActionBarItem.Type;

/**
 * 
 * @author e.shishkin
 *
 */
public class CategoryGridActivity extends GDActivity {
	private static final String LOG_TAG = CategoryGridActivity.class.getSimpleName();
	
	public static final String EXT_CATEGORY = "category";
	
	private int category;
	private String assetsPathForm;
	private int itemsCount;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.v(LOG_TAG, "onCreate() called");
		super.onCreate(savedInstanceState);
		
		setActionBarContentView(R.layout.activity_category);
		addActionBarItem(Type.List, R.id.action_bar_list);
		
		category = getIntent().getExtras().getInt(EXT_CATEGORY);
		
		switch (category) {
		case Category.SNACKS:
			setTitle(getString(R.string.snacks));
			assetsPathForm = "recipes/snacks/snack_%d.jpg";
			itemsCount = 48;
			break;
		case Category.SALADS:
			setTitle(getString(R.string.salads));
			assetsPathForm = "recipes/salads/salad_%d.jpg";
			itemsCount = 48;
			break;
		case Category.FIRST:
			setTitle(getString(R.string.first));
			assetsPathForm = "recipes/first/first_%d.jpg";
			itemsCount = 48;
			break;
		case Category.SECOND:
			setTitle(getString(R.string.second));
			assetsPathForm = "recipes/second/second_%d.jpg";
			itemsCount = 48;
			break;
		case Category.DESSERTS:
			setTitle(getString(R.string.desserts));
			assetsPathForm = "recipes/desserts/dessert_%d.jpg";
			itemsCount = 48;
			break;
		case Category.BEVERAGES:
			setTitle(getString(R.string.beverages));
			assetsPathForm = "recipes/drinks/drink_%d.jpg";
			itemsCount = 12;
			break;
		}
		
		GridView gridView = (GridView) findViewById(R.id.myGrid);
        gridView.setAdapter(new ImageAdapter(this));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				Intent recipeIntent = new Intent(CategoryGridActivity.this, RecipeActivity.class);
				recipeIntent.putExtra(RecipeActivity.EXT_URL, ("file:///android_asset/recipes/salads/salad_1.html"));
				startActivity(recipeIntent);
			}
		});
	}
	
	@Override
    public boolean onHandleActionBarItemClick(ActionBarItem item, int position) {
        switch (item.getItemId()) {
            case R.id.action_bar_list:
            	Intent intent = new Intent(CategoryGridActivity.this, CategoryListActivity.class);
            	intent.putExtra(CategoryListActivity.EXT_CATEGORY, category);
            	startActivity(intent);
            	finish();
                return true;

            default:
                return super.onHandleActionBarItemClick(item, position);
        }
    }
	
	
	public class ImageAdapter extends BaseAdapter {
        public ImageAdapter(Context c) {
            mContext = c;
        }

        public int getCount() {
            return itemsCount;
        }

        public Object getItem(int position) {
            return position;
        }

        public long getItemId(int position) {
            return position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
        	AsyncImageView imageView;
            if (convertView == null) {
                imageView = new AsyncImageView(mContext);
                imageView.setLayoutParams(new GridView.LayoutParams(150, 113));
                // imageView.setAdjustViewBounds(true);
                // imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                // imageView.setPadding(8, 8, 8, 8);
            } else {
                imageView = (AsyncImageView) convertView;
            }

            try {
				//imageView.setImageBitmap(getBitmapFromAsset(String.format(assetsPathForm, position+1)));
            	if (position > 23) {
            		imageView.setUrl("file:///android_asset/" + String.format(assetsPathForm, position-23));
            	} else {
            		imageView.setUrl("file:///android_asset/" + String.format(assetsPathForm, position+1));
            	}
			} catch (Exception e) {
				Log.w(LOG_TAG, e);
			}

            return imageView;
        }

        private Context mContext;
    }
	/*
	private Bitmap getBitmapFromAsset(String strName) throws IOException {
		Log.v(LOG_TAG, String.format("getBitmapFromAsset() called: strName=[%s]", strName));
        AssetManager assetManager = getAssets();
        InputStream inputStream = assetManager.open(strName);
        Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
        return bitmap;
    }
	*/
}
