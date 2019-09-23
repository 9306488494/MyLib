package com.example.lib;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.Cache;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class Analytics {
    // Save Analytics
    public static String setUsers(final Context context, final String Unique_app_id) {

        final String[] response = new String[1];
RequestQueue queue;
        Cache cache1 = new DiskBasedCache(context.getCacheDir(), 1024 * 1024);
        Network network1 = new BasicNetwork(new HurlStack());

        queue = new RequestQueue(cache1, network1);
        queue.start();
        StringRequest request = new StringRequest(Request.Method.POST, Config.prop_country, new Response.Listener<String>() {
            @Override
            public void onResponse(String response1) {
            response[0] =response1;
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(context,"Server not responding", Toast.LENGTH_SHORT).show();
            }
        }) {
            @Override
            public Map<String, String> getParams() {
                Map<String, String> mydata = new HashMap<>();
                mydata.put("id",Unique_app_id);
                mydata.put("type","1");
                return mydata;
            }
        };
        int socketTimeout = 30000;
        RetryPolicy policy = new DefaultRetryPolicy(socketTimeout, DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        request.setRetryPolicy(policy);
        queue.add(request);
        return response[0];
    }

    // Get unique users
    public static String getUniqueUser(final Context context, final String Unique_app_id) {
        final String[] response = new String[1];
        RequestQueue queue;
        Cache cache1 = new DiskBasedCache(context.getCacheDir(), 1024 * 1024);
        Network network1 = new BasicNetwork(new HurlStack());

        queue = new RequestQueue(cache1, network1);
        queue.start();
        StringRequest request = new StringRequest(Request.Method.POST, Config.prop_country, new Response.Listener<String>() {
            @Override
            public void onResponse(String response1) {
                response[0] =response1;
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(context,"Server not responding", Toast.LENGTH_SHORT).show();
            }
        }) {
            @Override
            public Map<String, String> getParams() {
                Map<String, String> mydata = new HashMap<>();
                mydata.put("id",Unique_app_id);
                mydata.put("type","2");
                return mydata;
            }
        };
        int socketTimeout = 30000;
        RetryPolicy policy = new DefaultRetryPolicy(socketTimeout, DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        request.setRetryPolicy(policy);
        queue.add(request);
        return response[0];
    }

}
