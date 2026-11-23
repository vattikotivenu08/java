package com.javaintro;

public class Customer {
	static Customer s = new Customer();
	int accno;
	String name;
	int mobileno;
	int balance;
	String branch;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s.method1();
	}

	void method1() {

		s.accno = 232112444;
		s.name = "venu";
		s.mobileno = 798963059;
		s.balance = 56798765;
		s.branch = "sbi";
		s.method2();
	}

	void method2() {
		System.out.println("accno" + s.accno);
		System.out.println("name" + s.name);
		System.out.println("mobileno" + s.mobileno);
		System.out.println("balance" + s.balance);
		System.out.println("branch" + s.branch);

	}

}
