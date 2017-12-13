package com.yewei.learn.getbyapi;

public class Data {
	private int wendu;
	private String ganmao;
	private int aqi;
	private String city;
	
	
	@Override
	public String toString() {
		return "Data [wendu=" + wendu + ", ganmao=" + ganmao + ", aqi=" + aqi
				+ ", city=" + city + "]";
	}
	public int getWendu() {
		return wendu;
	}
	public void setWendu(int wendu) {
		this.wendu = wendu;
	}
	public String getGanmao() {
		return ganmao;
	}
	public void setGanmao(String ganmao) {
		this.ganmao = ganmao;
	}

	public int getAqi() {
		return aqi;
	}
	public void setAqi(int aqi) {
		this.aqi = aqi;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}

