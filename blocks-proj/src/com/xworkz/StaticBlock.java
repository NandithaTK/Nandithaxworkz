package com.xworkz;

public class StaticBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=10;
		int b=20;
		int sum=(c+b);
		System.out.println(sum);
		StaticBlock blk = new StaticBlock();
		System.out.println(blk);
		
	}

	static{
		System.out.println("hi blocks");
		
	}
	
	{
		System.out.println("hi nanditha");
	}
}

