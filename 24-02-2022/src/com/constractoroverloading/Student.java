package com.constractoroverloading;

public class Student {
	int id;
	String name;
	String schoolname;
	String fathername;
	public  Student()
	{
		id=1;
		name="sri vidhya";
		schoolname= "vedhha vikass";
		fathername="sekar";
		
	}
public Student(int id, String name, String schoolname, String fathername)
{
	this.id=id;
	this.name=name;
	this.schoolname= schoolname;
	this.fathername= fathername;
	
}
public void getInfo()
{
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
		Student s1=new Student(2,"ajay","SKC","jana");
		s1.getInfo();
		

	}

}
