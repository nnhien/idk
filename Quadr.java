import java.util.Scanner;

public class Quadr{
   
   int a;
   int b;
   int c;
   int det;

   public static void main(String[] args){
      
      Scanner scanner = new Scanner(System.in);
      System.out.print("Quadratic formula is ax^2+bx+c. Please enter a: ");
      int a = scanner.nextInt();
      if(a == 0){
         System.out.println("a may not be 0. Please enter a valid quadratic equation.");
         System.exit(0);
      }
      System.out.print("Please enter b: ");
      int b = scanner.nextInt();
      System.out.print("Please enter c: ");
      int c = scanner.nextInt();
      int bsq = b * b;
      int det = (bsq - 4 * a * c);
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
