
public class ProjectionAreaOf3DShapes {

	public static void main(String[] args) {
		
		int [][] grid = new int[][]{
			{2}
		}; 
		
		System.out.println(projectionArea(grid));

	}
	
    public static int projectionArea(int[][] grid) {
    	
    	int xy = 0, yz = 0, zx = 0;
    	int ans = 0;
    	
    	for (int i = 0; i < grid.length; i++){
    		for (int k = 0; k < grid[0].length; k++){
    			if (grid[i][k] > 0){
    				xy++;
    			}	
    		}
    	}
    	
    	return ans;
        
    }

}
