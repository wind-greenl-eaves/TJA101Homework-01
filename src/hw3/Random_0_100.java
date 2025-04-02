package hw3;

import java.util.Scanner;
import java.util.Random;

public class Random_0_100 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int ans = random.nextInt(101); // 產生 0-100 的隨機數
		int guess = -1; // 確保guess可以進入迴圈內 不等於 ans 設置-1就永遠不可能是

		System.out.println("請猜一個 0 到 9 之間的數字：");
		for (; guess != ans; ) {
			System.out.print("輸入你的猜測： ");
			guess = scanner.nextInt();

//        while (guess != ans) {
//            System.out.print("輸入你的猜測： ");
//            guess = scanner.nextInt();

			if (guess < ans) {
				System.out.println("太小囉！");
			} else if (guess > ans) {
				System.out.println("太大囉！");
			} else {
				System.out.println("恭喜你！猜對了！");
			}
		}

		scanner.close();//關閉scanner 不浪費資源 記憶體
	}
}
