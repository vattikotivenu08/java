package com.javaintro;

public class cricketer {

	static int country_id;
	static String country_name;
	int jersey_number;
	String cricketer_name;
	public static void main(String[] args) {
		System.out.println("Welcome to indian Cricket Team!!");
		country_id=91;
		country_name="india";
		System.out.println("Country ID:"+country_id);
		System.out.println("country Name:"+country_name);
		cricketer msd=new cricketer();
		msd.jersey_number=7;
		msd.cricketer_name="Mahendra Singh Dhoni";
		
	System.out.println("jersey Number:"+msd.jersey_number);
	System.out.println("Cricketr Name:"+msd.cricketer_name);
	cricketer vk =new cricketer();
	vk.jersey_number=18;
	vk.cricketer_name="viart kohli";
	System.out.println("Jesery Number:"+ vk.jersey_number);
	System.out.println("Cricketer Name:"+vk.cricketer_name);
	
		// TODO Auto-generated method stub

	}

}
