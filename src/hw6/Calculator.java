package hw6;

public class Calculator {

	// powerXY 方法：計算 x 的 y 次方
	public static int powerXY(int x, int y) throws CalException {
		// 當 x 和 y 同時為 0 時，視為無意義，丟出自訂例外
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義！");
		}

		// 當 y 為負數時，結果會是小數，Java int 無法表示，丟出內建例外
		if (y < 0) {
			throw new ArithmeticException("次方為負值，結果回傳不為整數！");
		}

		// 正常情況下，執行次方計算（使用迴圈做累乘）
		// 我們先宣告一個整數變數 result，並初始化為 1。
		// 為什麼是 1？
		// 因為乘法的單位元素是 1，也就是說：
		int result = 1;
//		所以一開始設為 1 是為了能夠透過累乘得到正確結果。
		for (int i = 0; i < y; i++) {
			result *= x;
		}

		// 回傳結果
		return result;
	}
}
