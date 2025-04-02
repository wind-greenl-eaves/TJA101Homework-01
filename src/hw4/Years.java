package hw4;

import java.util.Scanner;

public class Years {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 建立 Scanner 物件，從鍵盤讀取輸入

		int year, month, day; // 宣告變數：年、月、日

		System.out.println("請輸入年分:");
		year = scanner.nextInt(); // 讀取年份

		System.out.println("請輸入月份:");
		month = scanner.nextInt(); // 讀取月份

		if (month < 1 || month > 12) { // 如果月份不是 1~12 之間，顯示錯誤訊息
			System.out.println("月份輸入錯誤");
			return;// 錯誤就結束程式
		}

		System.out.println("請輸入日期:");
		day = scanner.nextInt(); // 讀取日期

		// 每個月的天數（預設為平年）
		int days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// 判斷是否為閏年，如果是就把2月的天數改成29
		if (Yearstext.isLeapYear(year)) {
			days[1] = 29;
		}

		// 驗證day是否合法（不超過該月最大天數）
		if (day < 1 || day > days[month - 1]) {
			System.out.println("日期輸入錯誤!");
			return; // 錯誤就結束程式
		}

		// 計算該日期是當年度的第幾天
		int dayOfYear = 0;
		for (int i = 0; i < month - 1; i++) { // 累加前幾個月的總天數
			dayOfYear += days[i];

		}
		dayOfYear += day; // 加上當月的日數

		// 顯示結果
		System.out.println("輸入的日期為該年第 " + dayOfYear + " 天。");

		scanner.close(); // 關閉 Scanner
	}
}
