package hw3; // 定義 package，表示這個程式屬於 hw3 套件

import java.util.Random; // 引入 Random 類別，負責生成隨機數
import java.util.Scanner; // 引入 Scanner 類別，用來接收使用者輸入

public class Lotto_2 { // 定義 Lotto_2 類別
	public static void main(String[] args) { // 主程式進入點
		Scanner scanner = new Scanner(System.in); // 創建 Scanner 物件，用於輸入
		Random random = new Random(); // 創建 Random 物件，用於生成隨機數
		int s; // 用來存放阿文討厭的數字

		// 1. 讓阿文輸入討厭的數字，直到輸入正確
		while (true) { // 無限迴圈，直到輸入符合條件才會跳出
			System.out.print("阿文...請輸入你討厭哪個數字(1~9)？ "); // 提示使用者輸入
			s = scanner.nextInt(); // 讀取阿文輸入的數字

			if (s >= 1 && s <= 9) { // 判斷輸入是否在 1~9 之間
				break; // 如果輸入正確 (1~9)，則跳出迴圈
			} else {
				System.out.println("⚠️ 錯誤！請輸入 1~9 之間的數字！"); // 提示輸入錯誤
			}
		}

		// 2. 建立陣列存放 1~49，並排除討厭的數字
		int[] numbers = new int[49]; // 宣告陣列，存放 1~49 的數字
		int count = 0; // 記錄可用數字的數量（即沒有包含阿文討厭數字的數量）

		for (int i = 1; i <= 49; i++) { // 遍歷 1 到 49
			if (!containsDigit(i, s)) { // 呼叫 containsDigit 方法，檢查 i 是否包含阿文討厭的數字
				numbers[count] = i; // 如果不包含，就存入 numbers 陣列
				count++; // 可用數字數量加一
<<<<<<< HEAD
			
=======
>>>>>>> e4e0c30925a10e308f2aff8a0fefe9cbb4d70813
				
			}
		}

		// 3. 亂數選取 6 個不重複的數字
		int[] selectedNumbers = new int[6]; // 宣告陣列，存放選出的 6 個號碼
		for (int i = 0; i < 6; i++) { // 迴圈執行 6 次，選出 6 個數字
			int index; // 存放隨機選出的索引值
			boolean duplicate; // 用來標記是否選到了重複的數字
			do {
				index = random.nextInt(count); // 隨機選取 0 ~ count-1 之間的索引
				duplicate = false; // 預設為 false，表示未發現重複

				// 檢查是否重複
				for (int j = 0; j < i; j++) { // 檢查已選出的數字
					if (selectedNumbers[j] == numbers[index]) { // 如果選到的數字已存在
						duplicate = true; // 設定 duplicate 為 true
						break; // 跳出檢查迴圈，避免不必要的檢查
					}
				}
			} while (duplicate); // 如果選到重複數字，就重新選取

			selectedNumbers[i] = numbers[index]; // 儲存選出的數字到陣列
		}

		// 4. 輸出可選擇的數字
		System.out.println("\n阿文... 你可以選擇這些數字：\n"); // 顯示提示訊息
		printNumbers(numbers, count); // 呼叫 printNumbers 方法，列印可選擇的數字
		System.out.println("\n🎉 總共有 " + count + " 個數字可選"); // 顯示可選擇的數字總數

		// 5. 輸出隨機選出的 6 個號碼
		System.out.println("\n🎉 亂數列印六個號碼："); // 顯示提示訊息
		for (int num : selectedNumbers) { // 遍歷 selectedNumbers 陣列
			System.out.printf("%d ", num); // 以格式化方式列印選出的號碼
		}

		scanner.close(); // 關閉 Scanner 物件，釋放資源
	}

	// 檢查數字是否包含討厭的數字
	public static boolean containsDigit(int num, int digit) { // 定義方法，判斷數字 num 是否包含 digit
		while (num > 0) { // 當 num 不為 0 時執行
			if (num % 10 == digit) { // 取出 num 最右邊的數字，檢查是否等於 digit
				return true; // 如果找到討厭的數字，返回 true
			}
			num /= 10; // 移除數字的最後一位
		}
		return false; // 如果 num 完全沒有包含 digit，返回 false
	}

	// 排版輸出，每行最多 7 個數字
	public static void printNumbers(int[] numbers, int size) { // 定義 printNumbers 方法
		for (int i = 0; i < size; i++) { // 遍歷 numbers 陣列
			System.out.printf("%-4d", numbers[i]); // 左對齊輸出，每個數字寬度為 4
			if ((i + 1) % 7 == 0) { // 每 7 個數字換行
				System.out.println();
			}
		}
	}
}
