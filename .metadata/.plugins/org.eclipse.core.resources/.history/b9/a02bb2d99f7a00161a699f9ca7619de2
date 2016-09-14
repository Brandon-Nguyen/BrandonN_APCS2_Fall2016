/**
 * 
 */

/**
 * @author APCS2
 *
 */
public class Calculate {
	public static int square(int number) {
		return (number * number);
	}

	public static int cube(int number) {
		return (number * number * number);
	}

	public static double average(double num1, double num2) {
		return ((num1 + num2) / 2.0);
	}

	public static double average(double num1, double num2, double num3) {
		return ((num1 + num2 + num3) / 3.0);
	}

	public static double toDegrees(double num) {
		return ((num * 180.0) / 3.14159);
	}

	public static double toRadians(double num) {
		return ((num * 3.14159) / 180.0);
	}

	public static double discriminant(double num1, double num2, double num3) {
		return ((num2 * num2) - (4 * num1 * num3));
	}

	public static String toImproperFrac(int num1, int num2, int num3) {
		return ("\"" + (num1 * num3 + num2) + "/" + num3 + "\"");
	}

	public static String toMixedNum(int num1, int num2) {
		return ("\"" + (num1 / num2) + "_" + (num1 % num2) + "/" + num2 + "\"");
	}

	public static String foil(int num1, int num2, int num3, int num4, String var) {
		int a = (num1 * num3);
		int b = ((num1 * num4) + (num2 * num3));
		int c = (num2 * num4);
		return ("\"" + a + var + "^2" + " + " + b + var + " + " + c + "\"");
	}

	public static boolean isDivisibleBy(int num1, int num2) {
		if (num1 % num2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static double absValue(double num) {
		if (num > 0) {
			return (num);
		} else {
			return (num * -1);
		}
	}

	public static int max(int num1, int num2) {
		if (num1 > num2) {
			return (num1);
		} else {
			return (num2);
		}
	}

	public static double max(double num1, double num2, double num3) {
		if (num1 > num2 && num1 > num3) {
			return (num1);
		} else if (num2 > num1 && num2 > num3) {
			return (num2);
		} else {
			return (num3);
		}
	}

	public static int min(int num1, int num2) {
		if (num1 > num2) {
			return (num2);
		} else {
			return (num1);
		}
	}

	public static double round2(double num) {
		num = num * 100 + .5;
		return ((int) num / 100.0);
	}

	public static double exponent(double num1, int num2) {
		double product = 1;
		for (int i = 1; i <= num2; i++) {
			product = num1 * product;
		}
		return (product);
	}

	public static int factorial(int num) {
		int product = 1;
		for (int i = 1; i <= num; i++) {
			product = product * i;
		}
		return (product);
	}

	public static boolean isPrime(int num) {
		boolean prime = true;
		for (int i = 2; i < num; i++) {
			if (Calculate.isDivisibleBy(num, i) == true) {
				prime = false;
			}
		}
		return prime;
	}

	public static int gcf(int num1, int num2) {
		int smallNum = Calculate.min(num1, num2);
		int largeNum = Calculate.max(num1, num2);
		int factor = 1;
		while (smallNum != factor) {
			smallNum = largeNum - smallNum;
			smallNum = factor;
			if (smallNum > largeNum) {
				largeNum = smallNum;
			}
		}
		return factor;
	}

	public static double sqrt(double num) {

	}
}