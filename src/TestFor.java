
public class TestFor {

	public static void main(String[] args) {
		// 1��100�������������
		
         for(int i=1;i<=100;i++){
        	 //����
        	 if(i%2==1){
        		 System.out.println(i);
        	 }
         }
        
         //1��100������������
         int sum=0;//�����    sum=1+3+5+7+9+11....+99      
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
         
         System.out.println("1��100����������"+sum);
        
	}

}
