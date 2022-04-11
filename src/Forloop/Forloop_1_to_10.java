package Forloop;

//Program display number form 1 to 10. 
public class Forloop_1_to_10 {

	public static void main(String[] args) {
		// loop with 3 expressions
		for (int i = 0; i<=10; i++) 
		{
			System.out.println(i);
		}
		System.out.println();
		// loop with 2 expressions eliminating 1st expression
		int z = 0;
		for ( ; z<=10; z++) 
		{
			System.out.println(z);
		}
		System.out.println();
		// loop with 1 expressions eliminating 1st expression
		int j = 0;
		for ( ;j<=10;) 
		{
			System.out.println(j);
			j++;
		}
	}

}


/*
Output as follows:-
0
1
2
3
4
5
6
7
8
9
10

0
1
2
3
4
5
6
7
8
9
10

0
1
2
3
4
5
6
7
8
9
10
*/