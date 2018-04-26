
public class NumberOfLinesToWriteString {

	public static void main(String[] args) {
		
		int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		String S = "bbajslkfexsrdcftvgybbcccdddaaa";
		
		numberOfLines(widths, S);

	}
	
    public static int[] numberOfLines(int[] widths, String S) {
    	
    	int lines, remainer, totalLength;
    	lines = 0;
    	remainer = 0;
    	totalLength = 0;
    	
    	char [] string = S.toCharArray();
    	
    	for (int k = 0; k < string.length; k++){

    		totalLength += (widths[(int)string[k] - 97]);
    		
    		lines = totalLength / 100 + 1;
    		
    		if (k == string.length - 1 && totalLength > 100/lines){
    			remainer = (widths[(int)string[k] - 97]);
    		}
    		else{
    			remainer = totalLength % 100;
    		}
    		
    	}
    	
    	System.out.println(totalLength);
    	
    	lines = totalLength / 100 + 1;
    	
    	int ans [] = {lines, remainer};
    	
    	System.out.println("Lines: " + lines + " Remainer: " + remainer);
    	
    	return ans;
    	
        
    }

}
