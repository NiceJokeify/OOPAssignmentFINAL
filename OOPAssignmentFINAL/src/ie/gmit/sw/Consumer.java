package ie.gmit.sw;

import javax.swing.JOptionPane;

public class Consumer implements Runnable {

	public static int SLEEP_TIME = 200; //1000
	public static int POLLING_FROM_QUEUE_DELAY = 100;
	
	private boolean active = true;
	
	
	@Override
	public void run() {
		
		while (active){
			try {
				
				
				
				
				Worker worker = Worker.getInstance();
				Result result;
				
				
				
				while ((result = worker.poll()) != null) {					
					
					System.out.println("Score: " + result.getScore() +" key: " + result.getKey() + " Decrypted text " + result.getPlainText() );
					
					JOptionPane.showMessageDialog(null,"Score: "+ result.getScore() + "\n" + "key: "+ result.getKey() + "\n" + "Decrypted text: "+ result.getPlainText(), "SCORE", JOptionPane.INFORMATION_MESSAGE );

					
					//Thread.sleep(POLLING_FROM_QUEUE_DELAY);
					//System.out.println("score" + result.getScore());
				}
				
				
				Thread.sleep(SLEEP_TIME);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
