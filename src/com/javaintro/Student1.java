package com.javaintro;
public class Student1 {
static Student1 s= new Student1();
String name;
	int rollno;
	String branch;
	int mobileno;
	String clgname;

public static void main(String[] args) {
		s.method1();
	}
	static void method1(){

			s.name="venu";
			s.rollno=12196;
			s.branch="java";
			s.mobileno=2323423;
			s.clgname ="jcube";
			s.method2();
}
		void method2() {
			 System.out.println("name;"+s.name);
			 System.out.println("rollno;"+s.rollno);
			 System.out.println("brach;"+s.branch);
			 System.out.println("mobileno;"+s.mobileno);
			 System.out.println("clgname;"+s.clgname);
		}}
