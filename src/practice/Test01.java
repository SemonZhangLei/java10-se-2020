package practice;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		/*��Ŀ����һ����Ϸ��ָ�����A��a����ɡ���ͷ��������
		 * ����D��d����ɡ�ǰ����,����W��w,��ɡ���Ծ����
		 * ����S����ʾ�����¡�����������������������󡱣�
		 * ����ʧ�ܴ�������5�Σ��˳���Ϸ��*/
		Scanner sc=new Scanner(System.in);
		int error_count=0;//�������
		while(true){
			//����
			System.out.println("�����������A ��D S W ");
			String str=sc.next();
			//�ж�����ֵ
			if(str.equals("A")||str.equals("a")){
				System.out.println("��ͷ");
			}else if(str.equals("D")||str.equals("d")){
				System.out.println("ǰ��");
			}else if(str.equals("W")||str.equals("w")){
				System.out.println("��Ծ");
			}else if(str.equals("S")||str.equals("s")){
				System.out.println("����");
			}else{
				error_count++;
				if(5-error_count>0){
					System.out.println("��������,��ʣ"+(5-error_count)+"����");
				}
				
				//�������󣬳���5�� ���˳�
			    if(error_count>=5){
			    	System.out.println("��������ѳ���5�Σ�game over!");
			    	break;
			    }
			}
		}
	}

}
