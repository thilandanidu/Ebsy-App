package com.thilandanidu.android.ebsy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.thilandanidu.android.ebsy.Activity.LoginActivity;

public class SplashActivity extends AppCompatActivity {

    private TextView mTvText,mTvCopy;
    private ImageView mImgView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

//        mTvText = findViewById(R.id.text_icon_text);
        mImgView = findViewById(R.id.splash_image);
        mTvCopy = findViewById(R.id.text_icon_text_copy);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.my_animation);
//        mTvText.startAnimation(animation);
        mImgView.startAnimation(animation);
        mTvCopy.startAnimation(animation);
        final Intent intent = new Intent(this,LoginActivity.class);
        Thread timer = new Thread(){

            public void run(){

                try {
                    sleep(7000);

                }catch (Exception f){

                }finally {
                    startActivity(intent);
                    finish();
                }
            }
        };

        timer.start();
    }
}