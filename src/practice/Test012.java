package practice;

import java.util.Scanner;

public class Test012 {

	public static void main(String[] args) {
		/*题目：有一款游戏的指令，输入A或a，完成“回头”动作，
		 * 输入D或d，完成“前进”,输入W或w,完成“跳跃”，
		 * 输入S或显示“蹲下”，输入其他命令，“操作有误”，
		 * 操作失败次数超过5次，退出游戏。*/
		
		Scanner sc=new Scanner(System.in);
		int error_count=0;//错误次数
	AAA:for(;;){
			//输入
			System.out.println("你输入操作：A ，D S W ");
			String str=sc.next();
			//判断输入值
	     switch(str.toLowerCase()){   //大写转小写
	           case "a":System.out.println("回头");break;
	           case "d":System.out.println("前进");break;
	           case "s":System.out.println("蹲下");break;
	           case "w":System.out.println("跳跃");break;
		       default:
	        	    error_count++;
	        	    if(5-error_count>0){
	        	    	 System.out.println("操作失败，还剩机会有"+(5-error_count)+"次");
	        	    }
	        	    if(error_count>=5){
	        	    	System.out.println("game over!");
	        	    	break AAA;  //退出循环
	        	    }
	        	  break ;//退出switch
	         }
		}
		
	}

}
