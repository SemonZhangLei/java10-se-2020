package hw3;

public class Hw05 {

	public static void main(String[] args) {
		// ��дһ�������ҳ�����200����С������
		int x=200;
		while(x<=10000){//���ݷ�Χ����ӡ�����Ĵ���
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
				break;//��һ���������˳�
			}
			x++;
		}

	}

}
