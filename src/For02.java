import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		// ѭ���õ��û��ӿ���̨�����5��������������Ϊ�û�������Ʒ�ļ۸񣬼����û�һ����Ҫ���ѵ��ܽ�
		int sum=0;
		//�����ܽ��
		Scanner  sc=new Scanner(System.in);

		for(int i=1;i<=5;i++){
				System.out.println("��������Ʒ�۸�"+i);
				int price=sc.nextInt();//�۸�
				sum+=price;//sum=sum+price;
		}
		

		System.out.println("�û�һ����Ҫ���ѵ��ܽ����"+sum);
	}

}
