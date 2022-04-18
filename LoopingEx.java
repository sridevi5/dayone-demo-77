package com.wipro.fundamentals;

public class LoopingEx {
	public static void main(String[] args) {
		//Print numbers 1-10
		for(int i=1;i<=10;i+=2) {
			System.out.println(i);
		}
		//Print sum of number from 1 -10
		int s=0,m=1;
		for(int i=1;i<=10;i++) {
			s+=i;
			m*=i;
		}
		System.out.println("Sum : "+s+" Product : "+m);
		//print only odd/even numbers between 50-100
		//sum of odd/even numbers between 50-100
		int se=0,so=0;
		for(int i=50;i<=100;i++) {
			if(i%2==0) {
				System.out.println(i+" is Even");
			    se+=i;
			}
			else {
				System.out.println(i+" is Odd");
			    so+=i;
			}
		}
		System.out.println("Sum of even: "+se);
		System.out.println("Sum of odd: "+so);
		
	}
}
