package com.mon;

public class Interface2 implements Interface1 {
	
	public void run()
	{
		System.out.println("running");
	}
	public void stand()
	{
		System.out.println("standing");
	}
	
	

	public static void main(String[] args) {
		Interface2 b = new Interface2();
		b.run();
		b.stand();
		

	}
		
	}


