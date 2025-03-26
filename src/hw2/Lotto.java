package hw2;

public class Lotto {
	public static void main(String[] args) {

		int sum = 0;// 計算總共有幾個數字符合
		int sum2 = 10;// 用來剔除 整除4或是餘數是4的數字

		System.out.println("阿文可以選擇的號碼：");
		for (int i = 1; i <= 49; i++) {
			if (i % sum2 == 4) { // 用來剔除4 14 24 34 44 因為餘數是4

			} else if (i / sum2 == 4) { // 用來剔除40~49 因為整數是4

			} else {
				System.out.print(i + " ");
				sum++;// 計算總共執行了幾次迴圈 就是幾個號碼可以選
			}

		}
		System.out.println();
		System.out.println("阿有" + sum + "個號碼可以選擇");

	}
}
