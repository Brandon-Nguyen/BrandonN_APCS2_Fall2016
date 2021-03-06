// Brandon Nguyen, 10/2/16, 3rd Period
import java.util.*;

public class CollabProgramming {
	public static void main(String[] args){
		//Sets up scanner
		Scanner userInput = new Scanner(System.in);
		
		//Prompts the user for input
		System.out.print("How many numbers do you want to enter? ");
		int inputNums = userInput.nextInt();
		
		// Prompts the user for a set amount of numbers
		System.out.print("Enter " + inputNums + " numbers: ");
		
		// Initializing variables used
		int evenSum = 0;
		
		// sets max, and largest even number as small numbers which 
		//will be changed later on in the code
		int max = -100;
		int largestEvenNum = -100;
		
		// sets min to a large number which will be changed later on
		int min = 100;

		//For loop that goes through the String array
		for(int i = 0; i < inputNums; i++){
			int input = userInput.nextInt();
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
		//Prints out the largest number out of the string, the smallest,  
		//the sum of the even numbers, and the largest even number.
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		System.out.println("Sum of Even Numbers: " + evenSum);
		System.out.println("Largest Even Number: " + largestEvenNum);
	}
}