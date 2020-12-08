package practice;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// 题目：输入三个整数x,y,z，请把这三个数由小到大输出。
		//认定  x最小   y中间   z最大
		Scanner sc=new Scanner(System.in);
		System.out.println("输入三个整数");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		System.out.println("排序前"+x+","+y+","+z);
		//排序：  转化 找不符合   x最小   y中间   z最大的情况
		//x>y  交换x,y 
		//x>z  交换x,z
		//y>z  交换与y,z
		if(x>y){
			//交换
			int t=x;
			x=y;
			y=t;
		}
		if(x>z){
			//交换
			int t=x;
			x=z;
			z=t;
		}
		if(y>z){
			//交换
			int t=y;
			y=z;
			z=t;
		}
		
		
		System.out.println("排序后"+x+"<"+y+"<"+z);
		
		//3求 从大到小
		//  x最大  y中间  z最小的     ：x<y   x<z   y<z

	}

}
