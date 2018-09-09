package com.example.administrator.myapplication;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

public class Get163Stock {
    public Get163Stock(){
    }


    public void query163Stocks(Context context, String list, Response.Listener<String> mlistener){

        String url ="http://quotes.money.163.com/service/chddata.html?code="+list+"&start=20180514&end=20180814&fields=TCLOSE;HIGH;LOW;TOPEN;CHG;PCHG;VOTURNOVER;VATURNOVER;TCAP;MCAP";

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
