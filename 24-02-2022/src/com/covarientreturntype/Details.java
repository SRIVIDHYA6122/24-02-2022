package com.covarientreturntype;

public class Details {
	int id;
	String name;

	
	public  Details()
	{
		id=3;
		name="madhan";
	}

public Details getInfo()
{
	System.out.println(id);
	System.out.println(name);
	
	return null;
	
}
}
