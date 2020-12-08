package lesson3;

public class Test05 {

	public static void main(String[] args) {
		// 1+2+3+…+100  和
		//1.定义变量保存和
		int sum=0;//保存和
		//2.通过循环求和
		int x=1;//保存当前的数 1-100  控制变量
		while(x<=100){
			 sum+=x;  //求和
			 x++;  //改变控制变量的值
			
		}
		//3.打印和
		 System.out.println("1-100的和是"+sum);
	}

}
