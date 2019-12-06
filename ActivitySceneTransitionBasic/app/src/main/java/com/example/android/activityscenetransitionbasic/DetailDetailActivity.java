package com.example.android.activityscenetransitionbasic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import static com.example.android.activityscenetransitionbasic.DetailActivity.VIEW_NAME_HEADER_IMAGE;
import static com.example.android.activityscenetransitionbasic.DetailActivity.VIEW_NAME_HEADER_TITLE;

public class DetailDetailActivity extends AppCompatActivity {


    private Item mItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_detail);

        ViewCompat.setTransitionName(findViewById(R.id.imageview_item), VIEW_NAME_HEADER_IMAGE);

        mItem = Item.getItem(getIntent().getIntExtra(DetailActivity.EXTRA_PARAM_ID, 0));
        loadFullSizeImage();
    }

    /**
     * Load the item's full-size image into our {@link ImageView}.
     */
    private void loadFullSizeImage() {
        Picasso.with(this)
                .load(mItem.getPhotoUrl())
                .noFade()
                .noPlaceholder()
                .into((ImageView)findViewById(R.id.imageview_item));
    }
}
