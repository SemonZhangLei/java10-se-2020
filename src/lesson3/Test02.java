package lesson3;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// ��д����ʵ�֣��û�������Ʒ���ƣ���ʾ����Ʒ�ļ۸�
		System.out.println("������Ʒ����:");
		Scanner sc=new Scanner(System.in);
		String name= sc.next();
		switch(name){
		case "����":  System.out.println(name+":2.5Ԫ/ƿ");
		             break;
		case "ѩ��":  System.out.println(name+":3Ԫ/ƿ");
        			break;
		case "���":  System.out.println(name+":6.5Ԫ/��");
					break;
	    default:  System.out.println("û�и���Ʒ");
	    			break;
		}

	}

}
