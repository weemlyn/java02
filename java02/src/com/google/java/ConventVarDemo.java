package com.google.java;

/**
 * Java 数据类型的转换
 * 
 * @author SONG
 *
 */
public class ConventVarDemo {
  public static void main(String[] args) {
    // 声明变量的两种方式:
    // 1.声明变量 salary,且赋初始值
    int salary = 9999;

    // 2.声明变量(没有赋值)
    int age;
    // 赋值
    age = 29;

    // 隐式转换:自动转换 (小类型转大类型)
    long l = salary;
    System.out.println(l);

    // 显式转换:强制转换 (大类型转小类型)
    age = (int) l;
    System.out.println(age);

    char c = 'a';
    int i = 0;
    i = c; // 输出 'a' 的 ASCLL码的值:97
    System.out.println(i);

    i = 65;
    c = (char) i; // 把 65 转换为对应的ASCLL码的字符 'A'
    System.out.println(c);
  }
}
