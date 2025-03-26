package hw2;

public class ABC_Triangle {
	public static void main(String[] args) {
		char ch = 'A'; // 起始字元
		int rows = 6;// 設定有6層
		for (int i = 1; i <= rows; i++) { // 外層迴圈控制列數
			for (int j = 1; j <= i; j++) { // 內層迴圈控制每列的字元數
				System.out.print(ch);
			}
			System.out.println(); // 換行
			ch++; // 字元遞增
		}
	}
}