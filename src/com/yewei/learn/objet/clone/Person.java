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
    
	//��Ҫ�õ�clone��������ô��������Ҫʵ��Cloneable�ӿڣ�������дclone������
	 
}
