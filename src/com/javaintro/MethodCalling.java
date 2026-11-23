package com.javaintro;

public class MethodCalling {
	static MethodCalling t= new MethodCalling();
	
	
	static void method1() {

	method2();
	method3();
	method4();
		System.out.println("method calling 1");
	}
	static void method4() {
		System.out.println("method calling 4");
	}

	public static void main(String[] args) {
		System.out.println(" main method calling stated");
		method1();
	
		System.out.println("main method calling ended");
		// TODO Auto-generated method stub

	}
	 static void method2() {
		System.out.println("method calling 2");
	
	}
	   static void  method3(){
		 System.out.println( "method calling 3");
	 }
}
