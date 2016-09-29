import java.util.*;

public class CollaborativeProgrammingExercise {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		
		int evenSum = 0;
		int largestEvenNum = userInput.nextInt();
		int max = userInput.nextInt();
		int min = max;
		System.out.print("Enter ten integers: ");
		int inputNum;
		for(int i = 0; i < 10; i++){
			inputNum = userInput.nextInt();
			
			if(inputNum % 2 == 0 && inputNum > largestEvenNum){
				inputNum = largestEvenNum;
				evenSum += inputNum;
			}else if(inputNum > max){
				max = inputNum;
			}else if(inputNum < min){
				min = inputNum;
			}else if(inputNum % 2 == 0){
				evenSum += inputNum;
			}
		}
		System.out.println("Max: ");
		System.out.println("Min: ");
		System.out.println("Sum of Even Numbers: ");
		System.out.println("Largest Even Number: ");
	}
}
