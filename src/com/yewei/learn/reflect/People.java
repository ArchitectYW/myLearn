package com.yewei.learn.reflect;

public class People extends Animal{  
	
	    @Override  
	    public String eat() {  
	        return "people eat:"+this.getClass().getName();  
	    }

		@Override
		public String getYourType() {
			// TODO Auto-generated method stub
			return "people  «»À¿‡";
		}  
	  
	}  