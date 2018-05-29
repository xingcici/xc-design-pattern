package com.elvin.test;

/**
 * @author : Haifeng Pang.
 * @version 0.1 : Test v0.1 2018/5/24 17:15 By Haifeng Pang.
 * @description :
 */
public class Test {

    public static void main(String[] args) {
        String a = "helloworld";

        //这里编译期间就生成在常量区
        final String b = "hello";
        String d = "hello";

        //这里b是个常量 编译期间直接优化成"hello2"
        String c = b + "world";

        //有间接应引用的存在 编译期间不会优化，最后生成在堆中
        String e = d + "world";

        System.out.println((a == c));
        System.out.println((a == e));
    }
}
