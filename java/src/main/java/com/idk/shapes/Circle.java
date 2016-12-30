package com.idk.shapes;
// Implement figure interface, so that it is under that umbrella.
public class Circle implements Figure{
    int radius;
    public double getArea(){
        return (Math.pow((3.14 * (double)radius), 2));
    }
    public double getPerim(){
        return (2 * radius * 3.14);
    }
    public Circle(int circRadius){
        // this.variable = parameter.
    	this.radius = circRadius;
    }
}
