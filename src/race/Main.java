package race;

import java.lang.Thread;

public class Main {
	
	public static void main(String[] args) {
		// Call threads
		runner_1 h_1 = new runner_1();
		runner_2 h_2 = new runner_2();
		
		Thread HT = new Thread(h_2);
		runner_3 h_3 = new runner_3();
		
		h_1.start();
		HT.start();
		h_3.start();
		
		System.out.println("Comienza la carrera");
		
	}
}
