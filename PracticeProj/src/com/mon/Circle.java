package com.mon;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double pie = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius");
		int r = sc.nextInt();
		
		double c = (pie*r*r);
		System.out.println("The output is" +c);
		
		

	}

}
