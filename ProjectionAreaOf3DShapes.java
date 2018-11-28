/*On a N * N grid, we place some 1 * 1 * 1 cubes that are axis-aligned with the x, y, and z axes.

Each value v = grid[i][j] represents a tower of v cubes placed on top of grid cell (i, j).

Now we view the projection of these cubes onto the xy, yz, and zx planes.

A projection is like a shadow, that maps our 3 dimensional figure to a 2 dimensional plane. 

Here, we are viewing the "shadow" when looking at the cubes from the top, the front, and the side.

Return the total area of all three projections.*/

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
