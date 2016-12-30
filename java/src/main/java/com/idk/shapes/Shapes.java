package com.idk.shapes;
import java.util.Scanner;

public class Shapes{
	   // Create a function that does the same thing for similar objects. Figure is under the same folder, so java knows to
	   // use that specific Figure.class
	   public static void printInfo(Figure f){
	        System.out.println("Area: " + f.getArea());
	        System.out.println("Perimeter: " + f.getPerim());
	    }
	   // Create a function getInput to save some lines of code, as both objects will do the same things anyways.
	   // int is what the function will return. ie: void means that the function will return nothing.
	   // static means that an object does not need to be instantiated to use it. ie: Will not be used as object.function();
	    public static int getInput(){
	        Scanner input = new Scanner(System.in);
	        boolean isValidInput = false;
	        int inputLength = 0;
	        while(!isValidInput){
	        	// Check if the value given by the user is an integer.
	            if(input.hasNextInt()){
	                inputLength = input.nextInt();
	                isValidInput = true;
	            }
	            // If not, print this out and get the next input, while going back into the loop.
	            else{
	                System.out.print("Please enter a valid integer. ");
	                input.next();                  
	            }
	        }
	        // return the value it was defined to return
	        return inputLength;
	    }
	    public static void main(String[] args){
	        System.out.print("What is the side length of your square? ");
	        // Redeclare variable, as it is not within the scope of getInput();
	        int inputLength = (getInput());       
	        // Create a new figure, a square. As it has different properties of a circle, it is necessary to create it as a 
	        // Square, so the formulas will not be mixed up.
	        Figure userSquare = new Square(inputLength);
	        // Execute printInfo func, with userSquare as its parameter.
	        printInfo(userSquare);
	        
	        System.out.print("What's the radius of a circle? ");
	        // Do the same for circle, but redefine the variable in accordance to mathematical terms
	        int inputRadius = (getInput());
	        // Create a new circle object, with the user defined inputRadius as its radius
	        Figure userCircle = new Circle(inputRadius);
	        // Execute printInfo func, with userCircle as its parameter.
	        printInfo(userCircle);
	    }
}
