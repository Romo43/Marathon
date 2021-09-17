package race;

import java.lang.Thread;

public class Main {
	
	public static void main( String[] args ) {
		
		System.out.println( "The race starts" );
		
		
		runners h_1 = new runners( "Usain Bolt" );
		Thread h1 = new Thread( h_1 );
		
		runners h_2 = new runners( "Flash" );
		Thread h2 = new Thread( h_2 );
		
		runners h_3 = new runners( "Speed" );
		Thread h3 = new Thread( h_3 );
		
		runners h_4 = new runners( "Sumperman" );
		Thread h4 = new Thread( h_4 );
		
		runners h_5 = new runners( "Shazam" );
		Thread h5 = new Thread( h_5 );
		
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h5.start();
		
	}
	
}
