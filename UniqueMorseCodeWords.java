import java.util.ArrayList;

public class UniqueMorseCodeWords {

	public static void main(String[] args) {
		
		String [] words = {"gin", "zen", "gig", "msg"};
		
		System.out.println(uniqueMorseRepresentations(words));
		
	}
	
	static public int uniqueMorseRepresentations(String[] words) {
		
		String [] codes = new String [words.length];
		
		String [] Morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",
				".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		
		for (int i = 0; i < words.length; i++){
			char [] letters = words[i].toCharArray();
			String word = "";
			for (int k = 0; k < letters.length; k++){
				String morse = Morse[(int)letters[k] - 97];
				//System.out.print(morse);
				word = word + morse;
				//System.out.println(word);
			}
			codes[i] = word;	
		}
		
			ArrayList<String> diffMorse = new ArrayList<>();
			
			for (int m = 0; m < words.length; m++){
				if (!diffMorse.contains(codes[m])){
					diffMorse.add(codes[m]);
				}
			}
			
			int ans = diffMorse.size();
			
			return ans;
			
	}

		
        
}