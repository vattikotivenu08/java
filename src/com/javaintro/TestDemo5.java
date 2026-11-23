package com.javaintro;

public class TestDemo5 {
	static TestDemo5 t=new TestDemo5();
	static {
		System.out.println("static block 1");
	
	}


		 
		// TODO Auto-generated method stub

	
	{
	
		System.out.println("instance block 1");
		
	}
	void main(String[] args) {
		 System.out.println("main method started !!"); 
		 System.out.println("main method ended !!");    

	}
}
