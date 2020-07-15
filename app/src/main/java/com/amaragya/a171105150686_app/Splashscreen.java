package com.amaragya.a171105150686_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class Splashscreen extends AppCompatActivity {


    private LottieAnimationView lottie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        lottie = (LottieAnimationView) findViewById(R.id.watch_animation);
        lottie.setAnimation("26834-rocket.json");
        lottie.setSpeed(4f);
        lottie.playAnimation();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        },((int)lottie.getSpeed()) * lottie.getRepeatCount() * 100 );
    }
}
