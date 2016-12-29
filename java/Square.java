import java.util.Scanner;

public class Square{
    int sideLength;
    public int getArea(){
        return (sideLength * sideLength);
    }
    public int getPerim(){
        return (sideLength * 4);
    }
    public double getDiag(){
        return (sideLength * Math.sqrt(2));
    }
    public Square(int shapeLength){
        this.sideLength = shapeLength;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the side length of your square? ");
        int inputLength1 = input.nextInt();
        Square userSquare1 = new Square(inputLength1);
        System.out.println("Area: " + userSquare1.getArea());
        System.out.println("Perimeter: " + userSquare1.getPerim());
        System.out.println("Diagonals: " + userSquare1.getDiag());
        System.out.print("What's the side length of another square? ");
        int inputLength2 = input.nextInt();
        Square userSquare2 = new Square(inputLength2);
        System.out.println("Area: " + userSquare2.getArea());        
        System.out.println("Perimeter: " + userSquare2.getPerim()); 
        System.out.println("Diagonals: " + userSquare2.getDiag());
    }
}
