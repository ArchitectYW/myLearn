package com.yewei.learn.getbyapi;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import org.json.JSONObject;

import com.rabbitmq.client.GetResponse;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Weather we = Test.getResponse("http://www.sojson.com/open/api/weather/json.shtml?city=����",Weather.class);
		
		System.out.println(we.toString());
	}
	
	public static <Tp> Tp getResponse(String requestURL, Class<Tp> responseModel) throws Exception{
	    String wechatResponse = WebUtils.getContentFromURL(requestURL.trim());
	    JSONObject responseJSON = new JSONObject(wechatResponse);
	    int errorcode = responseJSON.optInt("status");
	    if (errorcode != 200) {
	    	//�жϺϷ���
	    	System.out.println("ʧ��");
	    	
	    } else {
	        return ObjectMapperUtils.getDefaultJSONMapper().readValue(wechatResponse,responseModel);
	    }
		return null;
    } 

}





