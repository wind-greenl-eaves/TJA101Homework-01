package hw1;

public class BankInterest {
	public static void main(String[] args) {
//FV=PV(1+i) 
//		n
//		FV (Future Value)：未來的價值，亦即指最後的金額
//		PV (Present Value)：現值，亦即指本金
//		i：利率或預期的回報率
//		n：期數
		double principal = 1500000; //本金
		double rate = 0.02;      //利率2%
		int year = 10;           //存款年數
		//使用最基本的年複利算法 一筆一筆算出每年複利 直至第十年
		double total_1year = principal * (1+rate);
		double total_2year = total_1year * (1+rate);
		double total_3year = total_2year * (1+rate);
		double total_4year = total_3year * (1+rate);
		double total_5year = total_4year * (1+rate);
		double total_6year = total_5year * (1+rate);
		double total_7year = total_6year * (1+rate);
		double total_8year = total_7year * (1+rate);
		double total_9year = total_8year * (1+rate);
		double total_10year = total_9year * (1+rate);
		System.out.println("某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本\r\n"
				+ "金加利息共有多少錢?");
//		System.out.println("第一年複利"+ total_1year);
//		System.out.println("第二年複利"+ total_2year);
//		System.out.println("第三年複利"+ total_3year);
//		System.out.println("第四年複利"+ total_4year);
//		System.out.println("第五年複利"+ total_5year);
//		System.out.println("第六年複利"+ total_6year);
//		System.out.println("第七年複利"+ total_7year);
//		System.out.println("第八年複利"+ total_8year);
//		System.out.println("第九年複利"+ total_9year);
		//使用for迴圈來計算每年的利息加總金額
		for(int i = 1; i <= year; i++) {
			principal += principal * rate; //當年本金 + 當年利息
		}
		System.out.printf("十年後本金加利息=%.2f元\n", principal);//for迴圈判斷
		System.out.printf("十年後本金加利息=%.2f元\n ", total_10year);//基本加總
		
	}
}
