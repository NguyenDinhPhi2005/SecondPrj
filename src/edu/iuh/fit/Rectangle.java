package iuh.fit.se;

/**
 * @description: This class represents a bank with many bank accounts
 * @author: Phi, Nguyen Dinh
 * @version: 1.0
 * @created: 8/27/2024 22:02 PM
 */
public class Rectangle {
    private double length;
    private double width;
    /** Deffaut constructor*/
    public Rectangle (){
        length = 0;
        width = 0;
    }
    /** Parameterized constructor*/
    public Rectangle (double length, double width){
        if(length < 0 || width < 0){
            throw new IllegalArgumentException("Length and width must be greater than 0");
        }
        this.length = length;
        this.width = width;
    }
    /** Getter for length*/
    public double getLength() {
        return length;
    }
    /**Getter for width*/
    public double getWidth() {
        return width;
    }
    /** Setter for length*/
    public void setLength(double length) {
        if(length < 0){
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        this.length = length;
    }
    /** Setter for width*/
    public void setWidth(double width) {
        if(width < 0){
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = width;
    }
    /** Method to calculate area
     * */
    public double getArea(){
        return length * width;
    }
    /**Method to calculate perimeter*/
    public double getPerimeter(){
        return 2 * (length + width);
    }
    /**Method to return a string representation of the rectangle*/
    @Override
    public String toString(){
        return "Rectangle [length = " + length + ", width = " + width + ", Area = " + getArea() + ", Perimeter = " + getPerimeter() + "]";
    }

}
