// Brandon Nguyen, 11/5/16, 2nd Period

package arrays_materials;

import java.util.Arrays;

public class ArraysLab3 
{
	/*
	 * Write a method named sum that accepts two arrays of integers arr1 and arr2 
	 * and returns an array of integers, 
	 * in which every element is the sum of the elements at that index for the arrays arr1 and arr2. 
	 * You can assume arrays arr1 and arr2 have at least one element each and are the same length.
	 */
	public static int[] sum(int[] arr1, int[] arr2)
	{
		assert (arr1.length > 0);
		assert (arr2.length > 0);
		assert (arr1.length == arr2.length);
		
		//creates an array that will be returned later
		int[] sumArr = new int[arr1.length];
		
		//assings the values to the array by adding the values of both arrays at the index
		for(int i = 0; i < sumArr.length; i++){
			sumArr[i] = arr1[i] + arr2[i];
		}
		
		/*//prints out the array to see what is inside
		System.out.println(Arrays.toString(sumArr));*/
		
		return sumArr;
	}
	
	/*
	 * Write a method named append that accepts an array of integers arr of length n 
	 * and an integer num, and returns an array of integers of length n+1 
	 * that consists of the elements of arr with num appended to the end.  
	 * You can assume array arr has at least one element.
	 */
	public static int[] append(int[] arr, int num)
	{
		assert (arr.length > 0);
		
		//create an array with an extra space for the number being added into the array
		int[] appendArr = new int[arr.length + 1];
		
		// adds the previous values of the array into the new array
		for(int i = 0; i < arr.length; i++){
			appendArr[i] = arr[i];
		}
		
		//adds the input into the array after everything else had been filled up
		appendArr[appendArr.length - 1] = num;
		
		/* //prints array to see if values are correct
		System.out.println(Arrays.toString(appendArr));*/
		
		return appendArr;
		
	}
	
	/*
	 * Write a method named remove that accepts an array of integers arr and an integer idx 
	 * and returns an array of integers consisting of all of the elements of arr 
	 * except for the element at index idx (thus, the returned array has a length of arr.length – 1).  
	 * You can assume arr has at least two elements.
	 */
	public static int[] remove(int[] arr, int idx)
	{
		assert (arr.length >= 2);
		
		//creates an array with one less space to take out the index and return it
		int[] removeArr = new int[arr.length - 1];
		//checks to see if the index had been removed yet
		int isIndexDone = 0;
		
		//fills in the new array with values from the old one
		for(int i = 0; i < removeArr.length ; i++){
			// when the index are the same its going to make the value at the index the next value over
			if(i == idx){
				removeArr[i] = arr[i + 1];
				//makes it so that the indexing had been done
				isIndexDone ++;
			}else if(isIndexDone > 0){
				//after index is done and value ordering is weird so continues to take from right side
				removeArr[i] = arr[i + 1];
			}else{
				//if indexing had not been done yet and values are still in normal order
				removeArr[i] = arr[i];
			}
		
		}
		
		/* //prints out the array to check if values are similar
		System.out.println(Arrays.toString(removeArr)); */
		
		return removeArr;
	}
	
	/*
	 * Write a method sumEven that accepts an array of integers arr 
	 * and returns an integer containing the sum of the elements at the even indices of arr.  
	 * (That means elements at indices 0,2,4,6,8.)  You can assume arr has at least one element.
	 */
	public static int sumEven(int[] arr)
	{
		assert (arr.length > 0);
		
		// creates the variable that stores the answer
		int sum = 0;
		
		// goes through the array and picks out the numbers at even indexes and adds them to sum
		for(int i = 0; i < arr.length; i++){
			if(i % 2 == 0){
				sum += arr[i];
			}
		}
		
		/* //prints out value to see if correct
		System.out.println(sum);*/
		
		return sum;
		
	}
	
	/*
	 * Write a method rotateRight that accepts an array of integers arr 
	 * and does not return a value.  
	 * The rotateRight method moves each element of arr one index to the right 
	 * (element 0 goes to element 1, element 1 goes to element 2, …, element n-1 goes to element 0).  
	 * You can assume arr has at least one element.
	 */
	public static void rotateRight(int[] arr)
	{
		assert (arr.length > 0);
		
		// creates an integer that stores the last variable
		int tempVar = arr[arr.length - 1];
		
		//starts at end of array and moves values from left to right, 
		//then adds the last number when it hits the beginning of the array
		for(int i = arr.length - 1; i >= 0; i--){
			if(i == 0){
				arr[i] = tempVar;
			}else{
				arr[i] = arr[i - 1];
			}
		}
		
		/* //prints out the value to see if similar to expected output
		System.out.println(Arrays.toString(arr));*/
		
	}

	/*
	 * Write a main method that will 
		Contain
			integer arrays a1, a2, sumArr, appendArr, removeArr
			int variables appendNum, removeIdx, sumOfEvens
		Carry out the following actions
			Declare array a1 containing the values (5, 10, 15, 20, 25, 30, 35, 40) 
			and array a2 containing the values (7, 14, 21, 28, 35, 42, 49, 56)
			Form sumArr by calling the sum method with a1 and a2 as inputs
			Declare int appendNum and set it to 200.
			Form appendArr by calling the append method with a1 and appendNum as inputs
			Declare int removeIdx and set it to 5.
			Form removeArr by calling remove with a2 and removeIdx
			Form sumOfEvens by calling sumEven with appendArr as the input
			Call rotateRight with a1 as the input
			On their own lines print out (use Arrays.toString to transform arrays into a printable strings) :
				sumArr
				appendArr
				removeArr
				sumOfEvens (an int you don’t need Arrays.toString)
				a1
	 */
	
	public static void main(String[] args) 
	{
		
	}
}
