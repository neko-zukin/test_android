package com.example.test_circle01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String EXTRA_DATA  = "com.example.test_circle01.DATA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button2).setOnClickListener(this);
    }

    // ボタンが押された場合
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplication(), Sub.class);
        int[] data1 = {1,2,3,4,5};
        int[] data2 = {11,12,13,14,15};
        intent.putExtra(EXTRA_DATA, data1);
        intent.putExtra(EXTRA_DATA, data2);
//        startActivity(intent);
    }
}