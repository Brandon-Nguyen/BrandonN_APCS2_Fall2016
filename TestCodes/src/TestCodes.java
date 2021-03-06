import java.util.Arrays;

public class TestCodes {
	public static void main(String[] args){
		int min = -10;
		int max = 15;
		
		int count = min;
		int countOdd = 0;
		while(count <= max){
			if(count % 2 != 0){
				countOdd++;
			}
			count++;
		}
		
		int[] odds = new int[countOdd];
		int firstOdd = min;
		if(firstOdd % 2 == 0){
			firstOdd = min + 1;
		}
		for(int i = 0; i < odds.length; i++){
			odds[i] = (i * 2) + firstOdd;
		}
		
		System.out.println(Arrays.toString(odds));
	}
}
