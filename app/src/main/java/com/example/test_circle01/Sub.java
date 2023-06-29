package com.example.test_circle01;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Sub extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_sub);

        // 前画面から入力値を受け取る
        Intent intent = getIntent();
//        int[5] date = intent.getIntArrayExtra(MainActivity.EXTRA_DATA);
    }
}
