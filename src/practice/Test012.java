package practice;

import java.util.Scanner;

public class Test012 {

	public static void main(String[] args) {
		/*��Ŀ����һ����Ϸ��ָ�����A��a����ɡ���ͷ��������
		 * ����D��d����ɡ�ǰ����,����W��w,��ɡ���Ծ����
		 * ����S����ʾ�����¡�����������������������󡱣�
		 * ����ʧ�ܴ�������5�Σ��˳���Ϸ��*/
		
		Scanner sc=new Scanner(System.in);
		int error_count=0;//�������
	AAA:for(;;){
			//����
			System.out.println("�����������A ��D S W ");
			String str=sc.next();
			//�ж�����ֵ
	     switch(str.toLowerCase()){   //��дתСд
	           case "a":System.out.println("��ͷ");break;
	           case "d":System.out.println("ǰ��");break;
	           case "s":System.out.println("����");break;
	           case "w":System.out.println("��Ծ");break;
		       default:
	        	    error_count++;
	        	    if(5-error_count>0){
	        	    	 System.out.println("����ʧ�ܣ���ʣ������"+(5-error_count)+"��");
	        	    }
	        	    if(error_count>=5){
	        	    	System.out.println("game over!");
	        	    	break AAA;  //�˳�ѭ��
	        	    }
	        	  break ;//�˳�switch
	         }
		}
		
	}

}
