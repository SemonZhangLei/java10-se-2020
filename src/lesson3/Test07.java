package lesson3;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// 1-1000以内 ， 含有7  7的倍数“沉默”  ，其他 显示 数
		System.out.println("请指定数据范围");
		Scanner sc=new Scanner(System.in);
		int max=sc.nextInt();
		System.out.println("数据范围是1-"+max);
		int x=1;//当前的数
		while(x<=max){
			//含有7  7的倍数“沉默”
			//含有7    17  71  170   701  777
			int g=x%10;
			int s=x/10%10;
			int b=x/100%10;  //721
			if(x%7==0||g==7||s==7||b==7){
				System.out.println("沉默");
			}else{
				System.out.println(x);
			}
			
			x++;
		}
		
		//25 思考：一桌就16个人，第一轮：1 2 3 4   16   第二轮 沉默 18   25
		
		
		

	}

}
