package lesson3;

public class Test06 {

	public static void main(String[] args) {
		// 1��100�������������  1+3+5+....+99=2500
		String str="";
		int  sum=0;//��
		//���
		int x=1;//��ǰ��
		while(x<=100){
			//���� :1 3 5 7 9 11 ,  %2=1
			if(x%2==1){ //x%2!=0
				sum+=x;
				//�ַ���ƴ��:�������һ����ƴ��+�ţ����һ������ƴ��+��
				if(x==99){  //str=1+3  
					str+=x;//  str=str+x   1+3+5
				}else{
					str+=x+"+";
				}
				
			}
			x++;
		}
		//��ӡ��
		System.out.println(str+"="+sum);

	}

}
