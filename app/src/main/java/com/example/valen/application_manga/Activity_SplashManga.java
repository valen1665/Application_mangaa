package com.example.valen.application_manga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import java.util.Timer;
import java.util.TimerTask;

public class Activity_SplashManga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity__splash_manga);

        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {

                Intent intent =new Intent(Activity_SplashManga.this,Activity_ensayo.class);
                startActivity(intent);
                finish();

            }
        };
        Timer timer = new Timer();
        timer.schedule(tarea,4000);
    }
}
