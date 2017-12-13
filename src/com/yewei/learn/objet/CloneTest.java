package com.yewei.learn.objet;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        //����һ��Person���󣬲���ʼ��
        Person p1 = new Person("hello");
        System.out.println(p1.name);//hello
        
        /*
         * ����clone��������p1������п�¡
         *     ע�⣺������ִ�е�ʱ�򣬽�������ö������(���߸���)�Ƿ�ʵ����java.lang.Cloneable�ӿ�(Object�಻ʵ��Cloneable)��
         *         ���û��ʵ������ӿڣ�clone()�����׳�һ������쳣()����java.lang.CloneNotSupportedException,
         *         ���ʵ��������ӿڣ�clone()�ᴴ��һ���µĶ��󣬲���ԭ����������ݸ��Ƶ��¶�����󷵻�����¶�������á�
         */
        //���ԣ��˴����ȼ��Person���Ƿ�ʵ����Cloneable������дclone()������
        
        //Object ��clone������һ��native����
        // protected native Object clone() throws CloneNotSupportedException;

         
        Person p2 = (Person) p1.clone();
        System.out.println(p2.name);//hello
        
        
        
    }

}