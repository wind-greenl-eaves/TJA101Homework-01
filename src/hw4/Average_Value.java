package hw4;

public class Average_Value {
	public static void main(String[] args) {
		int array[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int total = 0;
		double average = 0;

		for (int i = 0; i < array.length; i++) { // 改成 i < array.length
			total += array[i];
		}

		average = (double) total / array.length; // 加上 (double) 轉型
		System.out.println("平均: " + average);
		System.out.println("高於平均的數值:");
		for (int i = 0; i < array.length; i++) { // 改成 i < array.length
//			total += array[i];
			if (array[i]>average) {
				System.out.println(array[i]);
				
			}
			

		}
	}
}
