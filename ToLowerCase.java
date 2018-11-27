
public class ToLowerCase {

	public static void main(String[] args) {
		
		System.out.println(toLowerCase("Hello"));
		
	}
	
	public static String toLowerCase(String str){
		
		char [] chars = str.toCharArray();
		
		for (int i = 0; i < chars.length; i++){
			
			chars[i] = Character.toLowerCase(chars[i]);
			
		}
		
		String ans = new String(chars);
		
		return ans;
		
	}

}
