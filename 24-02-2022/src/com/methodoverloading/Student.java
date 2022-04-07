package com.methodoverloading;

public class Student {
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

public void getInfo()
{
	System.out.println(id);
	System.out.println(name);
	System.out.println(schoolname);
	System.out.println(fathername);
	
}
public void getInfo(int id, String name, String schoolname, String fathername)
{
	this.id=id;
	this.name=name;
	this.schoolname= schoolname;
	this.fathername= fathername;

	System.out.println(id);
	System.out.println(name);
	System.out.println(schoolname);
	System.out.println(fathername);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.getInfo();
		
		System.out.println("-----------------");
		
		s.getInfo(2,"naveen","SKC","mathi");
		

	}

}
