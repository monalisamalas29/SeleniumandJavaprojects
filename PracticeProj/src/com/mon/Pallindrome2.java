package com.mon;

public class Pallindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "rasna";
		String output = "";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			char reverse = input.charAt(i);
			output=output+reverse;
		}
		System.out.println(output);
		if(input.equals(output)) {
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not Pallindrome");
		}

	}

}
