
public class Test01 {
  public static void main(String[] args) {
	  //do while   100���������� ���ͣ��ܱ�3���������Լ���
/*	  int x=1;   //1 2 ...99
	  do{
		  System.out.println(x);
		  x++;
	  }while(x<100);*/
	  //�������
/*	  int x=100; // 99 98 ....2 1
	 do{
		  x--;
		  System.out.println(x);
	 }while(x>1);*/
	  
/*	  int sum=0;   //  1+2+3+4+��������+99
	  int x=1;
	  do{
		 sum+=x; 
		 x++;
	  }while(x<100);
	  
	  System.out.println("100���ڵĺ���"+sum);*/
	  
	  int x=1;
	  int sum=0;
	  do{
		  if(x%3==0){
			  System.out.println(x);  
			  sum+=x;
		  }
		 x++;
	  }while(x<100);
	  System.out.println("�ܱ�3����������"+sum);
	  
	  
}
}
