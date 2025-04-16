package hw6;

//繼承 Exception 表示這是一個需要被處理的檢查型例外。
public class CalException extends Exception {

    // 建構子，接收錯誤訊息並傳給 Exception 的父類別
    public CalException(String message) {
        super(message);
    }
}