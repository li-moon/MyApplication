package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StockDetailActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_detail);

        Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");

        //将获取的值显示在TextView上
        TextView textView = findViewById(R.id.textView);
        textView.setText(data.toString());


    }
}
