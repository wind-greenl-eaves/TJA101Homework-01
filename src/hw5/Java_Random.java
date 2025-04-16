package hw5;

import java.util.Random;

public class Java_Random {

    public static void randAvg() {
        Random rand = new Random(); // 建立亂數產生器
        int[] numbers = new int[10]; // 建立陣列儲存 10 個整數
        int sum = 0; // 儲存總和

        System.out.println("本次亂數結果：");

        // 產生亂數並加總
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(101); // 產生 0~100 的亂數
            System.out.print(numbers[i] + "  "); // 印出亂數，Tab 分隔
            sum += numbers[i]; // 累加總和
        }

        // 計算浮點數平均值 
        float floatAvg = (float) sum / numbers.length;

        // 計算四捨五入後的整數平均值
        int roundedAvg = Math.round(floatAvg);

        System.out.println(); // 換行

        // 顯示平均值（浮點數）
        System.out.println("平均值 (浮點數)： " + floatAvg);

        // 顯示平均值（四捨五入後）
        System.out.println("平均值 (四捨五入)： " + roundedAvg);
    }

    public static void main(String[] args) {
        randAvg(); // 執行 randAvg 方法
    }
}
