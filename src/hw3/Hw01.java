package hw3;

import java.util.Scanner;

public class Hw01 {

	public static void main(String[] args) {
		// ����һ���ɼ�a��ʹ��switch�ṹ���a�ĵȼ���
		//A��90-100    9-10��B��80-89�� 8, C��70-79��7 D��60-69�� 6 E��0~59  0-5
	    int num=1;
		while(num<=16){	
		System.out.println("����һ���ɼ���0-100");
		Scanner sc=new Scanner(System.in);
		
		//switch�ṹ ���ʽ���� byte short  int  char String
		int score=sc.nextInt();
		if(score<0||score>100){
			System.out.println("����ĳɼ�����");
		}else{
			switch(score/10){ //95
			   case  9: 
			   case  10: System.out.println("�ȼ���A"); break;
			   case 8:System.out.println("�ȼ���B"); break;
			   case 7:System.out.println("�ȼ���C"); break;
			   case 6:System.out.println("�ȼ���D"); break;
			   default: System.out.println("�ȼ���E");break;
			}
			 num++;
		}
	  }
	 
	}

}
