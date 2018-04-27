package test02;

public class BuyToy {

	public static void main(String[] args) {
		double a = 0;
		int i = 0;

		while (a < 100) {
			a = a + 5;
			i++;
			if (a >= 100) {
				System.out.println("需要天数为：" + i);
				break;
			}
			a = a - 2.5;
			int b = i % 5;
			if (b == 0) {
				a = a - 6;
			}

		}

	}

}
