package com.yewei.learn.log4j;


import org.apache.log4j.Logger;

public class MyLogTest {

	public static Logger logger1 = Logger.getLogger(MyLogTest.class);

	public static void main(String[] args) {
//		http://www.cnblogs.com/crazyacking/p/5456347.html#_label00  //���������վ
		
       logger1.trace("����logger1��trace");
       logger1.debug("����logger1��debug");
       logger1.info("����logger1��info");	
       logger1.warn("����logger1��warn");
       logger1.error("����logger1��error");
       logger1.fatal("����logger1��fatal");
       
       System.err.println("aaaaa");
	}
	
}
