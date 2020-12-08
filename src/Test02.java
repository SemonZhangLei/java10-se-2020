import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
	/*	1.控制台输入用户名，密码，当用户名为tom,密码为123时，显示"登陆成功，欢迎tom进入本系统"
	 *    如果用户名不为tom,显示“没有此账号，请注册！ 1进入注册页”，如果密码不为123，显示“密码错误”
	 *  （1） 没有账号时 输入 1：“欢迎进入注册页面” 
	 *      "请输入你的用户名 " XXX
	 *      "请输入密码" XXX123
	 *       “确认提交  1 提交   0 取消”    
	 *          1显示“注册成功”  0 “注册失败”
	 *          
	 *     （2）登陆成功后：输入0  “再见！”
	 *     （3）密码错误，“请重新输入，最多输入3次”   3次都失败显示“再见！”
	 *                 正确“登陆成功，欢迎tom进入本系统”
	 *                 
	 *                String  比较值 equals()   ！
	 *                switch case直接比较
        */
		//1.输入账号
		Scanner sc=new Scanner(System.in); 
		System.out.println("输入用户名");
		String name=sc.next();
		//2.判断用户名是否为tom
		if(name.equals("tom")){
			   //2.1 用户名为tom,输入密码
			  System.out.println("请输入密码：");
			  String password=sc.next();
			  //2.2 判断密码是否为123
			  if(password.equals("123")){ //相等
				  System.out.println("登陆成功，欢迎tom进入本系统");
				   //成功登录。。。。。
				  
				  
			  }else{//不相等
				  System.out.println("密码错误");
				  //2.3 请重新输入，最多输入3次
				  System.out.println("请重新输入，最多输入3次");
				  //2.4 最多输入3次
				  int i=1;
				  String ww="";
				  while(i<=3){
					    //判断每次输的内容是否123
					    ww=sc.next();
					    if(ww.equals("123")){
					    	System.out.println("登陆成功，欢迎tom进入本系统");
					    	break;
					    }else{
					    	System.out.println("密码错误,您还剩"+(3-i)+"次机会");
					    }
					    i++;
				  }
				  //超过3次，且都不是 123
				  if(i>3&&!ww.equals("123")){   
					  System.out.println("密码错误次数超过3次，再见！");
				  }
			  }
	 }else{//账号不正确
		 System.out.println("没有此账号，请注册！ 1进入注册页");
		 int x=sc.nextInt();
		 if(x==1){
			 System.out.println("欢迎进入注册页面");
			 System.out.println("请输入你的用户名");
			 String zcname=sc.next();
			 System.out.println("请输入你的密码");
			 String zcpassword=sc.next();
			 System.out.println("确认提交  1 提交   0 取消??");
			 int y=sc.nextInt();
			 if(y==1){
				 System.out.println("注册成功");
			     //登录（待续）
			 }else if(y==0){
				 System.out.println("注册失败");
				 System.out.println("再见");
			 }else{
				 System.out.println("操作有误！");
			 }
		 }
	 }
		
		
		
	}

}
