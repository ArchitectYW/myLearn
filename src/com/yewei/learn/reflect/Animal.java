package com.yewei.learn.reflect;

public abstract class Animal implements InterfaceA{

	public String say(){
		return "every animal can say!";
	}
	
	public abstract String getYourType();  
	
}
