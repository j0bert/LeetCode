
public class NumberComplement {

	public static void main(String[] args) {
		int ans = findComplement(7);
		//System.out.println(ans);
	}
	
	public static int findComplement(int num) {
		String bin = Integer.toBinaryString(num);
		
		//System.out.println(bin);
		
		char [] chars = bin.toCharArray();
		
		//for (int k = 0; k < chars.length; k++)
			//System.out.print(chars[k]);
		
		
		
		for (int i = 0; i < chars.length; i++){
			
			if (chars[i] == 0)
				chars[i] = 1;
			else
				chars[i] = 0;

		}
		
		for (int j = 0; j < chars.length; j++)
			System.out.print(chars[j]);
		
		String s = String.valueOf(chars);
		System.out.println(s);
		
		int ans = Integer.parseInt(s,2);
		//int ans = 8;
		
		return ans;
	}
	

}
