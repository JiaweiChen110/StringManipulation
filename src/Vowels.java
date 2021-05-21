
public class Vowels {
	public String sentence = "";
	
	public Vowels(String input) {
		this.sentence = input;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence.toLowerCase();
	}
	
	String getSentence() {
		return sentence;
	}
	
	int getVowelCount() {
		int count = 0;
		for (int i = 0;i < sentence.length(); i++) {
			char w = sentence.charAt(i);
			if (w == 'a' || w == 'e' || w == 'i' || w == 'o' || w == 'u') {
				count++;
			}
		}
		return count;
	}
}
