package lesson3;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("�������·ݣ�");
		//�û�ָ��������
		Scanner sc=new Scanner(System.in);
		//1.�·�
		int month=sc.nextInt();
		//2.������·ݵ�����
		//System.out.println("���·���30��");//4��6��9��11������Ϊ30
		//System.out.println("���·���28��");
		//System.out.println("���·���31��");//1��3��5��7��8��10��12
		switch(month){
		case 1:  
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("���·���31��");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("���·���30��");
			break;
		case 2:
			System.out.println("���·���28��");
			break;
	    default:
	    	System.out.println("��������");
			break;
		}
		

	}

}
