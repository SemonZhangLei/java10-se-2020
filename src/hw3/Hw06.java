package hw3;

public class Hw06 {

	public static void main(String[] args) {
		// ������������һ��4λ�������󽫸�����ת�Ժ��������ԭ��Ϊ1234����ת�����λ4321 
		int x=2143; 
		//��λ   x/1%10   ʮλ  x/10%10    ��λ  x/100%10   ǧλ  x/1000%10  ...
		  //   1            2         3             4
		   // nλ   x/10^(n-1)%10  
		int i=1;//λ�������Ʊ���
		int cf=1;//10�Ĵη�
		int cz=1000;//���Ե�ֵ
		int s=0;//ÿλ�ϵ���
		int y=0;//��ת���ֵ
		while(i<=4){
		  	 s=x/cf%10 ;
		  	 cf*=10;
		  	 //System.out.println(s);
		  	y+=s*cz;
		  	cz/=10;
		  	 i++;
		}
		System.out.println(x+"��ת�������"+y);

	}

}
