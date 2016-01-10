package ie.gmit.sw;

public class Result {

	private String cypherText;
	private String plainText;
	private int key;
	private double score;
	
	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public Result(String cypherText){
		this.cypherText = cypherText;
	}
	
	public String getPlainText() {
		return plainText;
	}
	public void setPlainText(String plainText) {
		this.plainText = plainText;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getCypherText() {
		return cypherText;
	}
}
