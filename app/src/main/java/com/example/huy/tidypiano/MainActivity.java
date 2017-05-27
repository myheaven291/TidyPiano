package com.example.huy.tidypiano;

import android.nfc.Tag;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.toString();
    ImageView iv1, iv2, iv3, iv4, iv5, iv6, iv7, iv8, iv9, iv10, iv11, iv12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        iv1 = (ImageView) findViewById(R.id.iv_1);
        iv2 = (ImageView) findViewById(R.id.iv_2);
        iv3 = (ImageView) findViewById(R.id.iv_3);
        iv4 = (ImageView) findViewById(R.id.iv_4);
        iv5 = (ImageView) findViewById(R.id.iv_5);
        iv6 = (ImageView) findViewById(R.id.iv_6);
        iv7 = (ImageView) findViewById(R.id.iv_7);
        iv8 = (ImageView) findViewById(R.id.iv_8);
        iv9 = (ImageView) findViewById(R.id.iv_9);
        iv10 = (ImageView) findViewById(R.id.iv_10);
        iv11 = (ImageView) findViewById(R.id.iv_11);
        iv12 = (ImageView) findViewById(R.id.iv_12);

        iv1.setImageResource(R.drawable.default_white_key);
        iv2.setImageResource(R.drawable.default_white_key);
        iv3.setImageResource(R.drawable.default_white_key);
        iv4.setImageResource(R.drawable.default_white_key);
        iv5.setImageResource(R.drawable.default_white_key);
        iv6.setImageResource(R.drawable.default_white_key);
        iv7.setImageResource(R.drawable.default_white_key);
        iv8.setImageResource(R.drawable.default_black_key);
        iv9.setImageResource(R.drawable.default_black_key);
        iv10.setImageResource(R.drawable.default_black_key);
        iv11.setImageResource(R.drawable.default_black_key);
        iv12.setImageResource(R.drawable.default_black_key);

        iv1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        Log.d(TAG, "onTouch: Pressed");
                        iv1.setImageResource(R.drawable.pressed_white_key);
                    } break;
                    case MotionEvent.ACTION_UP: {
                        Log.d(TAG, "onTouch: Released");
                        iv1.setImageResource(R.drawable.default_white_key);
                    } break;
                }
                return false;
            }
        });
    }
}