/*The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.*/

public class HammingDistance {

	public static void main(String[] args) {
		
		System.out.println(hammingDistance(2,4));
		
	}
	
	static int hammingDistance(int x, int y){
		
		int ans = 0;
		
		String xBinStr = Integer.toBinaryString(x);
		System.out.println("xBinStr: " + xBinStr);
		
		String yBinStr = Integer.toBinaryString(y);
		System.out.println("yBinStr: " + yBinStr);
		
		System.out.println();
		
		System.out.println("xArray:");
		
		char [] xArray = new char [32];
		for (int j = 0; j < 32; j++){
			xArray[j] = '0';
			System.out.print(xArray[j]);
		}
		
		System.out.println();
		
		System.out.println("yArray:");
		
		char [] yArray = new char [32];
		for (int j = 0; j < 32; j++){
			yArray[j] = '0';
			System.out.print(yArray[j]);
		}
		
		System.out.println();
		char [] xBinArray = xBinStr.toCharArray();
		System.out.println();
		System.out.println("xBinArray:");
		for (int z = 0; z < xBinArray.length; z++){
			System.out.print(xBinArray[z]);
		}
		
		char [] yBinArray = yBinStr.toCharArray();
		System.out.println();
		System.out.println("yBinArray:");
		
		for (int z = 0; z < yBinArray.length; z++){
			System.out.print(yBinArray[z]);
		}
		
		System.out.println();
		
	
		for (int k = 0; k < xBinArray.length; k ++){
			
			xArray[32 - xBinArray.length + k] = xBinArray[k];
			
		}
		
		System.out.println();
		
		System.out.println("New xArray: ");
		for (int j = 0; j < 32; j++){
			System.out.print(xArray[j]);
		}
		
		System.out.println();
	
		
		for (int k = 0; k < yBinArray.length; k ++){
			
			yArray[32 - yBinArray.length + k] = yBinArray[k];
			
		}
		
		System.out.println("New yArray: ");
		for (int j = 0; j < 32; j++){
			System.out.print(yArray[j]);
		}

		
		for (int i = 0; i < 32; i++){
			if (xArray[i] == yArray[i])
				continue;
			else
				ans++;
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Ans: ");
		return ans;
		
	}

}
