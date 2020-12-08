package lesson3;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// 编写程序实现：用户输入商品名称，显示该商品的价格。
		System.out.println("输入商品名称:");
		Scanner sc=new Scanner(System.in);
		String name= sc.next();
		switch(name){
		case "可乐":  System.out.println(name+":2.5元/瓶");
		             break;
		case "雪碧":  System.out.println(name+":3元/瓶");
        			break;
		case "面包":  System.out.println(name+":6.5元/带");
					break;
	    default:  System.out.println("没有该商品");
	    			break;
		}

	}

}
