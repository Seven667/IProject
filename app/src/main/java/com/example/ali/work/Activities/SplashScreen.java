package com.example.ali.work.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.ali.work.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        int secondsDelayed = 3;
        Animation myanimation = AnimationUtils.loadAnimation(this,R.anim.splashanimation);
        /*RelativeLayout imageView = (RelativeLayout) findViewById(R.id.splash_screen);*/
        /*imageView.startAnimation(myanimation);*/
        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
                finish();
            }
        }, secondsDelayed * 1000);

    }
}
