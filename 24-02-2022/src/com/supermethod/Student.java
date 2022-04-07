package com.supermethod;

public class Student extends Details {
	int id;
	String name;
	String schoolname;
	String fathername;
	static String  std;
	public  Student()
	{
		super();
		id=1;
		name="sri vidhya";
		schoolname= "vedhha vikass";
		fathername="sekar";
		System.out.println("student class Constructor");
		
		
	}
	static
	{
		std="tenth";
	}


public void  getInfo()
{

	
	System.out.println(id);
	System.out.println(name);
	System.out.println(schoolname);
	System.out.println(fathername);
	
	
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		

	}

}
