package com.yewei.learn.objet.clone;

public class Person implements Cloneable{

    public String name;

    
	@Override
	protected Object clone() throws CloneNotSupportedException  {
		// TODO Auto-generated method stub
		return super.clone();
	}


	public Person(String name) {
		this.name = name;
	}
    
	//需要用到clone方法，那么，该类需要实现Cloneable接口，并且重写clone方法。
	 
}
