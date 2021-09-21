package race;

public class runners implements Runnable {

	String name;
	String lvl;
	String nbr;
	int vel;
	
	public runners( String n, String h, String u ) {
		
		this.name = n;
		this.lvl = h;
		this.nbr = u;

	}
	
	public String getName() {
		
		return this.name;
		
	}

	public String getNumber() {

		return this.nbr;

	}

	public String getLevel(){

		if( this.lvl == "Experto" ) {

			this.vel = ( int ) Math.floor( Math.random() * ( 1 - 18 ) + 18 );

		}else if ( this.lvl == "Avanzado" ) {

			this.vel = ( int ) Math.floor( Math.random() * ( 25 - 15 ) + 25 );

		} else {

			this.vel = ( int ) Math.floor( Math.random() * ( 30 - 40 ) + 40 );
		}

		return this.lvl;

	}

	public void run() {
		
		int i = 1;

		System.out.println( "Runner " + getName() + " " + getNumber() + ":" + " starts" );

		try {
			
			Thread.sleep(2000 );
			
		} catch( InterruptedException e ) {
			
			e.printStackTrace();
			
		}

		getLevel();

		while( i < 11 ) {

			if(i < 10){

				try {

					Thread.sleep( vel );

				} catch (InterruptedException e) {

					e.printStackTrace();

				}

				System.out.println( getName() + " " + getNumber() + ":  " + i + " km" );
				
			} else {
				
				System.out.println( getName() + " " + getNumber() + ":" + " finishes the race" );
				
			}
			
			i++;
			
		}
		
	}
	
}
