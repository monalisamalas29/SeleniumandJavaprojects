package com.mon;

public class Inheritance {
	
	int z;
	
	public void add(int x, int y) {
		z= x + y;
		System.out.println("The addition is" +z);
	}
	public void subtract(int x, int y)
	{
		z = x - y;
		System.out.println("The subtraction result is" +z);
	}
    public void multiple(int x, int y)
    {
    	z = x *  y;
    	System.out.println("The multiplication result is" +z);
    }
}
