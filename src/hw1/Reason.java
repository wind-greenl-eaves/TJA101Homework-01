package hw1;

public class Reason {
	public static void main(String[] args) {
		int i = 5;
		
		System.out.println(i + i);// 基本的整數型態相加
		System.out.println(i + '5');
		// i = 5 為字元型態 對應邊碼表為整數型態53 char在運算時會自動晉升為int
		System.out.println((int) '5');// 整數5在編碼表裡的值
		System.out.println(i + "5");
		//與字串相加時,會自動把整數型態的數值轉變成字串型態連接,變成字串與字串連接
		
	}

}
