// Brandon Nguyen, 2nd Period, 9/23/16

public class DoMath {
	public static void main(String[] args){
		System.out.println(Calculate.square(-10));
		System.out.println(Calculate.cube(-5));
		System.out.println(Calculate.average(-10, 20));
		System.out.println(Calculate.average(-5, 10, 15));
		System.out.println(Calculate.toDegrees(23));
		System.out.println(Calculate.toRadians(234.0));
		System.out.println(Calculate.discriminant(-1, 4, 6));
		System.out.println(Calculate.toImproperFrac(5, 1, 2));
		System.out.println(Calculate.toMixedNum(17, 5));
		System.out.println(Calculate.foil(2,  3,  6 , -7 , "n"));
		System.out.println(Calculate.isDivisibleBy(2, 5));
		System.out.println(Calculate.absValue(-5.6));
		System.out.println(Calculate.max(6,4));
		System.out.println(Calculate.max(100,9,7));
		System.out.println(Calculate.min(1, 2));
		System.out.println(Calculate.round2(27.9485));
		System.out.println(Calculate.exponent(2, 4));
		System.out.println(Calculate.factorial(5));
		System.out.println(Calculate.isPrime(4));
		System.out.println(Calculate.gcf(48,  64));
		System.out.println(Calculate.sqrt(50));
		System.out.println(Calculate.quadForm(2, 10, 5));
	}
}
