package hw1;

public class Circle_area_circumference {
	public static void main(String[] args) {
		int radius = 5 ;			//半徑
		int diameter = radius * 2;	//直徑
		final double PI = 3.1415;	//設定圓周率為常數
		
		double area = PI * (radius * radius);//圓面積= 圓周率*半徑*半徑
		double circum = PI * diameter;       //圓周長= 圓周率*直徑
		System.out.println("請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長");
		 System.out.println("圓面積="+ area);
		 System.out.println("圓周長="+ circum);
		 
	}

}
