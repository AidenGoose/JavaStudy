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
    /*
     * 基础数据类型：byte boolean char short long int float double
     */

    /*
     * 操作字符串类型
     * String StringBuffer StringBuilder
     * String 对象不可变
     * StringBuffer and StringBuilder 可以操作原有对象
     * Buffer线程安全， Builder非线程安全
     */
    
    /*
     * String str = "i"
     */
    public static void newString() {
        // s会被分配到常量池
        String s = "i";
        // str会被分配到堆内存
        String str = new String("i")；
    }

    /*
     * 接口和抽象类的区别
     * 实现： 抽象类的子类由extend继承， 接口必须用implements实现接口
     * 构造函数： 抽象类可以有构造函数， 接口不能有
     * main方法：抽象类可以有main方法，接口不能有main方法
     * 实现数量：类可以实现很多接口，但只能继承一个抽象类
     * 访问修饰符：接口中方法默认使用public， 抽象类可以任意访问修饰符
     */
}