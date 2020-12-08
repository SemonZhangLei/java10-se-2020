
public class TestFor {

	public static void main(String[] args) {
		// 1到100的所有奇数输出
		
         for(int i=1;i<=100;i++){
        	 //奇数
        	 if(i%2==1){
        		 System.out.println(i);
        	 }
         }
        
         //1到100的所有奇数和
         int sum=0;//保存和    sum=1+3+5+7+9+11....+99      
          /*x=1    sum=0+1  
            x=3     sum=0+1+3
            x=5     sum=0+1+3+5
              7     sum=0+1+3+5+7 
            x=n      sum=0+1+3+5+7+....+n
           */         
         for(int i=1;i<=100;i++){
        	 if(i%2==1){
        		 sum=sum+i;
        	 }
         }
         
         System.out.println("1到100的奇数和是"+sum);
        
	}

}
