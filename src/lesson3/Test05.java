package lesson3;

public class Test05 {

	public static void main(String[] args) {
		// 1+2+3+��+100  ��
		//1.������������
		int sum=0;//�����
		//2.ͨ��ѭ�����
		int x=1;//���浱ǰ���� 1-100  ���Ʊ���
		while(x<=100){
			 sum+=x;  //���
			 x++;  //�ı���Ʊ�����ֵ
			
		}
		//3.��ӡ��
		 System.out.println("1-100�ĺ���"+sum);
	}

}
