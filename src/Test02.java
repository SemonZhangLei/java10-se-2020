import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
	/*	1.����̨�����û��������룬���û���Ϊtom,����Ϊ123ʱ����ʾ"��½�ɹ�����ӭtom���뱾ϵͳ"
	 *    ����û�����Ϊtom,��ʾ��û�д��˺ţ���ע�ᣡ 1����ע��ҳ����������벻Ϊ123����ʾ���������
	 *  ��1�� û���˺�ʱ ���� 1������ӭ����ע��ҳ�桱 
	 *      "����������û��� " XXX
	 *      "����������" XXX123
	 *       ��ȷ���ύ  1 �ύ   0 ȡ����    
	 *          1��ʾ��ע��ɹ���  0 ��ע��ʧ�ܡ�
	 *          
	 *     ��2����½�ɹ�������0  ���ټ�����
	 *     ��3��������󣬡����������룬�������3�Ρ�   3�ζ�ʧ����ʾ���ټ�����
	 *                 ��ȷ����½�ɹ�����ӭtom���뱾ϵͳ��
	 *                 
	 *                String  �Ƚ�ֵ equals()   ��
	 *                switch caseֱ�ӱȽ�
        */
		//1.�����˺�
		Scanner sc=new Scanner(System.in); 
		System.out.println("�����û���");
		String name=sc.next();
		//2.�ж��û����Ƿ�Ϊtom
		if(name.equals("tom")){
			   //2.1 �û���Ϊtom,��������
			  System.out.println("���������룺");
			  String password=sc.next();
			  //2.2 �ж������Ƿ�Ϊ123
			  if(password.equals("123")){ //���
				  System.out.println("��½�ɹ�����ӭtom���뱾ϵͳ");
				   //�ɹ���¼����������
				  
				  
			  }else{//�����
				  System.out.println("�������");
				  //2.3 ���������룬�������3��
				  System.out.println("���������룬�������3��");
				  //2.4 �������3��
				  int i=1;
				  String ww="";
				  while(i<=3){
					    //�ж�ÿ����������Ƿ�123
					    ww=sc.next();
					    if(ww.equals("123")){
					    	System.out.println("��½�ɹ�����ӭtom���뱾ϵͳ");
					    	break;
					    }else{
					    	System.out.println("�������,����ʣ"+(3-i)+"�λ���");
					    }
					    i++;
				  }
				  //����3�Σ��Ҷ����� 123
				  if(i>3&&!ww.equals("123")){   
					  System.out.println("��������������3�Σ��ټ���");
				  }
			  }
	 }else{//�˺Ų���ȷ
		 System.out.println("û�д��˺ţ���ע�ᣡ 1����ע��ҳ");
		 int x=sc.nextInt();
		 if(x==1){
			 System.out.println("��ӭ����ע��ҳ��");
			 System.out.println("����������û���");
			 String zcname=sc.next();
			 System.out.println("�������������");
			 String zcpassword=sc.next();
			 System.out.println("ȷ���ύ  1 �ύ   0 ȡ��??");
			 int y=sc.nextInt();
			 if(y==1){
				 System.out.println("ע��ɹ�");
			     //��¼��������
			 }else if(y==0){
				 System.out.println("ע��ʧ��");
				 System.out.println("�ټ�");
			 }else{
				 System.out.println("��������");
			 }
		 }
	 }
		
		
		
	}

}
