package com.citi.foundation;

public class First {
    public static void main(String[] args) {
        equal();
        hashEquals();
        mathRound();
    }
    
    // JDK和JRE的区别
    /*
     * JDK: Java Development Kit简称， Java开发工具包， 提高Java的开发环境和运行环境.
     * JRK: Java Runtime Environment， Java运行环境， 为Java的运行提供了所需的环境.
     */
    // ==和equals的区别 
    /*
     * ==基本数据类型： 比较值
     * 引用类型：比较引用是否相同
     * equals： 只比较值
     */
    public static void equal() {
        String s1 = "string";
        String s2 = "string";
        String s3 = new String("string");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
    //两个对象的hashCode相同， 则equals也相同
    public static void hashEquals() {
        String string1 = "通话";
        String string2 = "重地";
        System.out.println(String.format("string1: %d | string2: %d", string1.hashCode(), string2.hashCode()));
        System.out.println(string1.equals(string2));
    }
    //final在Java中有什么作用
    /*
     * final修饰的类叫最终类， 该类不可被继承
     * final修饰的方法不能被重写
     * final修饰的变量叫常量， 常量必须初始化， 初始化之后值不可被修改
     */
    //Java中 Math.round(-1.5)
    public static void mathRound() {
        System.out.println(Math.round(-1.5));
    }

}