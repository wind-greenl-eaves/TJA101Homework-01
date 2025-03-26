package hw2;

public class While_Multiply {
	public static void main(String[] args) {
		int sum = 1;
		int i = 1;
		while (i <= 10) {
			sum = sum * i;
			i++;
			
		}
		System.out.println("請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)");
		System.out.println("1~10連乘積=" + sum);
	}
}
