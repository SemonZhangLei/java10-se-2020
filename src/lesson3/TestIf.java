package lesson3;

import java.util.Scanner;

public class TestIf {

    public static void main(String args[]){
    	//将以上代码改写成 if语句   输入数，显示 字符串
    	System.out.println("请输入整数");
    	
    	Scanner sc=new Scanner(System.in);
    	int x=sc.nextInt();
    	
    	if(x==1){
    		System.out.println("星期一");
    	}else if(x==2){
    		System.out.println("星期二");
    	}else if(x==3){
    		System.out.println("星期三");
    	}else{
    		System.out.println("输入有误");
    	}
    	
    	//输入字符串 显示数字
    	System.out.println("请输入星期：星期-");
    	//字符串：引用类型，值的比较 equals()  ,==比较的是地址
    	String str=sc.next();
    	if(str.equals("星期一")){
    		System.out.println("1111");
    	}else if(str.equals("星期二")){
    		System.out.println("2222");
    	}else if(str.equals("星期三")){
    		System.out.println("3333");
    	}else{
    		System.out.println("输入有误");
    	}
    }

}
