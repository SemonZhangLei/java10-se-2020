package lesson3;

import java.util.Random;

public class Test04 {

	public static void main(String[] args) {
		// ����һ��12���ڵ�����·ݣ���һ��30���ڵ������������������Ǳ���ĵڶ����죨���������꣩��
		Random r=new Random();
		//1. 12���ڵ�����·�
		int month=r.nextInt(13);
		//2. һ��30���ڵ��������
		int day=r.nextInt(31);
		
		//�ڶ�����    0-365��    2��15��:   һ�·ݵ���������+15     7��28��
         int sum=0;//�ڼ���
          //3.���㵱ǰ�·ݵ��ϼ����µ�������  +���µ�day
       
/*       switch(month){
 		case 1:  sum+=0;  break;
 		case 2:  sum=31+0; break;//1�·�31   
 		case 3:  sum+=31+0+28;break; //1�·�31 +2�µ�28
 		case 4:  sum+=31+0+28+31; break;//1�·�31 +2�µ�28+3�� 31
 		case 5:  sum+=31+0+28+31+30; break;//1�·�31 +2�µ�28+3�� 31��4��30
 		case 6:  sum+=31+0+28+31+30+31;break;//1�·�31 +2�µ�28+3�� 31��4��30
 		case 7:  sum+=31+0+28+31+30+31;
 		case 8:
 		case 9:
 		case 10:
 		case 11:
 		case 12: 
	   }*/
        switch(month){
	  		case 12:  sum+=30; // 11
	  		case 11:  sum+=31;  //10
	  		case 10:  sum+=30;//9
	  		case 9:   sum+=31;//8
	  		case 8:  sum+=31;//7
	  		case 7:  sum+=30;//6
	  		case 6: sum+=31;//5
	  		case 5: sum+=30;//4
	  		case 4: sum+=31;//3
	  		case 3: sum+=28;//2
	  		case 2: sum+=31;//1
	  		case 1: sum+=0;
        } 
        
       sum+=day;
       System.out.println(month+"��"+day+"�գ��Ǹ���ĵ�"+sum+"��");

  }
}
