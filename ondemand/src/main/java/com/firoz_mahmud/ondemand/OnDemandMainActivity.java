package com.firoz_mahmud.ondemand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.play.core.splitcompat.SplitCompat;

public class OnDemandMainActivity extends AppCompatActivity {

    private Button playBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_demand_main);

        initComponent();
        setListener();
    }

    private void initComponent() {

        playBtn = findViewById(R.id.playBtn);
    }

    private void setListener() {

        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(OnDemandMainActivity.this, VideoViewActivity.class));
            }
        });
    }


    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
        SplitCompat.install(this);
    }
}