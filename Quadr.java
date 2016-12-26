// Imported scanner class

import java.util.Scanner;

public class Quadr{
   public static void main(String[] args){
      // Declared a new Scanner
      Scanner scanner = new Scanner(System.in);
      System.out.print("Quadratic formula is ax^2+bx+c. Please enter a: ");
      // Take input from user and make it into an int a
      int a = scanner.nextInt();
      // Check if quadratic is valid, exit if not
      if(a == 0){
         System.out.println("a may not be 0. Please enter a valid quadratic equation.");
	 System.exit(0);
      }
      System.out.print("Please enter b: ");
      int b = scanner.nextInt();
      System.out.print("Please enter c: ");
      int c = scanner.nextInt();
      // Declare variables for calculations
      int bsq = b * b;
      int det = (bsq - 4 * a * c);
      // Make the rt(b^2 - 4ac) a decimal. Must declare Math.sqrt as same as desired output IN PARENTHESIS, or else compiler will complain
      float rtdet = (float) Math.sqrt(det);

      if(det < 0){
         System.out.println("Answer is non-real.");
      }
      else if(det > 0){
         float sol1 = ((-1 * b + rtdet) / 2 * a);
	 float sol2 = ((-1 * b - rtdet)/ 2 * a);
	 System.out.println("Answers are (" + sol1 + ", 0) and (" + sol2 + ", 0)");
      }
      else{
         float sol1 = (-1 * b/ 2 * a);
	 System.out.println("Answer is (" + sol1 + ", 0)");
      }
   }
}
