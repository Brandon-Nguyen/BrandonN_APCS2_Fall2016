/**
 * 
 */

/**
 * @author APCS2
 *
 */
public class DoMath {
	public static void main(String[] args){
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(5));
		System.out.println(Calculate.average(2, 6));
		System.out.println(Calculate.average(4, 12, 8));
		System.out.println(Calculate.toDegrees(3));
		System.out.println(Calculate.toRadians(180.0));
		System.out.println(Calculate.discriminant(2, 3, 4));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2,  3,  6 , -7 , "n"));
		System.out.println(Calculate.isDivisibleBy(4, 2));
		System.out.println(Calculate.absValue(-5.6));
		System.out.println(Calculate.max(6,4));
		System.out.println(Calculate.max(100,9,7));
		System.out.println(Calculate.min(1, 2));
		System.out.println(Calculate.round2(27.9485));
		System.out.println(Calculate.exponent(2, 4));
		System.out.println(Calculate.factorial(5));
		System.out.println(Calculate.isPrime(7));
	}
}
