package com.yewei.learn.getbyapi;

import org.json.JSONObject;

public class Weather {
	private int status;
	private Data data;
	private String message;
	

	@Override
	public String toString() {
		return "Weather [status=" + status + ", data=" + data + ", message="
				+ message + "]";
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
