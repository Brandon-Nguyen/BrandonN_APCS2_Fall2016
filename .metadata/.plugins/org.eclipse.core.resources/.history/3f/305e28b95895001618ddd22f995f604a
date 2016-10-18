
public class Hourglass {
	public static void main(String[] args) {
		printBase(); //Print the firstline
		topHalfAndMiddle(); //Print the top half
		bottomHalf(); //Print bottom half
		printBase(); // Print base
	}

	public static void printBase(){
		System.out.print("|");
		for(int i = 1; i <= 10; i++){
			System.out.print("\"");
		}
		System.out.println("|");
	}
	public static void topHalfAndMiddle(){
		for (int i = 1; i <= 5; i++){//print each line
			//print spaces
			if(i == 5){
				for(int k = 1; k <= 5; k++){
					System.out.print(" ");
				}
				System.out.println("||");
			}else{
				for (int j=1; j <= i; j++){
					System.out.print(" ");
				}
				System.out.print("\\");
				for (int j=5; j - i > 0; j--) { 
					System.out.print("::");
				}
				System.out.println("/");
			}
		}
	}

	public static void bottomHalf(){
		for(int i = 4; i <= 1; i--){
			for(int j = i; j <= 0; j--){
				System.out.print(" ");
			}
			System.out.print("\\");
			for(int k = i; k >= 0; k--){
				System.out.print("::");
			}
			System.out.println("/");
		}
	}
}