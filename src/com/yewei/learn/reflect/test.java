package com.yewei.learn.reflect;

public class test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {  
	            Class<?> c = Class.forName("com.yewei.learn.reflect.People");  
	            
	            Animal inter = (Animal) c.newInstance();  
	            
	            System.out.println(inter.eat());  //�ӿڷ���
	            System.out.println(inter.getYourType());   //�����෽��
	            
            	Class<?> c2 = Class.forName("com.yewei.learn.reflect.Dog");  
	            
	            Animal inter2 = (Animal) c2.newInstance();  
	            
	            System.out.println(inter2.eat());  //�ӿڷ���
	            System.out.println(inter2.getYourType());   //�����෽��
	            
	        } catch (ClassNotFoundException e) {  
	            e.printStackTrace();  
	        } catch (InstantiationException e) {  
	            e.printStackTrace();  
	        } catch (IllegalAccessException e) {  
	            e.printStackTrace();  
	        }  
		
	}

}
