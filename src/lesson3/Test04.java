package lesson3;

import java.util.Random;

public class Test04 {

	public static void main(String[] args) {
		// 产生一个12以内的随机月份，和一个30以内的随机天数，输出该日是本年的第多少天（不考虑闰年）？
		Random r=new Random();
		//1. 12以内的随机月份
		int month=r.nextInt(13);
		//2. 一个30以内的随机天数
		int day=r.nextInt(31);
		
		//第多少天    0-365天    2月15日:   一月份的所有天数+15     7月28：
         int sum=0;//第几天
          //3.计算当前月份的上几个月的天数和  +当月的day
       
/*       switch(month){
 		case 1:  sum+=0;  break;
 		case 2:  sum=31+0; break;//1月份31   
 		case 3:  sum+=31+0+28;break; //1月份31 +2月的28
 		case 4:  sum+=31+0+28+31; break;//1月份31 +2月的28+3月 31
 		case 5:  sum+=31+0+28+31+30; break;//1月份31 +2月的28+3月 31，4月30
 		case 6:  sum+=31+0+28+31+30+31;break;//1月份31 +2月的28+3月 31，4月30
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
       System.out.println(month+"月"+day+"日，是该年的第"+sum+"天");

  }
}
