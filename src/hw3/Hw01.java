package hw3;

import java.util.Scanner;

public class Hw01 {

	public static void main(String[] args) {
		// 输入一个成绩a，使用switch结构求出a的等级。
		//A：90-100    9-10，B：80-89， 8, C：70-79，7 D：60-69， 6 E：0~59  0-5
	    int num=1;
		while(num<=16){	
		System.out.println("输入一个成绩：0-100");
		Scanner sc=new Scanner(System.in);
		
		//switch结构 表达式类型 byte short  int  char String
		int score=sc.nextInt();
		if(score<0||score>100){
			System.out.println("输入的成绩有误");
		}else{
			switch(score/10){ //95
			   case  9: 
			   case  10: System.out.println("等级是A"); break;
			   case 8:System.out.println("等级是B"); break;
			   case 7:System.out.println("等级是C"); break;
			   case 6:System.out.println("等级是D"); break;
			   default: System.out.println("等级是E");break;
			}
			 num++;
		}
	  }
	 
	}

}
