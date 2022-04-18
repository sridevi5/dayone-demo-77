package com.wipro.calculator;
import java.util.Scanner;
public class AreaCalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Select an option from list to calculate area of fence");
	        System.out.println("1. Square area for the chickens");
	        System.out.println("2. Circular area for ducks");
	        System.out.println("3. Rectangular area for cows");
	        System.out.println();
	        // Input choice from user
	        int choice = scanner.nextInt();

	        // Make a call to calculateAreaOfFence(int choice) and pass the choice made by user to it
	        calculateAreaOfFence(choice);
	    }

	    // Function to calculate area of fence by calling respective methods according to user's choice
	    public static void calculateAreaOfFence(int choice) {
	        Scanner scanner = new Scanner(System.in);
	        switch(choice){
	            case 1:System.out.println("Enter side of square :");
	            double side=scanner.nextDouble();
	            double r1=calculateAreaOfSquare(side);
	            System.out.println("Area of square fence for chickens is "+r1);
	            break;

	            case 2:System.out.println("Enter radius of circle :");
	            double radius=scanner.nextDouble();
	            double r2=calculateAreaOfCircle(radius);
	            System.out.println("Area of circular fence for ducks is "+r2);
	            break;

	            case 3:System.out.println("Enter length and breadth of rectangle :");
	            double length=scanner.nextDouble();
	            double breadth=scanner.nextDouble();
	            double r3=calculateAreaOfRectangle(length,breadth);
	            System.out.println("Area of rectangular fence for ducks is "+r3);
	            break;

	            default: break;
	        }
	    }

	    // Function to calculate area of square
	    public static double calculateAreaOfSquare(double side) {
	        double r1=side*side;
	        return r1;
	    }

	    // Function to calculate area of circle
	    public static double calculateAreaOfCircle(double radius) {
	        double r2=radius*radius*(22/7);
	        return r2;
	    }

	    // Function to calculate area of rectangle
	    public static double calculateAreaOfRectangle(double length, double breadth) {
	        double r3=length*breadth;
	        return r3;
	    }

}
