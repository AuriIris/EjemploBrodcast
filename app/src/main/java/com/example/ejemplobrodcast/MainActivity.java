package com.example.ejemplobrodcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private CambioAvion ca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onResume() {
        super.onResume();
        ca=new CambioAvion();
        registerReceiver(ca,new IntentFilter("android.intent.action.AIRPLANE:MODE"));

    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(ca);
    }
}