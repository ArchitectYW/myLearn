package com.yewei.learn.random;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
        //使用默认种子的构造器，以系统当前时间的毫秒数作为种子
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt(100)+",");
        }//5 0 2 6 5 0 4 1 4 9 
        
        /*使用带参数的构造器，传入一个long型整数作为种子
         *需要注意的是：
         * 相同种子数的Random对象，相同次数生成的随机数字是完全相同的。
         * 即是，两个种子数相同的Random对象，第一次生成的随机数完全相同，第二次生成的随机数也完全相同
         * 这点在生成多个随机数字时需要特别注意。
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
