package hw3;

public class Hw04 {

	public static void main(String[] args) {
		
		//break 退出循环
		//20以内的所有质数/素数（1 2 3 5 7 11 13） 只能被1和本身整除的数   %
		int x=1;  //素数     x 9   1 2 3 4 5 6 7 8  9 
		while(x<=300){//数据范围，打印素数的次数
			boolean flag=true;//是素数
			//判断是否是素数
			int i=2;//整除的数
			while(i<x){//整除次数   2 3 4 5 6 7 8
				if(x%i==0){//能被中间数整除 ，不是素数
					flag=false;
					break;
				}
				i++;
			}
			//是素数就打印
			if(flag){
				System.out.println(x);
			}
			x++;
		}
		
		

	}

}
