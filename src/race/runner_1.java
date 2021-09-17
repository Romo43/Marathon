package race;

public class runner_1 extends Thread {

	public void run() {
		
		int i = 0;
		long ms = 0;
		String name = "Usain Bolt";
		
		System.out.println( "Runner " + name + " starts" );
		
		while( i < 5 ) {
			
			try {
				
				ms = ( long )( Math.random()*5 + 1 )*1000;
				Thread.sleep( ms );
				System.out.println( name + " is running  at " + ms + " m/s" );
				
			} catch( InterruptedException e ) {
				
				e.printStackTrace();
				
			}
			
			i++;
		}
		
		System.out.println( name + " finishes the race" );
		
	}
	
}