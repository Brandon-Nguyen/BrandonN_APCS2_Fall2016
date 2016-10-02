// Brandon Nguyen, 10/1/16, 3rd Period

import java.util.*;

public class CollabProgramming {
	public static void main(String[] args){
		//Sets up scanner and prompts user for input
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter a string of numbers: ");
		String inputNums = userInput.nextLine();
		
		//changes the string to a string array and takes out all of the spaces in it
		String[] stringNum = inputNums.split(" ");
		
		// Initializing variables used
		int evenSum = 0;
		int max = Integer.parseInt(stringNum[0]);
		int min = max;
		int largestEvenNum = max;
		
		//For loop that goes through the String array
		for(int i = 0; i < stringNum.length; i++){
			//Changes the numbers in the string to ints so that they can be used
			int input = Integer.parseInt(stringNum[i]);
			if(input % 2 == 0){
				if(input > largestEvenNum){
					largestEvenNum = input;
				}
				evenSum += input;
			}
			if(input > max){
				max = input;
			}
			if(input < min){
				min = input;
			}
		}
		
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		System.out.println("Sum of Even Numbers: " + evenSum);
		System.out.println("Largest Even Number: " + largestEvenNum);
	}
}