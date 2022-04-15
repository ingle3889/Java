package Collectionss;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Arr {

	public static void main(String[] args) throws IOException, NumberFormatException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of elements to add in array :");
		int n = Integer.parseInt(br.readLine());
		Integer[] a  = new Integer[n];
		
	for(int i=0;i<n; i++) 
	{
		System.out.print("Enter the element :");
		a[i]=Integer.parseInt(br.readLine());
	}
	Arrays.sort(a, new Descend());
	System.out.println("Sorting in ascend way");
	display(a);
	System.out.println(" ");
	Arrays.sort(a, new Ascend());
	System.out.println("Sorting in Descend way");
	display(a);
	
	
	
	}
	
	
	static void display(Integer arr[]) 
	{
   // TODO document why this method is empty
	for(int i: arr) 
	{
		System.out.print(i+"\t");
	}	
	}

}
