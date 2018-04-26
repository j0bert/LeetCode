
public class JewelsAndStones {

	public static void main(String[] args) {
		
		String J = "AsDf";
		String S = "AaSsDdFf";
		System.out.println(numJewelsInStones(J,S));
		
	}
	
	public static int numJewelsInStones(String J, String S) {
		
		int ans = 0;
		
		char [] JArray = J.toCharArray();
		char [] SArray = S.toCharArray();
		
		for (int i = 0; i < JArray.length; i++){
			for (int k = 0; k < SArray.length; k++){
				if (JArray[i] == SArray[k])
					ans++;
			}
		}
		
		return ans;
	        
	}
	
}
