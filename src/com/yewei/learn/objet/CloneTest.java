package com.yewei.learn.objet;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建一个Person对象，并初始化
        Person p1 = new Person("hello");
        System.out.println(p1.name);//hello
        
        /*
         * 调用clone方法，对p1对象进行克隆
         *     注意：当代码执行的时候，将会检查调用对象的类(或者父类)是否实现了java.lang.Cloneable接口(Object类不实现Cloneable)。
         *         如果没有实现这个接口，clone()将会抛出一个检查异常()——java.lang.CloneNotSupportedException,
         *         如果实现了这个接口，clone()会创建一个新的对象，并将原来对象的内容复制到新对象，最后返回这个新对象的引用。
         */
        //所以，此处会先检查Person类是否实现了Cloneable，即重写clone()方法。
        
        //Object 的clone方法是一个native方法
        // protected native Object clone() throws CloneNotSupportedException;

         
        Person p2 = (Person) p1.clone();
        System.out.println(p2.name);//hello
        
        
        
    }

}