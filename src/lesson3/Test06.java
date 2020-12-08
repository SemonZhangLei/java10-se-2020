package lesson3;

public class Test06 {

	public static void main(String[] args) {
		// 1到100的所有奇数相加  1+3+5+....+99=2500
		String str="";
		int  sum=0;//和
		//求和
		int x=1;//当前数
		while(x<=100){
			//奇数 :1 3 5 7 9 11 ,  %2=1
			if(x%2==1){ //x%2!=0
				sum+=x;
				//字符串拼接:不是最后一个数拼接+号，最后一个数不拼接+号
				if(x==99){  //str=1+3  
					str+=x;//  str=str+x   1+3+5
				}else{
					str+=x+"+";
				}
				
			}
			x++;
		}
		//打印和
		System.out.println(str+"="+sum);

	}

}
