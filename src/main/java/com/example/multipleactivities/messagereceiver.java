package com.example.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class messagereceiver extends AppCompatActivity {

    public void onResetMesssage(View view) {
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messagereceiver);
    }
}