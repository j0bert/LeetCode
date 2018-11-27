/*Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.*/

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
