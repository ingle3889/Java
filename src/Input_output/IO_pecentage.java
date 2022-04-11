package Input_output;

import java.io.*;

public class IO_pecentage {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of subject :");
		int n = Integer.parseInt(br.readLine());
		
		int[] marks = new int[n]; 

		for(int i=0;i<n; i++) 
		{
			System.out.print("Enter  the marks :");
			marks[i]=Integer.parseInt(br.readLine());
		}
		
		int tot = 0;
		
		for(int i=0; i<n; i++) 
		{
			tot += marks[i];
		}
		// display total marks
		System.out.println("Total marks is :"+ tot);
		
		float per =  Percentage(tot, n);
		
		System.out.println("Total percentage is "+per+"%");
		
	}

	private static float Percentage(int tot, int n) {
		// TODO Auto-generated method stub
		return (tot/n);
	}

}
