import java.util.Random;
import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		/*
			随机产生一个10以内的正整数，用户循环输入三个整数，如果用户输入的整数包含随机数，输出“猜对了”；反之，输出“没猜到”。
			例如：
			随机数为4，用户输入数为：2,3,4。输出：猜对了
			随机数为4，用户输入数为：1,2,3。输出：没猜到
		*/	
		Random ran=new Random();
		int x=ran.nextInt(10);
	    System.out.println("随机数"+x);
	    
	    Scanner  sc=new Scanner(System.in);
	     //循环输入三次
	    boolean f=false;//标志   false 错      true 对
	    int b=0;// 标志  0 代表 错  1  对
	    for(int i=1;i<=3;i++){
	    	System.out.println("请猜数：");
	    	int y=sc.nextInt();
	    	//判断是否相等
	    	if(x==y){
	    		System.out.println("猜对了");
	    		f=true;
	    		break;
	    		//b=1;
	    	}
	    }
	    if(!f){//f==false
	    	System.out.println("猜错了");
	    }
	    /*if(b==0){
	    	System.out.println("猜错了");
	    }*/
	    
	    
	     
	}

}
