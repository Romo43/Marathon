package race;

import java.lang.Thread;

public class Main {
	
	public static void main( String[] args ) {
		
		System.out.println( "The race starts" );
		
		runners arrayObjetos[] = new runners[ 5 ];
		
		arrayObjetos[ 0 ] = new runners( "Usain Bolt" );
		arrayObjetos[ 1 ] = new runners( "Flash" );
		arrayObjetos[ 2 ] = new runners( "Speedy Gonzales" );
		arrayObjetos[ 3 ] = new runners( "Shazam" );
		arrayObjetos[ 4 ] = new runners( "Sonic" );
		
		for ( int i = 0; i < arrayObjetos.length; i++ ){
			
            Thread h1 = new Thread( arrayObjetos[ i ] );
            h1.start();
            
        }
		
	}
	
}