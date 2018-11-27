/*You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive,
so "a" is considered a different type of stone from "A".*/

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
