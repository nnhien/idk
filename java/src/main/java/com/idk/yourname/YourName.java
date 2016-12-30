package com.idk.yourname;
// Make the Class name the same as filename.java
public class YourName{
	// String[] and args are required for the program to run. It will compile without it, however. "args" is the name of the String[] array
	public static void main(String[] args){
	    int nameListLength = args.length;
		// Print number of names
		// Was for testing Array, not needed
		System.out.println("Number of names: " + nameListLength);
		// Execute if there are more than 2 names
		if(nameListLength > 1){
			// "Hello" is outside of loop, so it doesn't repeat itself every single time 
			System.out.print("Hello ");
			// For loop, initialize counter.
			for(int counter = 0; counter < nameListLength; counter++){
			// Check if array has reached the end. Does this by seeing if the counter = number of names in the list minus 1, due to index 0.
				if(counter == nameListLength-1){
			// Println so that that one weird symbol doesn't appear at the end of the string. May also use System.out.print("String here"\n); 		
					System.out.println("and " + args[counter] + "!");
				}
			// Repeat names if haven't reached the end of the array yet
				else{
					System.out.print(args[counter] + ", ");
				}
			}
		}
		// Execute if there is only one name given
		else if(nameListLength == 1){
			System.out.println("Hello " + args[0] + "!");
		}
		// Execute if no name is given
		else{
			System.out.println("Hello there!");
		}
	} 

}
