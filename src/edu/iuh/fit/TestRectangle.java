package iuh.fit.se;

import java.util.Scanner;

/**
 * @description: This class represents a bank with many bank accounts
 * @author: Phi, Nguyen Dinh
 * @version: 1.0
 * @created: 8/24/2024 22:15 PM
 */
public class TestRectangle {
    public static void main(String[] args) {
        //
        Rectangle re1 = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width: ");
        re1.setWidth(sc.nextDouble());
        System.out.println("Enter length: ");
        re1.setLength(sc.nextDouble());
        System.out.println("Area: " + re1.getArea());
        System.out.println("Perimeter: " + re1.getPerimeter());
        System.out.println("String to Rectangle: " + re1.toString());
    }
}