// Brandon Nguyen, 10/30/16, 2nd Period

import java.util.Arrays;

public class Split 
{

	public static void main(String[] args) 
	{

		// show code that played with
		System.out.println(Arrays.toString("I like apples!".split(" ")));
		System.out.println(Arrays.toString("Bacon tastes really good. Bacon is amazing".split("Bacon")));
		System.out.println(Arrays.toString("I really like really like really want red apples".split("really")));
		System.out.println(Arrays.toString("I really really like bacon".split("really")));
		System.out.println(Arrays.toString("I want boba. boba makes life so much better".split("boba")));
		System.out.println(Arrays.toString("I like bacon and pancakes. I like waffles too!".split("like")));
		
		System.out.println("Real Code Below. Playing with Split Above");
		
		// make multiple tests for each thing
		System.out.println(splitBread("applespineapplesbreadlettustomatobaconmayohambreadcheese"));
		System.out.println(splitBread("breadbreadhambaconcheese"));
		System.out.println(splitBread("hambaconbreadcheese"));
		System.out.println(splitBread("hambaconbreadbreadcheesemoreham")); 
		System.out.println(splitBread("hambreadbaconcheesebread"));
		System.out.println(splitBread("breadhambreadbaconcheese"));
		System.out.println(splitBread("hambreadbaconbreadcheese"));
		System.out.println(splitBread("hambaconcheesebreadbread"));
		
		
		System.out.println("The second method");
		
		splitSpacesAndBread("applespineapplesbreadlettustomatobaconmayohambreadcheese");
		splitSpacesAndBread("breadbreadhambaconcheese");
		splitSpacesAndBread("hambaconbreadcheese");
		splitSpacesAndBread("hambaconbreadbreadcheesemoreham"); // prints two blanks
		splitSpacesAndBread("hambreadbaconcheesebread");
		splitSpacesAndBread("breadhambreadbaconcheese");
		splitSpacesAndBread("hambreadbaconbreadcheese");
		splitSpacesAndBread("hambaconcheesebreadbread");
		
		
	}
	
	
	//String.split();
	//It's a method that acts on a string, <StringName>.split(<String sp>);
	//Where sp is the string where the string splits
	//And it returns an array
	// Example: "I like apples!".split(" "); 
	//		it will split at spaces and return an array of ["I","like","apples!"]
	// Example 2: "I really like really red apples".split("really")
	//		it will split at the word "really" and return an array of ["I "," like "," red apples!"]
	
	//play around with String.split! what happens if you "I really really like apples".split("really") ?
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" 
		 * describing a sandwich use String.split to split up the sandwich by the word "bread" 
		 * and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
	
	public static String splitBread(String ingredients){
		String sandwich = "";
		
		//adds a space before and after in order to make the statement not have 
		//bread at the end of the statement or the beginning
		String addSpaces = " " + ingredients + " ";
		
		String[] breadArr = addSpaces.split("bread");
		
		//Checks to see if the array is longer than 2
		if(breadArr.length > 2){
			
			//Assigns the parts of the bread array into the sandwich that will later be returned
			for(int i = 1; i < breadArr.length - 1; i++){
				sandwich = breadArr[i];
			}
		}else{
			
			//There wasn't more than 2 peices of bread so return not enough
			return("That's not enough bread to make a sandwich :(");
		}
		return sandwich;
	}
	
			
		//if there is no "bread" before this start here.
		//if there is no bread after this end here
		
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" 
		 * describing a sandwich use String.split to split up the sandwich at the spaces, " ", and 
		 * return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/
	public static void splitSpacesAndBread(String ingredients){
		//gets rid of the spaces then puts it into an array
		String[] spaceSplit = ingredients.split(" ");
		
		//Creates a statement that holds the split, and later, the sandwich
		String sandwich = "";
		for(int i = 0; i < spaceSplit.length; i++){
			sandwich += spaceSplit[i];
		}
		
		//inputs the array into splitBread to take out the sandwich
		sandwich = splitBread(sandwich);
	
		System.out.println(sandwich);
	}
}

