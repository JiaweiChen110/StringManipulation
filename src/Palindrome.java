
public class Palindrome {
	public String word = "";
	
	public Palindrome(String word) {
		this.word = word;
	}
	
	public String getWord() {
		return word;
	}
	
	public void setWord(String word) {
		this.word = word;
	}
	
	public boolean isPalindrome() {
		if (word.length() == 0) {
			return false;
		}
		int last = word.length()-1;
		
		for (int i = 0; i < word.length()/2; i++) {
			if (word.charAt(i) != word.charAt(last)) {
				return false;
			}
			last--;
		}
		
		return true;
	}
}
