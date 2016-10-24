import java.util.Arrays;

public class Split 
{

	public static void main(String[] args) 
	{
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
		//		it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples"split("really")
		//		it will split at the word "really" and return an array of ["I "," like "," apples!"]
		
		//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?
		
		
		System.out.println(Arrays.toString(mysplit("applesbreadpineapplesbreadlettustomatobaconmayohambreadcheese", "bread")));
		System.out.println(Arrays.toString("applesbreadpineapplesbreadlettustomatobaconmayohambreadcheese".split("bread")));
		
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" 
		 * describing a sandwich use String.split to split up the sandwich by the word "bread" 
		 * and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
	}
	public static String[] mysplit(String breadPhrase, String split){
		
		// Array for the return of the statement in between the breads
		String[] breadArr = breadPhrase.split("bread");
		
		//Creates array that will return the correct statement
		String[] breadReturn = new String[breadArr.length - 2];
		
		//Looks for the middle between the bread then returns that 
		for(int i = 0; i < breadReturn.length; i++){
			breadReturn[i] = breadArr[i+1];
		}
		return breadReturn;
	}
		
		
		//if there is no "bread" before this start here.
		//if there is no bread after this end here
		
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/

		

}
