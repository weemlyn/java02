package test02;
/**
 * 
 * @author Weemlyn
 *
 */
public class ConvertVarDemo {

	public static void main(String[] args) {
		// 声明变量的两种方式
       int salary=9999;
       //声明变量salary并赋值
       int age;
       //声明变量（没有赋值）
       age=29;
       //赋值
       long l=salary;
       //隐式转换；自动转换（小类型转大类型）
       System.out.println(l);
       //显式转换；强制转换(大类型转小类型)
       age=(int)l;
       System.out.println(age);
       char b=97;
       System.out.println(b);
       
       char c='a';
       int i=0;
       i=c;//输出‘a'的ASCLL码的值；97
       System.out.println(i);
        
       i=65;
       c=(char)i;//把65转换为对应的ASCLL码的字符‘A’
       System.out.println(c);
       
	}

}
