package lesson3;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// 1-1000���� �� ����7  7�ı�������Ĭ��  ������ ��ʾ ��
		System.out.println("��ָ�����ݷ�Χ");
		Scanner sc=new Scanner(System.in);
		int max=sc.nextInt();
		System.out.println("���ݷ�Χ��1-"+max);
		int x=1;//��ǰ����
		while(x<=max){
			//����7  7�ı�������Ĭ��
			//����7    17  71  170   701  777
			int g=x%10;
			int s=x/10%10;
			int b=x/100%10;  //721
			if(x%7==0||g==7||s==7||b==7){
				System.out.println("��Ĭ");
			}else{
				System.out.println(x);
			}
			
			x++;
		}
		
		//25 ˼����һ����16���ˣ���һ�֣�1 2 3 4   16   �ڶ��� ��Ĭ 18   25
		
		
		

	}

}
