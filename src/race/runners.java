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
		
		int i = 1;
		
		System.out.println( "Runner " + getName() + " starts" );
		
		try {
			
			Thread.sleep(1000);
			
		} catch( InterruptedException e ) {
			
			e.printStackTrace();
			
		}
		
		while( i < 11 ) {
			
			if(i < 10){
				
				System.out.println( getName() + ":  " + i + " km" );
				
			}else {
				
				System.out.println( getName() + " finishes the race" );
				
			}
			
			i++;
			
		}
		
	}
	
}