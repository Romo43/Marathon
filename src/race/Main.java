package race;

import java.lang.Thread;


public class Main {
	
	public static void main( String[] args ) {
		
		System.out.println( "The race starts" );
		
		
		runners h_1 = new runners( "Usain Bolt", "Experto", "1");
		Thread h1 = new Thread( h_1 );
		
		runners h_2 = new runners( "Flash" ,"Novato", "2");
		Thread h2 = new Thread( h_2 );
		
		runners h_3 = new runners( "Speed" , "Avanzado", "3");
		Thread h3 = new Thread( h_3 );

		runners h_4 = new runners( "Sumperman" , "Experto", "4");
		Thread h4 = new Thread( h_4 );

		runners h_5 = new runners( "Shazam" , "Avanzado", "5");
		Thread h5 = new Thread( h_5 );

		runners h_6 = new runners( "Elon", "Novato", "6");
		Thread h6 = new Thread( h_6 );

		runners h_7 = new runners( "Spiderman" ,"Avanzado", "7");
		Thread h7 = new Thread( h_7 );

		runners h_8 = new runners( "Ironman" , "Avanzado", "8");
		Thread h8 = new Thread( h_8 );

		runners h_9 = new runners( "Duende Verde" , "Experto", "9");
		Thread h9 = new Thread( h_9 );

		runners h_10 = new runners( "Don Julio" , "Novato", "10");
		Thread h10 = new Thread( h_10 );


		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h5.start();
		h6.start();
		h7.start();
		h8.start();
		h9.start();
		h10.start();



	}

}
