package com.hkr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // branch test
        test();
    }

    public static void test(){
        System.out.println("Test method");
    }

    public static void master(){
        System.out.println("Method in master");
    }
}