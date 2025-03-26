package hw2;

public class Inverted_Triangle {
	public static void main(String[] args) {
		int rows = 10;// 設定有10行
		for (int i = rows; i >= 1; i--) {// 控制從10行減少到1行
			for (int j = 1; j <= i; j++) {// 控制每行要印出來的數字 1+~10
				System.out.print(j + " ");

			}
			System.out.println(); // 換行
		}
		

	}

}
