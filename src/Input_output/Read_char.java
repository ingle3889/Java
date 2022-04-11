package Input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read_char {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("Entered number is :"+ a);
		

	}

}
