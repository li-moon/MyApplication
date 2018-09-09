package com.example.administrator.myapplication;
import android.content.Context;

import com.android.volley.toolbox.Volley;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import android.content.Context;



public class RequestQueueManager {
    private static RequestQueue mqueue = null;
    private static RequestQueueManager mInstance;
    private static Context mCtx;

    private RequestQueueManager(Context context)
    {
        mCtx = context;
        mqueue = Volley.newRequestQueue(mCtx.getApplicationContext());
    }

    public static synchronized RequestQueue getInstance(Context context)
    {
        if(mqueue == null)
        {
            new RequestQueueManager(context);
        }
        return mqueue;
    }
}
