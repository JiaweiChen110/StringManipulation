import java.util.*;

class main{
	public static void main(String[] args) {
		//Question 1
		System.out.println("Question number 1");
		System.out.println("Enter a sentence to get vowel count");
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		Vowels vowel = new Vowels(input);
		System.out.println("There are " + vowel.getVowelCount() + " in " + input);
		
		//Question 2
		System.out.println("Question number 2");
		System.out.println("Enter a word to determine if it is a palidrome");
		
		input = scan.nextLine();
		Palindrome palindrome = new Palindrome(input);
		
		if (palindrome.isPalindrome()) {
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
		
		//Question 3
		System.out.println("Enter a sentence to get the word count");
		
		input = scan.nextLine();
		Words word = new Words(input);
		
		System.out.println("There are " + word.getWordCount() + " words in " + input);
		
		//Question 4
		System.out.println("Enter a sentence to get the consonant counts and replacing all consonant with *");
		
		input = scan.nextLine();
		Consonants consonant = new Consonants(input);
		
		System.out.println("There are" + consonant.getConsonantCount() + " consonants");
		
		consonant.replaceConWithStar();
		System.out.println("Here is the replace * version " + consonant.getSentence());
		
		//Question 5
		System.out.println("Please Enter a sentence to find the number of words end with S and Y");
		
		input = scan.nextLine();
		LastLetterCount lastLetterCount = new LastLetterCount(input);
		
		System.out.println("There are " + lastLetterCount.getSAndYCount() + " words end with s and y");
		lastLetterCount.switchFirstOccurSAndY();
		System.out.println("After switching first occurence word end with s and y is " + lastLetterCount.getSentence());
	}
}
