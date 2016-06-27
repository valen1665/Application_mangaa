package com.example.valen.application_manga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity_ensayo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_ensayo);

        Intent intent = new Intent( Activity_ensayo.this,MainActivity_change.class);
        startActivity(intent);
    }
}
