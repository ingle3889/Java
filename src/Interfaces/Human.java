package Interfaces;

public class Human implements MyInter, Attributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human hm = new Human();
		hm.talk();
		hm.walk();
		hm.tall(6);
		hm.fat();

	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Can walk");
		
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("Can talk a better");
		
	}

	@Override
	public void tall(int a) {
		// TODO Auto-generated method stub
		System.out.println("Is tall as " +a+ "FT");
		
	}

	@Override
	public void fat() {
		// TODO Auto-generated method stub
		System.out.println("Is fat but thin as well");
		
	}

}
