package hw5;

public class MyRectangle {
	private double width; // 設定寬度
	private double depth;// 設定深度

	// 無參數建構子
	public MyRectangle() {
	}

	// 帶參數建構子
	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;

	}

	// 設定setter寬度
	void setWidth(double newWidth) {
		this.width = newWidth;
	}

	// 設定setter深度
	void setDepth(double newDepth) {
		this.depth = newDepth;
	}

	// 設定getter計算 寬度*深度
	double getAera() {
		return width * depth;
		
		
	}

}
