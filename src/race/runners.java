package race;

public class runners implements Runnable {

	String name;
	
	public runners( String n ) {
		
		this.name = n;
		
	}
	
	public String getName() {
		
		return this.name;
		
	}
	
	public void run() {
		
		int i = 0;
		long ms = 0;
		
		System.out.println( "Runner " + getName() + " starts" );
		
		while( i < 5 ) {
			
			try {
				
				ms = ( long )( Math.random() * 5 + 1 ) * 1000;
				Thread.sleep( ms );
				
				System.out.println( getName() + " is running at " + ms + " k/h" );
				
			} catch( InterruptedException e ) {
				
				e.printStackTrace();
				
			}
			
			i++;
			
		}
		
		System.out.println( getName() + " finishes the race" );
		
	}
	
}