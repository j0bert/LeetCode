
public class UniqueMorseCodeWords {

	public static void main(String[] args) {
		
		String [] words = {"gag", "ton", "lit"};
		
		uniqueMorseRepresentations(words);
		

	}
	
	static public int uniqueMorseRepresentations(String[] words) {
		
		String [] ans = new String [words.length];
		
		String [] Morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		
		for (int i = 0; i < words.length; i++){
			char [] letters = words[i].toCharArray();
			String [] code = new String [3];
			for (int k = 0; k < letters.length; k++){
				String morse = Morse[(int)letters[k] - 97];
				System.out.println(morse);
				//code.
				//System.out.println(code);
			}
		}
		
		return ans.length;
        
    }

}
