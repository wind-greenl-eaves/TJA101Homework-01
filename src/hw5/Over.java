package hw5; 

public class Over { 

	int maxVal; 
	double maxVal1; 

	public int maxElement(int[][] x) { // 宣告一個公開的方法 maxElement，接收一個二維整數陣列 x 作為參數，並回傳一個整數
		int max = x[0][0]; // 假設二維陣列的第一個元素是目前的最大值
		for (int i = 0; i < x.length; i++) { // 使用 for 迴圈迭代二維陣列的每一列
			for (int j = 0; j < x[i].length; j++) { // 使用巢狀 for 迴圈迭代當前列的每一個元素
				if (x[i][j] > max) { // 檢查當前元素是否大於目前的最大值
					max = x[i][j]; // 如果當前元素更大，則將其更新為新的最大值
				}
			}
		}
		return max; // 回傳找到的整數陣列最大值
	}

	public double maxElement(double[][] x) { // 宣告一個公開的方法 maxElement，接收一個二維雙精度浮點數陣列 x 作為參數，並回傳一個雙精度浮點數
		double max = x[0][0]; // 假設二維陣列的第一個元素是目前的最大值
		for (int i = 0; i < x.length; i++) { // 使用 for 迴圈迭代二維陣列的每一列
			for (int j = 0; j < x[i].length; j++) { // 使用巢狀 for 迴圈迭代當前列的每一個元素
				if (x[i][j] > max) { // 檢查當前元素是否大於目前的最大值
					max = x[i][j]; // 如果當前元素更大，則將其更新為新的最大值
				}
			}

		}
		return max; // 回傳找到的浮點數陣列最大值
	}

	@Override // 標註此方法覆寫自父類別 (Object) 的 toString 方法
	public String toString() { // 宣告一個公開的方法 toString，不接收任何參數，並回傳一個字串
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } }; // 宣告並初始化一個二維整數陣列 intArray
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } }; // 宣告並初始化一個二維雙精度浮點數陣列 doubleArray

		this.maxVal = maxElement(intArray); // 呼叫 maxElement 方法找出整數陣列的最大值，並將結果儲存到 maxVal 實例變數中
		this.maxVal1 = maxElement(doubleArray); // 呼叫 maxElement 方法找出浮點數陣列的最大值，並將結果儲存到 maxVal1 實例變數中

		return "整數最大值是: " + maxVal + "\n浮點數最大值是: " + maxVal1; // 回傳一個包含整數和浮點數最大值的字串
	}

	// 測試用 main 方法
	public static void main(String[] args) { 
		Over over = new Over(); // 創建一個 Over 類別的實例 (物件)
		System.out.println(over.toString()); // 呼叫 over 物件的 toString 方法，並將回傳的字串輸出到控制台
	}
}