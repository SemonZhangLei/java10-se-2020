package hw3;

public class Hw04 {

	public static void main(String[] args) {
		
		//break �˳�ѭ��
		//20���ڵ���������/������1 2 3 5 7 11 13�� ֻ�ܱ�1�ͱ�����������   %
		int x=1;  //����     x 9   1 2 3 4 5 6 7 8  9 
		while(x<=300){//���ݷ�Χ����ӡ�����Ĵ���
			boolean flag=true;//������
			//�ж��Ƿ�������
			int i=2;//��������
			while(i<x){//��������   2 3 4 5 6 7 8
				if(x%i==0){//�ܱ��м������� ����������
					flag=false;
					break;
				}
				i++;
			}
			//�������ʹ�ӡ
			if(flag){
				System.out.println(x);
			}
			x++;
		}
		
		

	}

}
