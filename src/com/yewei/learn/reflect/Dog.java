package com.yewei.learn.reflect;

public class Dog extends Animal{  
	
	    @Override  
	    public String eat() {  
	        return "dog eat:"+this.getClass().getName();  
	    }

		@Override
		public String getYourType() {
			// TODO Auto-generated method stub
			return "dog สวนท";
		}  
	  
	}  