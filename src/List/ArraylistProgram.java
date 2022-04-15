package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArraylistProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>ls = new ArrayList<>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		System.out.println(ls);
		
		Iterator<Integer> itr = ls.iterator();
		// read element using iterator 
		while(itr.hasNext()) 
		{
			int a = (int) itr.next();
			System.out.println(a);
		}
		// read element using listiterator 
		ListIterator<Integer> l = ls.listIterator();
		
		while(l.hasNext()) 
		{
			int b = l.next();
			System.out.println(b);
		}
		
	}

}
