import java.util.Arrays;

public class LotsOfCopies {
	public static void main(String[] args){
		int num = 7;
		System.out.println(num);
		int num2 = num;
		num = 10;
		
		String strMain = "APCS";
		System.out.println(strMain);
		String newStr = strMain;
		strMain = "Bacon :)";
		
		int[] arrMain = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arrMain));
		int[] newArr = arrMain;
		for(int i = 0; i < arrMain.length; i++){
			arrMain[i] += 2;
		}

		System.out.println(num);
		System.out.println(strMain);
		System.out.println(Arrays.toString(arrMain));
		
		System.out.println(num2);
		System.out.println(newStr);
		System.out.println(Arrays.toString(newArr));
		changeMe(num, strMain, arrMain);
		
		System.out.println("");
		
		System.out.println(num);
		System.out.println(strMain);
		System.out.println(Arrays.toString(arrMain));
	}
	public static void changeMe(int x, String str, int[] arr){
		x += 5;
		str += "I like bacon!";
		for(int i = 0; i < arr.length; i++){
			arr[i] += 6;
		}
	}
}