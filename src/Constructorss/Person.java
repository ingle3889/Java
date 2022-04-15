package Constructorss;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {

	private String name;
	private int age;
	
	Person(String name, int age)
	{
		// Assign a values to the instance variable of a class
		this.name =name;
		this.age = age;
	}
	void agecalc()
	{
		System.out.println("HI "+name+" your age is "+age);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the name :");
		String s = br.readLine();
		System.out.println("Enter the Age :");
		int a = Integer.parseInt(br.readLine());
		
		Person p = new Person(s, a);
		p.agecalc();
		

	}

}
