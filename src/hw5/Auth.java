package hw5; 
import java.util.Random; 

public class Auth { 

    // 方法：生成隨機的8位驗證碼
    public static String genAuthCode() { // 宣告一個公開的靜態方法 genAuthCode，不接收任何參數，並回傳一個字串 (驗證碼)
        // 定義可用字符集，包括大小寫字母和數字
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"; // 定義一個包含所有可能字符的字串
        StringBuilder authCode = new StringBuilder(); // 創建一個 StringBuilder 物件，用於高效地構建驗證碼字串
        Random random = new Random(); // 創建一個 Random 物件，用於生成隨機數

        // 循環生成8個隨機字符
        for (int i = 0; i < 8; i++) { // 使用 for 迴圈重複執行 8 次，以生成 8 位驗證碼
            int index = random.nextInt(characters.length()); // 生成一個 0 到 characters 字串長度之間的隨機整數，作為索引
            //charAt() 方法允許你存取字串中位於特定索引（位置）的單個字元。
            //append() 方法==將指定的字元 添加到字元序列的末尾
            authCode.append(characters.charAt(index));       // 使用隨機索引從 characters 字串中獲取一個字符，並將其添加到 authCode 中
        }

        return authCode.toString(); // 將 StringBuilder 物件轉換為普通的 String 物件並返回生成的驗證碼
    }

    public static void main(String[] args) { 
        // 測試 genAuthCode() 方法，並輸出驗證碼
        System.out.println("本次隨機產生驗證碼為：" + genAuthCode()); // 呼叫 genAuthCode() 方法生成驗證碼，並將其輸出到控制台
    }
}