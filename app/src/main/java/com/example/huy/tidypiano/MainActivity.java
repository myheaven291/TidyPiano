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
                        iv1.setImageResource(R.drawable.pressed_white_key);
                        return true;
                    }
                    case MotionEvent.ACTION_UP: {
                        iv1.setImageResource(R.drawable.default_white_key);
                        return true;
                    }
                }
                return false;
            }
        });

        iv2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        iv2.setImageResource(R.drawable.pressed_white_key);
                        return true;
                    }
                    case MotionEvent.ACTION_UP: {
                        iv2.setImageResource(R.drawable.default_white_key);
                        return true;
                    }
                }
                return false;
            }
        });

        iv3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        iv3.setImageResource(R.drawable.pressed_white_key);
                        return true;
                    }
                    case MotionEvent.ACTION_UP: {
                        iv3.setImageResource(R.drawable.default_white_key);
                        return true;
                    }
                }
                return false;
            }
        });

        iv4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        iv4.setImageResource(R.drawable.pressed_white_key);
                        return true;
                    }
                    case MotionEvent.ACTION_UP: {
                        iv4.setImageResource(R.drawable.default_white_key);
                        return true;
                    }
                }
                return false;
            }
        });

        iv5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        iv5.setImageResource(R.drawable.pressed_white_key);
                        return true;
                    }
                    case MotionEvent.ACTION_UP: {
                        iv5.setImageResource(R.drawable.default_white_key);
                        return true;
                    }
                }
                return false;
            }
        });

        iv6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        iv6.setImageResource(R.drawable.pressed_white_key);
                        return true;
                    }
                    case MotionEvent.ACTION_UP: {
                        iv6.setImageResource(R.drawable.default_white_key);
                        return true;
                    }
                }
                return false;
            }
        });

        iv7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        iv7.setImageResource(R.drawable.pressed_white_key);
                        return true;
                    }
                    case MotionEvent.ACTION_UP: {
                        iv7.setImageResource(R.drawable.default_white_key);
                        return true;
                    }
                }
                return false;
            }
        });

        iv8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        iv8.setImageResource(R.drawable.pressed_black_key);
                        return true;
                    }
                    case MotionEvent.ACTION_UP: {
                        iv8.setImageResource(R.drawable.default_black_key);
                        return true;
                    }
                }
                return false;
            }
        });

        iv9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        iv9.setImageResource(R.drawable.pressed_black_key);
                        return true;
                    }
                    case MotionEvent.ACTION_UP: {
                        iv9.setImageResource(R.drawable.default_black_key);
                        return true;
                    }
                }
                return false;
            }
        });

        iv10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        iv10.setImageResource(R.drawable.pressed_black_key);
                        return true;
                    }
                    case MotionEvent.ACTION_UP: {
                        iv10.setImageResource(R.drawable.default_black_key);
                        return true;
                    }
                }
                return false;
            }
        });

        iv11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        iv11.setImageResource(R.drawable.pressed_black_key);
                        return true;
                    }
                    case MotionEvent.ACTION_UP: {
                        iv11.setImageResource(R.drawable.default_black_key);
                        return true;
                    }
                }
                return false;
            }
        });

        iv12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        iv12.setImageResource(R.drawable.pressed_black_key);
                        return true;
                    }
                    case MotionEvent.ACTION_UP: {
                        iv12.setImageResource(R.drawable.default_black_key);
                        return true;
                    }
                }
                return false;
            }
        });
    }
}