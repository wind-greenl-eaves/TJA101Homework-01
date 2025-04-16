package hw4;

import java.util.Scanner;

public class BorrowMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int borrowAmount;

        // 要求使用者輸入借款金額，不能小於 0
     // 修改這段判斷條件：金額必須 > 0
        while (true) {
            System.out.print("阿文(sb)，請輸入欲借金額：");
            borrowAmount = scanner.nextInt();

            if (borrowAmount > 0) {
                break;
            } else {
                System.out.println("借款金額必須大於 0，請重新輸入！");
            }
        }


        // 二維陣列：第0列為員工編號，第1列為對應的現金
        int[][] employeeData = {
            { 25, 32, 8, 19, 27 },     // 員工編號
            { 2500, 800, 500, 1000, 1200 }  // 對應現金
        };

        StringBuilder availableEmployeeIds = new StringBuilder();
        int availableCount = 0;

        // 檢查哪些員工現金 >= 欲借金額
        for (int i = 0; i < employeeData[0].length; i++) {
            int employeeCash = employeeData[1][i];
            if (employeeCash >= borrowAmount) {
                availableEmployeeIds.append(employeeData[0][i]).append(" ");
                availableCount++;
            }
        }

        // 顯示結果
        if (availableCount > 0) {
            System.out.println("有錢可借的員工編號: " + availableEmployeeIds + "共 " + availableCount + " 人！");
        } else {
            System.out.println("沒有任何員工可以借你這個金額 😅");
        }

        scanner.close();
    }
}
