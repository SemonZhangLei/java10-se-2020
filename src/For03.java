import java.util.Random;
import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		/*
			�������һ��10���ڵ����������û�ѭ��������������������û���������������������������¶��ˡ�����֮�������û�µ�����
			���磺
			�����Ϊ4���û�������Ϊ��2,3,4��������¶���
			�����Ϊ4���û�������Ϊ��1,2,3�������û�µ�
		*/	
		Random ran=new Random();
		int x=ran.nextInt(10);
	    System.out.println("�����"+x);
	    
	    Scanner  sc=new Scanner(System.in);
	     //ѭ����������
	    boolean f=false;//��־   false ��      true ��
	    int b=0;// ��־  0 ���� ��  1  ��
	    for(int i=1;i<=3;i++){
	    	System.out.println("�������");
	    	int y=sc.nextInt();
	    	//�ж��Ƿ����
	    	if(x==y){
	    		System.out.println("�¶���");
	    		f=true;
	    		break;
	    		//b=1;
	    	}
	    }
	    if(!f){//f==false
	    	System.out.println("�´���");
	    }
	    /*if(b==0){
	    	System.out.println("�´���");
	    }*/
	    
	    
	     
	}

}
