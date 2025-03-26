package hw2;

public class TestNineNine {
	public static void main(String[] args) {
		// for + while迴圈做法
		int i;
		for (i = 1; i <= 9; i++) {
			int j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println("");
		}
		System.out.println("第一分行___________________________");
		// for + do while作法
		for (i = 1; i <= 9; i++) {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			System.out.println("");
		}
		System.out.println("第二分行____________________");
		// while + do while 作法
		int o = 1;
		while (o <= 9) {

			int j = 1;
			do {
				System.out.print(o + "*" + j + "=" + o * j + "\t");
				j++;
			} while (j <= 9);

			o++;
			System.out.println("");
		}
		System.out.println("第三分行___________________________");
	}

}
