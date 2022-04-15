package Arrays;

public class Employee {
	
	protected int id ;
	protected String name ;
	
	public Employee(String i, int n) 
	{
		id = n;
		name = i;
		
	}
	
	public void display() 
	{
		System.out.println("Hi "+name+" and youe employee id is "+id);
	}

}
