package hw4;

public class Hello_World {
	public static void main(String[] args) {
		String st[] = { "Hello World" };
		// 取陣列的第一個元素作為輸入
		// StringBuilder 可變字串
		StringBuilder builder = new StringBuilder(st[0]);
		builder.reverse();// 反轉字串
		System.out.println("列印反轉字串:");
		System.out.println(builder);
	}

}
