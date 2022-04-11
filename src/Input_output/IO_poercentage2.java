package Input_output;
import java.io.*;

public class IO_poercentage2 {

	public static void main(String[] args) throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number");
		int n = Integer.parseInt(br.readLine());
		
		int[] items = new int[n];
		
		for(int i=0; i <n; i++) 
		{
			System.out.println("Enter the price");
			items[i] = Integer.parseInt(br.readLine());
		}
		
		int total = 0;
		
		for(int i=0; i<n;i++) 
		{
			total+= items[i];
		}
		System.out.println("Total of items price is:"+total);
		
		float percentage = (float) total/n;
		System.out.println("Percentage of items is:"+percentage);
	}

}
