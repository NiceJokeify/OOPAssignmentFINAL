package ie.gmit.sw;

import java.io.*;
import java.util.*;

public class QuadGramMap {
	
	public static int GRAM_SIZE = 4;
	private Map<String, Integer> map = new HashMap<String, Integer>();
	
	//................

	private static QuadGramMap instance;
	
	private QuadGramMap(){}
	
	public static QuadGramMap getInstance(){
		
		if (instance == null){
			instance = new QuadGramMap();
		}
		
		return instance;
	}
	
	/*
	 * In here in the constructor you are building quadgram library
	 */
	
	public void readQuadgrams(String filename) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
		String line;
		
		while ((line = br.readLine()) != null) {
	    	
	    	String key = line.substring(0, QuadGramMap.GRAM_SIZE);
	    	int value = Integer.parseInt(line.substring(QuadGramMap.GRAM_SIZE+1,line.length()));
	    	
	    	map.put(key,value);
	    }
	    br.close();
		
	}
	
	
	
	public boolean containsKey(Object key) {
		return map.containsKey(key);
	}



	public Integer get(Object key) {
		return map.get(key);
	}



	public int size() {
		return map.size();
	}



	private Map<String, Integer> getMap(){
		return map;
	}
	
	public static void main(String[] args) throws IOException {
		// testing the reader
		QuadGramMap qgm = new QuadGramMap();
		qgm.readQuadgrams("./4grams.txt");
		
		System.out.println(qgm.getMap());
	}
	
}
