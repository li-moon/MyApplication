package com.example.administrator.myapplication;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import android.content.Context;
import android.widget.TextView;

import java.util.TreeMap;

public class GetSinaStock {

    public GetSinaStock(){

    }


    public void querySinaStocks(Context context,String list,Response.Listener<String> mlistener){
        String url ="http://hq.sinajs.cn/list=" + list;
        //http://hq.sinajs.cn/list=sh600000,sh600536

        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, mlistener,
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                    }
                });
        RequestQueueManager.getInstance(context).add(stringRequest);
    }
}
