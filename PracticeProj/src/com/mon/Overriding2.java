package com.mon;

public class Overriding2 extends Overriding1 {

	public void add()
	{
		System.out.println("addon");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overriding2 o = new Overriding2();
		Overriding1 l = new Overriding1();
		l.add();
		
		//o.add();
		//System.out.println();

	}

}
