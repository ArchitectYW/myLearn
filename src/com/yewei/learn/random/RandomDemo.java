package com.yewei.learn.random;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
        //ʹ��Ĭ�����ӵĹ���������ϵͳ��ǰʱ��ĺ�������Ϊ����
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt(100)+",");
        }//5 0 2 6 5 0 4 1 4 9 
        
        /*ʹ�ô������Ĺ�����������һ��long��������Ϊ����
         *��Ҫע����ǣ�
         * ��ͬ��������Random������ͬ�������ɵ������������ȫ��ͬ�ġ�
         * ���ǣ�������������ͬ��Random���󣬵�һ�����ɵ��������ȫ��ͬ���ڶ������ɵ������Ҳ��ȫ��ͬ
         * ��������ɶ���������ʱ��Ҫ�ر�ע�⡣
         */
        Random r1 = new Random(10);
        Random r2 = new Random(10);
//        System.out.println();
//        System.out.println(r1.nextInt(100)+",");
//        System.out.println(r1.nextInt(100)+","+r2.nextInt(100));
//        System.out.println(r1.nextInt(100)+","+r2.nextInt(100));
        System.out.println(r1.nextInt() == r2.nextInt());//true
        System.out.println(r1.nextInt() == r2.nextInt());//true
	        
	}
}
