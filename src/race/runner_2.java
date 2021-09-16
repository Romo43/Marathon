package race;

public class runner_2 implements Runnable {

	public void run() {
		int i=0;
		long ms=0;
		String name="Speedy Gonzales";
		
		System.out.println("Sale corriendo " + name);
		while(i<5) {
			try {
				ms = (long)(Math.random()*5+1)*1000;
				Thread.sleep(ms);
				System.out.println(name + " corriendo a " + ms + " Metros x segundo");
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
		System.out.println("Termina la carrera " + name);
	}
	
}
