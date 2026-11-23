package com.javaintro;

public class Student {
	static int id;
	static String branch;
	int roll ;
	String age;
	public static void main(String[] args) {
		System.out.println("Student table");
		id=1;
		branch="cse";
		System.out.println(" id:"+id);
		System.out.println("brach:"+branch);
	Student venu =new Student();
	venu.roll= 17;
	venu.age="five";

		System.out.println("roll:"+venu.roll);
		System.out.println("age:"+venu.age);
		Student ravi=new Student();
		ravi.roll=12;
		ravi.age="six";
		System.out.println("roll:"+ravi.roll);
		System.out.println("roll:"+ravi.age);

		
		
		// TODO Auto-generated method stub

	}

}

