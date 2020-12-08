package hw3;

public class Hw03 {

	public static void main(String[] args) {
		// 编写一个程序，求整数n的阶乘，例如5的阶乘是 5！=1*2*3*4*5 =120
		String str="";
		int x=15;      // 1*2*3*.....*15
		long result=1;//阶乘
		int i=1;//乘次数    控制变量
		while(i<=x){//乘次数
			result=result*i;
			if(i==x){
				str=str+i;
			}else{
				str=str+i+"*";
			}
			i++;
		}
		
		System.out.println(x+"！="+str+" = "+result);
		
		//逆向     15*14*13*12.....*3*2*1
/*		int x=15,y=x;
		long result=1;
		String str="";
		while(x>=1){
			result=result*x;
			if(x==1){
				str=str+x;
			}else{
				str=str+x+"*";
			}
			
			x--;
		}
		System.out.println(y+"！="+str+" = "+result);*/
       
	}

}
