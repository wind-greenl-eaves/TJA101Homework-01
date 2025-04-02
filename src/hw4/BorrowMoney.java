package hw4;

import java.util.Scanner;

public class BorrowMoney {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入欲借金額：");
		int money = scanner.nextInt();

		int[][] data = { // 定義二維陣列，包含員工編號與他們的現金
				{ 25, 32, 8, 19, 27 }, // 員工編號 第0列
				{ 2500, 800, 500, 1000, 1200 } // 對應的身上現金 第1列
		};

		String availableIds = ""; // 儲存可以借錢的員工編號字串
		StringBuilder sb = new StringBuilder(availableIds);
		int count = 0; // 用來計算有錢可借的員工人數

		// 用迴圈檢查每個員工的現金是否 >= 欲借金額
		for (int i = 0; i < data[0].length; i++) { // 迴圈跑每一個員工
			if (data[1][i] >= money) { // 如果員工現金 >= 欲借金額
				availableIds += data[0][i] + " "; // 把員工編號加入字串中
				count++; // 人數加一
			}
		}

		// 根據是否有人可借來顯示結果
		if (count > 0) { // 如果有至少一人可借
			System.out.println("有錢可借的員工編號: " + availableIds + "共 " + count + " 人！"); // 顯示可借的人員與總數
		} else { // 否則沒有人可以借
			System.out.println("沒有任何員工可以借你這個金額 😅"); // 顯示無法借款訊息
		}

		scanner.close();
	}
}
