package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 建立陣列來存儲輸入的邊長
        int[] sides = new int[3];

        // 提示使用者輸入三個數字
        System.out.print("輸入三個整數： ");
//        System.out.print("輸入第一個整數： ");
        sides[0] = scanner.nextInt();
//        System.out.print("輸入第二個整數： ");
        sides[1] = scanner.nextInt();
//        System.out.print("輸入第三個整數： ");
        sides[2] = scanner.nextInt();

        // 先將陣列排序（升冪排列）
        Arrays.sort(sides);

        // 取出使用者輸入並排序後的邊長 放入變數 a,b,c
        int a = sides[0];  
        int b = sides[1];  
        int c = sides[2];  

        
        System.out.println( sides[0]+" "+ sides[1]+ " "+sides[2]);

        // 判斷是否為三角形
        if (a + b > c && a > 0) {
            if (a == b && b == c) {
                System.out.println("正三角形");
            } else if (a == b || b == c) {
                System.out.println("等腰三角形");
            } else if (a * a + b * b == c * c) {
                System.out.println("直角三角形");
            } else {
                System.out.println("其它三角形");
            }
        } else {
            System.out.println("不是三角形");
        }

        scanner.close();
    }
}

