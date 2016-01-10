package ie.gmit.sw;

import java.io.IOException;

public class Job implements Runnable{

	Result result;
	
	public Job(Result result) {
		this.result = result;
	}
	
	@Override
	public void run() {
		/*
		 * getting cypher text
		 * decoding, and passing to get englishy score and adding into blocking queue with results
		 */
		try {

			result.setPlainText(
						new RailFence().decrypt(result.getCypherText() , result.getKey())
					);
			
			TextScorer tx = new TextScorer();
			
			result.setScore(
					 new TextScorer().getScore(result.getPlainText())
					);
		
			Worker worker = Worker.getInstance();
			
			worker.add(result);			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
