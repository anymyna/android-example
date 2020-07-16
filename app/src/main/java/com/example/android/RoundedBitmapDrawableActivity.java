package com.example.android;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;


public class RoundedBitmapDrawableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rounded_bitmap);


        ImageView imageView = findViewById(R.id.rounded_bitmap_drawable_circle);
        RoundedBitmapDrawable circleDrawable = RoundedBitmapDrawableFactory.create(getResources(), BitmapFactory.decodeResource(getResources(), R.drawable.magazine));
        circleDrawable.setCircular(true);
        imageView.setImageDrawable(circleDrawable);



        imageView = findViewById(R.id.rounded_bitmap_drawable_corner);
        circleDrawable = RoundedBitmapDrawableFactory.create(getResources(), BitmapFactory.decodeResource(getResources(), R.drawable.magazine));
        circleDrawable.setCornerRadius(50f);
        imageView.setImageDrawable(circleDrawable);



    }
}
