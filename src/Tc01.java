import java.util.Random;

public class Tc01 {

	public static void main(String[] args) {
		//����һ��1-100���������ӡ1��100֮������������������ֹͣ��ӡ         1-x
		Random ran=new Random();
		int x=ran.nextInt(100);
		System.out.println("�����"+x);
		
		/*for(int i=1;i<100;i++){
			if(x==i){
				break;
			}
			System.out.println(i);
		}*/
/*		for(int i=1;i<x;i++){
			System.out.println(i);
		}*/
		
	/*	int i=1;
		while(i<100){
			if(i==x){
				break;
			}
			System.out.println(i);
			i++;
		}*/
		
		int i=1;
		do{
			if(i==x){
				break;
			}
			System.out.println(i);
			i++;
		}while(i<100);

	}

}
