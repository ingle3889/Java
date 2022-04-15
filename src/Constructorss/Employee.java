package Constructorss;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {
	private String name;
	private int age;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter your name :");
		String n = br.readLine(); 
		System.out.println("Please enter your Age :");

		int aa = Integer.parseInt(br.readLine());
		
		br.close();
		
		Employee e =new Employee();
		e.set_name(n);
		e.set_age(aa);
		
		System.out.println("Hi "+e.get_name()+" your age is :"+e.get_age());

	}

	private int get_age() {
		// TODO Auto-generated method stub
		return age;
	}

	private String get_name() {
		// TODO Auto-generated method stub
		return name;
	}

	private void set_name(String name) {
		// TODO Auto-generated method stub
		this.name = name;
		
	}

	private void set_age(int age) {
		// TODO Auto-generated method stub
		this.age =age;	
	}

}
