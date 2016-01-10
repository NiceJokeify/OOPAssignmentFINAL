package ie.gmit.sw;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Map;

public class TextScorer {
	
	QuadGramMap map;
	
	public TextScorer() throws IOException{
		map = QuadGramMap.getInstance();  //map = new QuadGramMap();
		map.readQuadgrams("./4grams.txt");
	}
	
	public double getScore(String text){
		double score = 0f;
		

		for (int i = 0; i < text.length(); i++){
			if (i + QuadGramMap.GRAM_SIZE < text.length()){
				score += computeLogScore(text.substring(i, i + QuadGramMap.GRAM_SIZE));
			}
		}
		return score;
	}
	
	private double computeLogScore(String quadgram){
		if (map.containsKey(quadgram)){
			double frequency = map.get(quadgram);
			double total = (double) map.size();
			double probability = (double) (frequency/total);
			
			return Math.log10(probability);
		}else{
			return 0f;
		}
	}
	
	public static void main(String[] args) throws IOException {
		TextScorer tx = new TextScorer();
		System.out.println(tx.getScore("SATTMTSLSOETAEEPHHCGTTEA"));;
	}
}
