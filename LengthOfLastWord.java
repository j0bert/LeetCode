
public class LengthOfLastWord {

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("a"));
	}

	public static int lengthOfLastWord(String s){
		int ans;
		char k = ' ';
		
		if (s.length() > 0){
		
		String lastWord = s.substring(s.lastIndexOf(k), (s.length()-1));
		
		ans = lastWord.length();
		}
		else
			ans = 0;
			
		return ans;
	}
	
}
