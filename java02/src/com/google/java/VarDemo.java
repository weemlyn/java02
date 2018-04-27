package com.google.java;

/**
 * Java 变量
 * 
 * @author SONG
 *
 */
public class VarDemo {
  public static void main(String[] args) {
    // 整型:
    byte b = 127; // 8 位; 1 个字节
    int age = 1888888888; // 32位; 4 个字节
    long l = 1000; // 64位; 8 个字节
    l = 99L;
    l = 88l; // 99是int;此处说明是 long

    // 非整型
    float f = 99; // 32位;4 个字节
    double d = 100.99; // 64位; 8 个字节
    d = 100d;

    // 布尔型
    boolean isMarried = true; // 1 位
    isMarried = false;

    // 字符型
    char c = 'a'; // 16位,2个字节
    c = '中'; // 一个汉字2个字节;一个英文字母1个字节

    // 字符串类型(类类型)
    String s = "Hi..";

    // 字符串拼接
    System.out.println(b + " " + age + " " + l + " " + f + " " + d + " " + isMarried + " " + c + " " + s);

    // 先计算小括号里的值然后输出
    System.out.println((age + l));
    // 先计算然后输出 [+ 计算]
    System.out.println(age + l);
    // + 拼接
    System.out.println(" " + age + l);
    // 先计算然后拼接
    System.out.println(" " + (age + l));
  }

}
