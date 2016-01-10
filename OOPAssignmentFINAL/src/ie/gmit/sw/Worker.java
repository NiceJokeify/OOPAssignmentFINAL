package ie.gmit.sw;

import java.util.concurrent.*;

public class Worker {

	private BlockingQueue<Result> outQueue = new LinkedBlockingQueue<Result>(); //static final

	private static Worker instance;
	
	private Worker(){}
	
	public static Worker getInstance(){
		
		if (instance == null){
			instance = new Worker();
		}
		
		return instance;
	}
	
	public boolean add(Result e) {
		return outQueue.add(e);
	}

	public Result poll() {
		return outQueue.poll();
	}
	
	public void addJob(String cypherText){
		/*
		 * specify min key somewhere
		 */
		
		int min_key = 2;
		
		for (int i = min_key; i < cypherText.length(); i++){
			Result result = new Result(cypherText);
			result.setKey(i);
			new Thread(new Job(result)).start();
			
		}
		
	}
}
