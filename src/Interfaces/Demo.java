package Interfaces;

import java.lang.reflect.InvocationTargetException;

public class Demo implements MyInter {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		
		Class<?> c = Class.forName(args[0]);
		
		MyInter i =(MyInter) c.getDeclaredConstructor().newInstance();
		
		i.talk();
		i.walk();
		

	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Walking");
		
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("talking");
		
	}

}
