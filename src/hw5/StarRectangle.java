package hw5;

import java.util.Scanner;

public class StarRectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 建立 Scanner 物件以讀取輸入
        System.out.print("請輸入寬與高："); // 提示使用者輸入
        int width = scanner.nextInt(); // 讀取寬度
        int height = scanner.nextInt(); // 讀取高度
        
        starSquare(width, height); // 呼叫 starSquare 方法並傳入寬與高
    }

    // 定義 starSquare 方法，接收兩個參數：寬度和高度
    public static void starSquare(int width, int height) {
        // 外層迴圈：控制高度（行數）
        for (int i = 0; i < height; i++) {
            // 內層迴圈：控制每行印出幾個星號（寬度）
            for (int j = 0; j < width; j++) {
                System.out.print("*"); // 印出一個星號，不換行
            }
            System.out.println(); // 每印完一行星號後換行
        }
    }
}
