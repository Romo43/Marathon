package race;

public class runner_1 extends Thread {

	public void run() {
		int i=0;
		long ms=0;
		String name="Usain Bolt";
		
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