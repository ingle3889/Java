package StringOps;
import java.io.*; // Import all packages form io library

public class Display_Fullname {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Firstname");
		String s = br.readLine();
		
		
		System.out.println("Enter the Lastname");
		String s1 = br.readLine();
		
		System.out.println("Enter the Middlename");
		String s2 = br.readLine();
		br.close();
		sb.append(s);
		sb.append(s1);
		int n = sb.length();
		sb.insert(n, s2);
		
		System.out.println(sb);
		
		

	}

}
