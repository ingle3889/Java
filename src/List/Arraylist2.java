package List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> l = new ArrayList<>();
		System.out.println("Please enter the number element you would like to add: ");
		int a = Integer.parseInt(br.readLine());
		for(int i=0; i<a; i++) 
		{
			System.out.println("Please enter the number : ");
			int y = Integer.parseInt(br.readLine());
			l.add(y);
		}
		// Sorting list using collection
		
		System.out.println("before sorting the list");
		System.out.println(l);
		
		List<?> a1 = sorting(l);
		List<?> a2 = Reversedsorting(l);
		System.out.println("After sorting in asceding order");
		System.out.println(a1);
		System.out.println("After sorting in Descending order");
		
		System.out.println(a2);
	}

	private static List<?> Reversedsorting(List<Integer> l) {
		// TODO Auto-generated method stub
		Collections.sort(l,Collections.reverseOrder());
		return l;
	}

	private static List<Integer> sorting(List<Integer> l) {
		Collections.sort(l);
		return l ;
		// TODO Auto-generated method stub
		
	}

}
