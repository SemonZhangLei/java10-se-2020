package practice;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// ��Ŀ��������������x,y,z���������������С���������
		//�϶�  x��С   y�м�   z���
		Scanner sc=new Scanner(System.in);
		System.out.println("������������");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		System.out.println("����ǰ"+x+","+y+","+z);
		//����  ת�� �Ҳ�����   x��С   y�м�   z�������
		//x>y  ����x,y 
		//x>z  ����x,z
		//y>z  ������y,z
		if(x>y){
			//����
			int t=x;
			x=y;
			y=t;
		}
		if(x>z){
			//����
			int t=x;
			x=z;
			z=t;
		}
		if(y>z){
			//����
			int t=y;
			y=z;
			z=t;
		}
		
		
		System.out.println("�����"+x+"<"+y+"<"+z);
		
		//3�� �Ӵ�С
		//  x���  y�м�  z��С��     ��x<y   x<z   y<z

	}

}
