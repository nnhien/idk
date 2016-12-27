import java.util.ArrayList;

public class Prime{
    public static void main(String[] args){
        // Initialize Arrays. Initialization = Declaring and Assigning a variable for the first time.
        // Booleans and Arrays are examples of variables that must be initialized, or else the compiler will complain.
        ArrayList<Integer> remainArray = new ArrayList<Integer>();
        ArrayList<Integer> knownPrimes = new ArrayList<Integer>();
        // Add initial set of primes into the knownPrimes array
        knownPrimes.add(2);
        knownPrimes.add(3);
        knownPrimes.add(5);
        // Set original testNum. Must be greater than 1, or else program will hang on 1. Made into int value because arrayName.get doesn't support
        // long values.
        int testNum = 2;
        // Variables used outside of a bracket of code must be initialized outside that bracket, then assigned a value within that bracket.
        // That assignment will carry over to other brackets of code.
        int primeArrayPos;
        boolean prime = true;
        boolean run = false;
        System.out.print("1 2 3 5 ");
        while(run){
            // Reset remainArray. Since already reset in first calculation, does nothing.
            // Mainly to reset for subsequent calculations.
            remainArray = new ArrayList<Integer>();
            // Loop so that each number in the knownPrimes array will divide the testNum
            for(primeArrayPos = 0; primeArrayPos < knownPrimes.size(); primeArrayPos++){
                // Check if there is a remainder when dividing testNum by each number in the knownPrimes array
                int remainCheck = (testNum % knownPrimes.get(primeArrayPos));
                // Add all remainders (even 0) to a seperate array for later use
                remainArray.add(remainCheck);
            }   
            // Program will exit for loop when reaching its stop perameter, so no need to create an if statement to check if it has reached
            // the end of the array. 
            int remainArrayPos;
            // Loop for each value in the remainArray
            for(remainArrayPos = 0; remainArrayPos < remainArray.size(); remainArrayPos++){
                // If the value in the remainder array is equal to 0, leave the loop and start again while adding one to the
                // testNum. Also set prime to false, so below if statement doesn't get run.
                if(remainArray.get(remainArrayPos) == 0){
                    prime = false;
                    testNum++;
                    break;
                }
                // If none of the values encountered equal 0, set prime to true.
                else{
                    prime = true;
                }
            }
            // If you've reached the end of the remainArray, and the number is prime, push the testNum to the console,
            // add it to the knownPrimes array, add one to it, then reset all other values.
            if(remainArrayPos == remainArray.size() && prime){
                System.out.print(testNum + " ");
                prime = false;
                primeArrayPos = 0;
                remainArrayPos = 0;
                knownPrimes.add(testNum);
                testNum++;
            }
        }   
    }
}
