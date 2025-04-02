package hw4;

public class Star {
	public static void main(String[] args) {
		String star[] = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		int star_total = 0;// 用來累加所有母音的數量

		for (int s = 0; s < star.length; s++) {
			String starname = star[s]; // 取得第s個行星名稱存放到stars
			// System.out.println(starname);
			for (int j = 0; j < starname.length(); j++) {
				// 把存到字串型別的stars以字元方式取出放入ch
				char ch = starname.charAt(j);
				// System.out.println(ch);
				if (isVowel(ch)) { // 使用下面的方法
					star_total++;

				}

			}
		}
		System.out.println("母音的總數:" + star_total);

	}

	public static boolean isVowel(char c) {
		c = Character.toLowerCase(c);// 轉乘小寫 避免大小寫引響
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		} else {
			return false;
		}

	}
}
