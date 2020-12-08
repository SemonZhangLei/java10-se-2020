package lesson3;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("请输入月份：");
		//用户指定：输入
		Scanner sc=new Scanner(System.in);
		//1.月份
		int month=sc.nextInt();
		//2.输出该月份的天数
		//System.out.println("该月份有30天");//4、6、9、11月天数为30
		//System.out.println("该月份有28天");
		//System.out.println("该月份有31天");//1、3、5、7、8、10、12
		switch(month){
		case 1:  
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("该月份有31天");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("该月份有30天");
			break;
		case 2:
			System.out.println("该月份有28天");
			break;
	    default:
	    	System.out.println("输入有误");
			break;
		}
		

	}

}
