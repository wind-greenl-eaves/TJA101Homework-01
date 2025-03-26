package hw1;

public class Time_Conversion {
	public static void main(String[]args) {
		int i = 60 , q = 8;
		int second = 256559;        //秒
		int minutes = second / i;	//分
		int hour = minutes / i ;	//小時
		int day = hour / q;			//天
		System.out.println("256559秒="+ day +"天="+ hour +"小時="+ minutes +"分="+ second +"秒");
		
		
	
	}

}
