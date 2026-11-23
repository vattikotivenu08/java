package com.javaintro;

public class TestDemo4 {
	static TestDemo4 t=new TestDemo4();
	static void method5() {
		System.out.println("method5 called");
		t.method6();
	}
	void method6() {
		System.out.println("method6 called");
	}
	static void method2() {
		t.method3();
		System.out.println("method2 called");
	}

static void method1() {
	method2();
	System.out.println("method1 called");
}
	public static void main(String[] args) {
		System.out.println("main method started");
		method1();
		System.out.println("main method ended ");}
	
void method3() {
	method4();
	System.out.println("method3 called");
}
void method4() {
	System.out.println("method4 called");
	method5();

	}

}
