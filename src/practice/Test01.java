package practice;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		/*题目：有一款游戏的指令，输入A或a，完成“回头”动作，
		 * 输入D或d，完成“前进”,输入W或w,完成“跳跃”，
		 * 输入S或显示“蹲下”，输入其他命令，“操作有误”，
		 * 操作失败次数超过5次，退出游戏。*/
		Scanner sc=new Scanner(System.in);
		int error_count=0;//错误次数
		while(true){
			//输入
			System.out.println("你输入操作：A ，D S W ");
			String str=sc.next();
			//判断输入值
			if(str.equals("A")||str.equals("a")){
				System.out.println("回头");
			}else if(str.equals("D")||str.equals("d")){
				System.out.println("前进");
			}else if(str.equals("W")||str.equals("w")){
				System.out.println("跳跃");
			}else if(str.equals("S")||str.equals("s")){
				System.out.println("蹲下");
			}else{
				error_count++;
				if(5-error_count>0){
					System.out.println("操作有误,还剩"+(5-error_count)+"机会");
				}
				
				//操作有误，超过5次 ，退出
			    if(error_count>=5){
			    	System.out.println("错误次数已超过5次，game over!");
			    	break;
			    }
			}
		}
	}

}
