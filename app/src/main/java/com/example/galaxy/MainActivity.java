package com.example.galaxy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Animation smtr, tvihy, button;
    ImageView imVi;
    TextView tv1, tv2;
    Button brtnn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        smtr = AnimationUtils.loadAnimation(this, R.anim.smtr);
        tvihy = AnimationUtils.loadAnimation(this, R.anim.tvihy_);
        button = AnimationUtils.loadAnimation(this, R.anim.button_);

        imVi = findViewById(R.id.imageView);
        tv1 = findViewById(R.id.textView);
        tv2 = findViewById(R.id.textView2);
        brtnn = findViewById(R.id.btn);

        imVi.startAnimation(smtr);
        tv1.startAnimation(tvihy);
        tv2.startAnimation(tvihy);
        brtnn.startAnimation(button);
    }
}
