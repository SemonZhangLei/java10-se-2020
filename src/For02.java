import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		// 循环得到用户从控制台输入的5个整数，该整数为用户购买商品的价格，计算用户一共需要花费的总金额。
		int sum=0;
		//计算总金额
		Scanner  sc=new Scanner(System.in);

		for(int i=1;i<=5;i++){
				System.out.println("请输入商品价格："+i);
				int price=sc.nextInt();//价格
				sum+=price;//sum=sum+price;
		}
		

		System.out.println("用户一共需要花费的总金额是"+sum);
	}

}
