package race;

public class runners implements Runnable {

	String name;
	String lvl;
	String nbr;
	int vel;

	// Random number
	public static int randomNum( int minimo, int maximo ){

		int num = ( int ) Math.floor( Math.random() * ( maximo - minimo + 1 ) + ( minimo ));
		return num;

	}

	// Call runner
	public runners( String n, String h, String u ) {
		
		this.name = n;
		this.lvl = h;
		this.nbr = u;

	}

	// Get name of runner
	public String getName() {
		
		return this.name;
		
	}

	// Get number of runner
	public String getNumber() {

		return this.nbr;

	}

	// Get level of runner
	public String getLevel() {

		if( this.lvl == "Experto" ) {

			this.vel = randomNum( 1, 18 );

		} else if ( this.lvl == "Avanzado" ) {

			this.vel = randomNum( 15, 25 );

		} else {

			this.vel = randomNum( 30, 40 );
		}

		return this.lvl;

	}

	// Water event
	public void event( int km )  {

		if( km % 3 == 0 ){
			if ( randomNum( 1, 100 ) <= 20 ) {

				try {

					System.out.println( "Runner " + getName() + " #" + getNumber() + " has decided to drink water in the :  " + km + " km" );
					Thread.sleep(2000 );

				} catch (InterruptedException e) {

					e.printStackTrace();

				}
			}else{
				System.out.println( getName() + " #" + getNumber() + ":  " + km + " km" );
			}
		}else{
			System.out.println( getName() + " #" + getNumber() + ":  " + km + " km" );
		}
	};

	// Run
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

			if( i < 10){

				try {

					Thread.sleep( vel * 200 );

				} catch ( InterruptedException e ) {

					e.printStackTrace();

				}

				event( i );

				
			} else {
				
				System.out.println( getName() + " " + getNumber() + ":" + " finishes the race" );

				
			}
			
			i++;
			
		}
		
	}
	
}
