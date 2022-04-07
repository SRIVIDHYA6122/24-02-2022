package com.covarientreturntype;

public class Student extends Details {
	int id;
	String name;
	String schoolname;
	String fathername;
	static String  std;
	public  Student()
	{
		id=1;
		name="sri vidhya";
		schoolname= "vedhha vikass";
		fathername="sekar";
		
		
	}
	static
	{
		std="tenth";
	}


public Student getInfo()
{


	System.out.println(id);
	System.out.println(name);
	System.out.println(schoolname);
	System.out.println(fathername);
	return null;
	
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.getInfo();
		
		System.out.println("-----------------");
		
		
		
		Details d= new Details();
		d.getInfo();

	}

}
