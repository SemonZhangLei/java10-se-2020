package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		//1.�·ݣ������
		Random ran=new  Random();
		int month=ran.nextInt(13);
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
			System.out.println(month+"�·���31��");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month+"�·���30��");
			break;
		case 2:
			System.out.println(month+"�·���28��");
			break;
	    default:
	    	System.out.println(month+"�·�����");
			break;
		}
	}

}