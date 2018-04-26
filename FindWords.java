public class FindWords {
	
    public String[] findWords(String[] words) {
    	
    	String ans[] = new String[words.length];
        
        char row1 [] = {'q','w','e','r','t','y','u','i','o','p'};
        char row2 [] = {'a','s','d','f','g','h','j','k','l'};
        char row3 [] = {'z','x','c','v','b','n','m'};
        
        int n = 0;
        
        for (int i = 0; i < words.length; i++){
            char letters [] = words[i].toCharArray();
            	for(int k = 0; k < letters.length; k++){
            		int r1 = 0, r2 = 0, r3 = 0;
            		for (int j = 0; j < row1.length; j++){
            			if (letters[k] == row1[j])
            				r1++;}
            		for (int j = 0; j < row2.length; j++){
            			if (letters[k] == row1[j])
            				r2++;}
            		for (int j = 0; j < row3.length; j++){
            			if (letters[k] == row1[j])
            				r3++;}
            		
            		if (r1 == words[i].length()){
            			ans[n] = words[i];
            			n++;
            		}
            		if (r2 == words[i].length()){
            			ans[n] = words[i];
            			n++;
            		}
            		if (r3 == words[i].length()){
            			ans[n] = words[i];
            			n++;
            		}
            			
            		
            	}
            		
            	
        }
        
        return ans;
        
    }
}