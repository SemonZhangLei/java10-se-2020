package lesson3;

import java.util.Scanner;

public class TestSwitch {

	public static void main(String[] args) {
		// switch���:byte short int char  String
		//�û��������֣�1 ��ʾ����һ    2 3 4 5 6 7 
		System.out.println("������һ��������");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		switch(x){
			case 1:  System.out.println("����һ");
			         break;
			case 2:  System.out.println("���ڶ�");
	         		   
			case 3:  System.out.println("������");
    		 		
			case 4:  System.out.println("������");
    		 		
			case 5:  System.out.println("������");
    		 		
			case 6:  System.out.println("������");
    		 		
			case 7:  System.out.println("������");
    		 		
    		default:
    			   System.out.println("��������");
		 		  
		}
		
		//���� ����һ ����ӡ  ������Ϊ1�� �����ڶ�  ��ӡ  ������Ϊ2��
		System.out.println("���������ڣ����磺һ");
		String str=sc.next();
		switch("����"+str){
		
		   case "����һ":System.out.println("����Ϊ1");
	 					break;
		   default:   System.out.println("��������");
           break;
		   case "���ڶ�":System.out.println("����Ϊ2");
						break;
		   case "������":System.out.println("����Ϊ3");
						break;
		  
		}
		
		//�����ϴ����д�� if���
		
	}

}
