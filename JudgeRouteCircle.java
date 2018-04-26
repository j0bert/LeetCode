
public class JudgeRouteCircle {

	public static void main(String[] args) {
		
		String stuff = "UD";
		
		judgeCircle(stuff);

	}
	
    public static boolean judgeCircle(String moves) {
        
    	char [] moveArray = moves.toCharArray();
    	
    	int x = 0;
    	int y = 0;
    	
    	for (int k = 0; k < moveArray.length; k++){
    		
    		char temp = moveArray[k];
    		
    		switch (temp) {
    		case 'U':
    			y++;
    			break;
    		case 'D':
    			y--;
    			break;
    		case 'R':
    			x++;
    			break;
    		case 'L':
    			x--;
    			break;
    			
    		}
    		
    	}
    	
    	if ((x == 0) && (y == 0)){
    		System.out.println("true");
    		return true;}
    	else{
    		System.out.println("true");
    		return false;}
    	
    }

}
