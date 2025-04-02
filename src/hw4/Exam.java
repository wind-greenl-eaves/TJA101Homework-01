package hw4;

public class Exam {
    public static void main(String[] args) {
        // 定義成績二維陣列 [考試次數][學生人數]
        int[][] scores = {
            {10, 35, 40, 100, 90, 85, 75, 70},    // 第1次考試
            {37, 75, 77, 89, 64, 75, 70, 95},     // 第2次考試
            {100, 70, 79, 90, 75, 70, 79, 90},    // 第3次考試
            {77, 95, 70, 89, 60, 75, 85, 89},     // 第4次考試
            {98, 70, 89, 90, 75, 90, 89, 90},     // 第5次考試
            {90, 80, 100, 75, 50, 20, 99, 75}     // 第6次考試
        }; // 宣告並初始化成績二維陣列
        
        // 紀錄每位同學獲得最高分的次數
        int[] highestScoreCount = new int[8]; // 宣告並初始化紀錄8位同學獲得最高分次數的一維陣列
        
        // 逐一檢查每一次考試
        for (int exam = 0; exam < scores.length; exam++) { // 遍歷每次考試,有6次
        	//System.out.println(scores.length);//確認結果
            // 找出本次考試的最高分
            int maxScore = 0; // 初始化最高分變數
            for (int student = 0; student < scores[exam].length; student++) { // 遍歷每位學生的成績
                if (scores[exam][student] > maxScore) { // 如果當前成績大於已知的最高分
                    maxScore = scores[exam][student]; // 更新最高分為當前成績 6次考試內的最高分
                    
                }
                
            }
            //System.out.println(maxScore);//驗證結果
            
            // 計算有哪些同學獲得最高分
            for (int student = 0; student < scores[exam].length; student++) { // 再次遍歷每位學生的成績
                if (scores[exam][student] == maxScore) { // 如果當前成績等於最高分
                    highestScoreCount[student]++; // 將該學生的最高分次數加1
//                    System.out.println(highestScoreCount[student]);
                }
               
            }
            
            
        }
        
        // 顯示結果
        System.out.println("每位同學考取最高分的次數："); // 輸出標題
        for (int student = 0; student < highestScoreCount.length; student++) { // 遍歷每位學生的最高分次數
            System.out.println((student + 1) + "號同學：" + highestScoreCount[student] + " 次"); // 輸出每位學生的最高分次數
        }
    }
}