
public class Consonants {
	public String sentence = "";

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	
	public Consonants(String sentence) {
		this.sentence = sentence;
	}
	
	public int getConsonantCount() {
		int count = 0;
		String lowerCase = sentence.toLowerCase();
		for (int j = 0;j < lowerCase.length();j++)
		{
			char i = lowerCase.charAt(j);
			if (i == 'b' || i == 'c' || i == 'd' || i == 'f' || i == 'g' || i == 'h' || i == 'j' || i == 'k' || i == 'l' || i == 'm' || i == 'n' || i == 'p' || i == 'q' || i == 'r' || i == 's' || i == 't' || i == 'v' || i == 'w' || i == 'x' || i == 'y' || i == 'z') {
				count++;
			}
		}
		return count;
	}
	
	public void replaceConWithStar() {
		String lowerCase = sentence.toLowerCase();
		StringBuilder s = new StringBuilder(sentence);
		for (int j = 0;j < lowerCase.length();j++)
		{
			char i = lowerCase.charAt(j);
			if (i == 'b' || i == 'c' || i == 'd' || i == 'f' || i == 'g' || i == 'h' || i == 'j' || i == 'k' || i == 'l' || i == 'm' || i == 'n' || i == 'p' || i == 'q' || i == 'r' || i == 's' || i == 't' || i == 'v' || i == 'w' || i == 'x' || i == 'y' || i == 'z') {
				s.setCharAt(j, '*');
			}
		}
		sentence = s.toString();
	}
}
