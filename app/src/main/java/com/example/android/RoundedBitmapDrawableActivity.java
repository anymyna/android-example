package com.example.android;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import com.example.android.round.RoundedImageView;


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



        RoundedImageView imageView3 = (RoundedImageView)findViewById(R.id.bitmap_drawable_corner_3);
        imageView3.setImageResource(R.drawable.magazine);




        imageView = findViewById(R.id.bitmap_drawable_corner_4);
//        imageView3.setImageResource(R.drawable.magazine);


        Bitmap bitmap=BitmapFactory.decodeResource(getResources(),R.drawable.magazine);
        Bitmap target=Bitmap.createBitmap(bitmap.getWidth(),bitmap.getHeight(),bitmap.getConfig());
        BitmapShader shader=new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Paint paint=new Paint();
        paint.setShader(shader);
        Canvas canvas=new Canvas(target);
        target=Bitmap.createBitmap(target.getWidth(),target.getHeight(),target.getConfig());
        canvas.setBitmap(target);
        RectF rect=new RectF(0,0,target.getWidth(),target.getHeight());
        canvas.drawRoundRect(rect,100,100,paint);
        imageView.setImageBitmap(target);


    }
}
