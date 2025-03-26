package hw2;

public class Even {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 2; i <= 1000; i += 2) {
 
			sum += i;

		}
		System.out.println("請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)");

		System.out.println("1~1000的偶數和:" + sum);
	}
}
