package race;

public class runners implements Runnable {

	String name;
	String lvl;
	int vel;
	
	public runners( String n, String h) {
		
		this.name = n;
		this.lvl = h;
	}
	
	public String getName() {
		
		return this.name;
		
	}

	public String getLevel(){

		if(this.lvl=="Experto")
		{
			vel = (int) Math.floor(Math.random()*(1-18)+18);
		}else if(this.lvl=="Avanzado"){
			vel = (int) Math.floor(Math.random()*(25-15)+25);
		}else{
			vel = (int) Math.floor(Math.random()*(30-40)+40);
		}

		return this.lvl;
	}

	public void run() {
		
		int i = 1;


		System.out.println( "Runner " + getName() + " starts" );

		try {
			
			Thread.sleep(2000);
			
		} catch( InterruptedException e ) {
			
			e.printStackTrace();
			
		}

		while( i < 11 ) {
			
			if(i < 10){

				try {
					Thread.sleep(vel);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println( getName() + ":  " + i + " km" );
				
			}else {
				
				System.out.println( getName() + " finishes the race" );
				
			}
			
			i++;
			
		}
		
	}
	
}
