package race;

import java.lang.Thread;

public class Main {
	
	public static void main( String[] args ) {
		
		System.out.println( "The race starts" );
		
		runner_1 h_1 = new runner_1();
		runner_2 h_2 = new runner_2();
		
		Thread HT = new Thread(h_2);
		runner_3 h_3 = new runner_3();
		runner_4 h_4 = new runner_4();
		runner_5 h_5 = new runner_5();
		
		h_1.start();
		HT.start();
		h_3.start();
		h_4.start();
		h_5.start();
		
	}
}
