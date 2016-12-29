package com.idk.shapes;
// Implement figure interface, so it is under that umbrella.
public class Square implements Figure{
    int sideLength;
    public double getArea(){
        return (sideLength * sideLength);
    }
    public double getPerim(){
        return (sideLength * 4);
    }
    public Square(int shapeLength){
    	// this.variable = parameter
        this.sideLength = shapeLength;
    }
 
}
