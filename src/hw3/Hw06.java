package hw3;

public class Hw06 {

	public static void main(String[] args) {
		// 由命令行输入一个4位整数，求将该数反转以后的数，如原数为1234，反转后的数位4321 
		int x=2143; 
		//个位   x/1%10   十位  x/10%10    百位  x/100%10   千位  x/1000%10  ...
		  //   1            2         3             4
		   // n位   x/10^(n-1)%10  
		int i=1;//位数，控制变量
		int cf=1;//10的次方
		int cz=1000;//乘以的值
		int s=0;//每位上的数
		int y=0;//反转后的值
		while(i<=4){
		  	 s=x/cf%10 ;
		  	 cf*=10;
		  	 //System.out.println(s);
		  	y+=s*cz;
		  	cz/=10;
		  	 i++;
		}
		System.out.println(x+"反转后的数是"+y);

	}

}
