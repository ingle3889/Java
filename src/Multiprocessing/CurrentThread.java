package Multiprocessing;

//this finds currently running thread in this program. 
public class CurrentThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Let us find current running thread");
		Thread t = Thread.currentThread();
		System.out.println("current thread "+ t);
		System.out.println("it's name is :-"+ t.getName());
	}

}


/*
Output as follows:-
Let us find current running thread

# main in below indicates the name of the thread running the current code.
#5 is representing the priority of the thread. priority range form 1 to 10 as 1 is min and 10 is mx priority
# max the priority jvm prefer to execute first. default priority is 5. 
 
current thread Thread[main,5,main]
it's name is :-main

*/