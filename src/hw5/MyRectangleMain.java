package hw5;

public class MyRectangleMain {

	public static void main(String[] args) {
		MyRectangle mr = new MyRectangle();// 建立MyRectangle物件
		mr.setWidth(10);
		mr.setDepth(20);
		System.out.println("1計算結果: " + mr.getAera());

		MyRectangle gg = new MyRectangle(10, 20);
		System.out.println("2計算結果: " + gg.getAera());

	}

}
