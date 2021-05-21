public class LastLetterCount {
	public String sentence = "";

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	
	public LastLetterCount(String sentence) {
		this.sentence = sentence;
	}
	
	public int getSAndYCount() {
		String [] arr = sentence.toLowerCase().trim().split(" ");
		int count = 0;
		for (String i:arr) {
			char j = i.charAt(i.length()-1);
			if (j == 's' || j == 'y') {
				count++;
			}
		}
		return count;
	}
	
	public void switchFirstOccurSAndY() {
		String [] arr = sentence.toLowerCase().trim().split(" ");
		int sIndex = -1;
		int yIndex = -1;
		for (int i = 0; i < arr.length; i++) {
			char j = arr[i].charAt(arr[i].length()-1);
			if (j == 's' && sIndex == -1) {
				sIndex = i;
			}
			if (j == 'y' && yIndex == -1) {
				yIndex = i;
			}
			if (sIndex != -1 && yIndex != -1) {
				String t = arr[sIndex];
				arr[sIndex] = arr[yIndex];
				arr[yIndex] = t;
				StringBuilder s = new StringBuilder("");
				for(String m:arr) {
					s.append(m);
					s.append(" ");
				}
				sentence = s.toString();
				return;
			}
		}
	}
}
