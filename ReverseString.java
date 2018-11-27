
public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println(reverseString("sup"));
		
	}
	
    public static String reverseString(String s) {
    	
    	char [] chars = s.toCharArray();
    	char [] flipped = new char[s.length()];
    	
    	for (int i = 0; i < s.length(); i++){
    		
    		flipped[i] = chars[s.length() - i - 1];
    		
    	}
    	
    	String ans = String.valueOf(flipped);
    	
    	return ans;
        
    }

}
