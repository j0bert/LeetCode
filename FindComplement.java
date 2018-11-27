/* Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.*/

public class FindComplement {

	public static void main(String[] args) {
		System.out.print(findComplement(999));
	}
	
    public static int findComplement(int num) {
    	
    	double ans = 0;
    	
    	String binary = Integer.toBinaryString(num);
    	char [] chars = binary.toCharArray();
    	
    	for (int i = 0; i < chars.length; i++){
    		if (chars[i] == '0'){
    			chars[i] = '1';
    		}
    		else{
    			chars[i] = '0';
    		}
    	}
    	
    	for (int k = 0; k < chars.length; k++){
    		if (chars[k] == '0'){
    			continue;
    		}
    		else{
    			ans = ans + Math.pow(2,chars.length - 1 - k);
    		}
    	}
    	
    	return (int)ans;
        
    }

}
