package race;

public class runners implements Runnable {

	String name;
	String lvl;
	String nbr;
	int vel;

	public static int randomNum(int minimo,int maximo){

		int num=(int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
		return num;
	}
	
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

			this.vel = randomNum(1,18);

		}else if ( this.lvl == "Avanzado" ) {

			this.vel = randomNum(15,25);

		} else {

			this.vel = randomNum(30,40);
		}

		return this.lvl;

	}

	public void event(int km)  {

		if(randomNum(1,100)<=20){
			try {
					System.out.println( getName() + " " + getNumber() + " Ha decidido tomar agua en el:  " + km + " km" );
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};

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

					Thread.sleep( vel * 400 );

				} catch (InterruptedException e) {

					e.printStackTrace();

				}

				System.out.println( getName() + " " + getNumber() + ":  " + i + " km" );

				switch (i){
					case 3:
						event(i);
						break;
					case 6:
						event(i);
						break;
					case 9:
						event(i);
						break;
				}

				
			} else {
				
				System.out.println( getName() + " " + getNumber() + ":" + " finishes the race" );
				
			}
			
			i++;
			
		}
		
	}
	
}
