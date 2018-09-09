package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Response;

public class StockDetailActivity extends AppCompatActivity {

    private static Get163Stock get163Stock = new Get163Stock();

    Response.Listener<String> m163listener = new Response.Listener<String>() {
        @Override
        public void onResponse(String response) {
            String str = null;
            try{
                str = new String(response.getBytes("ISO-8859-1"),"GBK");
            }catch(java.io.UnsupportedEncodingException e){
                e.printStackTrace();
            }
            //将获取的值显示在TextView上
            TextView textView = findViewById(R.id.textView);
            textView.setText(str.toString());
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_detail);

        Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");
        String stockid = data.replaceAll("sz","1").replaceAll("sh","0");
        System.out.println(stockid);
        get163Stock.query163Stocks(this,stockid,m163listener);

    }
}
