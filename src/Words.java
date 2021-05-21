public class Words {
	public String words = "";
	
	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}

	public Words(String words) {
		this.words = words;
	}
	
	public int getWordCount() {
		String[] split = words.trim().split(" +");
		
		return split.length;
	}
}
