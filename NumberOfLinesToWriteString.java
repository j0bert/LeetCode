/*We are to write the letters of a given string S, from left to right into lines. Each line has maximum width 100 units,
and if writing a letter would cause the width of the line to exceed 100 units, it is written on the next line.
We are given an array widths, an array where widths[0] is the width of 'a', widths[1] is the width of 'b', ..., and widths[25]
is the width of 'z'.

Now answer two questions: how many lines have at least one character from S, and what is the width used by the last such line?
Return your answer as an integer list of length 2.*/

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
