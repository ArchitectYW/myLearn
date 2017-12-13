package com.yewei.learn.getbyapi;

import java.io.IOException;

import org.apache.http.client.HttpClient;


import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class WebUtils {
	private static HttpClient localWebHttpClient = newHttpClient(10);
	
    public static HttpClient newHttpClient(int timeoutsec) {
        HttpParams httpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(httpParams, 1000 * timeoutsec);
        HttpConnectionParams.setSoTimeout(httpParams, 1000 * timeoutsec);
        HttpClient httpClient = new DefaultHttpClient(httpParams);
        return httpClient;
    }
    
	public static String getContentFromURL(String url, String encoding) throws IOException {
        HttpGet get = new HttpGet(url);
        HttpResponse result = localWebHttpClient.execute(get);
        return EntityUtils.toString(result.getEntity(),encoding);
    }
	

    public static String getContentFromURL(String url) throws IOException {
        return getContentFromURL(url, "UTF-8");
    }
    
}