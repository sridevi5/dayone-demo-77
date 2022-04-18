package com.wipro.calculator;
import java.util.Scanner;
public class Calculator {
	public static void main(String args[]) {
		Scanner scan= new Scanner(System.in);
		int n1,n2,result;
		System.out.println("enter the number 1:");
		n1=scan.nextInt();
		System.out.println("enter the number 2:");
		n2=scan.nextInt();
		result=n1+n2;
		System.out.println("Sum :"+ result);
		System.out.println("Welcome to StackRoute Program");
	}

}
