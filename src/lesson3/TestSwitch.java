package lesson3;

import java.util.Scanner;

public class TestSwitch {

	public static void main(String[] args) {
		// switch语句:byte short int char  String
		//用户输入数字，1 显示星期一    2 3 4 5 6 7 
		System.out.println("请输入一个整数：");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		switch(x){
			case 1:  System.out.println("星期一");
			         break;
			case 2:  System.out.println("星期二");
	         		   
			case 3:  System.out.println("星期三");
    		 		
			case 4:  System.out.println("星期四");
    		 		
			case 5:  System.out.println("星期五");
    		 		
			case 6:  System.out.println("星期六");
    		 		
			case 7:  System.out.println("星期日");
    		 		
    		default:
    			   System.out.println("输入有误");
		 		  
		}
		
		//输入 星期一 ，打印  “数字为1” ，星期二  打印  “数字为2”
		System.out.println("请输入星期，例如：一");
		String str=sc.next();
		switch("星期"+str){
		
		   case "星期一":System.out.println("数字为1");
	 					break;
		   default:   System.out.println("数字有误");
           break;
		   case "星期二":System.out.println("数字为2");
						break;
		   case "星期三":System.out.println("数字为3");
						break;
		  
		}
		
		//将以上代码改写成 if语句
		
	}

}
