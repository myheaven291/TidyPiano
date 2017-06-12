package com.example.huy.tidypiano;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{
    private static final String TAG = MainActivity.class.toString();
    private List<ImageView> blackKeys;
    private List<ImageView> whiteKeys;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        blackKeys = new ArrayList<>();
        whiteKeys = new ArrayList<>();

        blackKeys.add((ImageView)findViewById(R.id.iv_black_1));
        blackKeys.add((ImageView)findViewById(R.id.iv_black_2));
        blackKeys.add((ImageView)findViewById(R.id.iv_black_3));
        blackKeys.add((ImageView)findViewById(R.id.iv_black_4));
        blackKeys.add((ImageView)findViewById(R.id.iv_black_5));

        whiteKeys.add((ImageView)findViewById(R.id.iv_white_1));
        whiteKeys.add((ImageView)findViewById(R.id.iv_white_2));
        whiteKeys.add((ImageView)findViewById(R.id.iv_white_3));
        whiteKeys.add((ImageView)findViewById(R.id.iv_white_4));
        whiteKeys.add((ImageView)findViewById(R.id.iv_white_5));
        whiteKeys.add((ImageView)findViewById(R.id.iv_white_6));
        whiteKeys.add((ImageView)findViewById(R.id.iv_white_7));
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        for(ImageView blackKey : blackKeys){
            if(isInside(event.getX(), event.getY(), blackKey )){
                Log.d(TAG, "Black" +" "+ blackKey.getTag());
            }
        }

        for(ImageView whiteKey : whiteKeys){
            if(isInside(event.getX(), event.getY(), whiteKey))
            Log.d(TAG, "White" +" "+ whiteKey.getTag());
        }
        return super.onTouchEvent(event);
    }
    public boolean isInside(float x, float y, View v){
        int[] location = new int[2];
        v.getLocationOnScreen(location);
        int left = location[0];
        int top = location[1];
        int right = left + v.getWidth();
        int bot = top + v.getHeight();

        return x > left && x < right && y > top && y < bot;
    }
}