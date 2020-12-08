package hw3;

public class Hw05 {

	public static void main(String[] args) {
		// 编写一个程序，找出大于200的最小的质数
		int x=200;
		while(x<=10000){//数据范围，打印素数的次数
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
				break;//找一个素数就退出
			}
			x++;
		}

	}

}
