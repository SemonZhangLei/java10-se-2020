package lesson3;

import java.util.Scanner;

public class TestIf {

    public static void main(String args[]){
    	//�����ϴ����д�� if���   ����������ʾ �ַ���
    	System.out.println("����������");
    	
    	Scanner sc=new Scanner(System.in);
    	int x=sc.nextInt();
    	
    	if(x==1){
    		System.out.println("����һ");
    	}else if(x==2){
    		System.out.println("���ڶ�");
    	}else if(x==3){
    		System.out.println("������");
    	}else{
    		System.out.println("��������");
    	}
    	
    	//�����ַ��� ��ʾ����
    	System.out.println("���������ڣ�����-");
    	//�ַ������������ͣ�ֵ�ıȽ� equals()  ,==�Ƚϵ��ǵ�ַ
    	String str=sc.next();
    	if(str.equals("����һ")){
    		System.out.println("1111");
    	}else if(str.equals("���ڶ�")){
    		System.out.println("2222");
    	}else if(str.equals("������")){
    		System.out.println("3333");
    	}else{
    		System.out.println("��������");
    	}
    }

}
