package hw6;

import java.util.Scanner;

public class CalTest {
    public static void main(String[] args) {
        // 建立 Scanner 物件，用來接收使用者輸入
        Scanner scanner = new Scanner(System.in);

        try {
            // 提示使用者輸入 x 的值
            System.out.print("請輸入x的值：");
            // 使用 nextLine() 並轉成整數，避免格式錯誤沒抓到
            int x = Integer.parseInt(scanner.nextLine());

            // 提示使用者輸入 y 的值
            System.out.print("請輸入y的值：");
            int y = Integer.parseInt(scanner.nextLine());

            // 呼叫 Calculator 的 powerXY 方法計算結果
            int result = Calculator.powerXY(x, y);

            // 顯示結果
            System.out.println(x + "的" + y + "次方等於" + result);

        } catch (CalException ce) {
            // 處理自訂例外（x 和 y 同時為 0）
            System.out.println(ce.getMessage());
        } catch (ArithmeticException ae) {
            // 處理內建數學錯誤（如 y 為負數）
            System.out.println(ae.getMessage());
        } catch (NumberFormatException nfe) {
            // 處理使用者輸入不是整數的狀況
            System.out.println("輸入格式不正確");
        } finally {
            // 關閉 Scanner 資源
            scanner.close();
        }
    }
}
