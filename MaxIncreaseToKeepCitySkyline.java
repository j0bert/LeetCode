/*In a 2 dimensional array grid, each value grid[i][j] represents the height of a building located there.
We are allowed to increase the height of any number of buildings, by any amount (the amounts can be different for different buildings).
Height 0 is considered to be a building as well. 

At the end, the "skyline" when viewed from all four directions of the grid, i.e. top, bottom, left, and right, must
be the same as the skyline of the original grid. A city's skyline is the outer contour of the rectangles formed by all
the buildings when viewed from a distance.

What is the maximum total sum that the height of the buildings can be increased?*/

public class MaxIncreaseToKeepCitySkyline {

	public static void main(String[] args) {
		
		int [][] grid = new int [4][4];
		
		//create and print random 2D array
		for (int i = 0; i < grid.length; i++){
			for (int j = 0; j < grid[i].length; j++){
				grid[i][j] = (int)(Math.random()*100);
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		maxIncreaseKeepingSkyline(grid);
		
	}

	static public int maxIncreaseKeepingSkyline(int[][] grid) {
		int ans = 0;
		
		//find sky line from each direction: left/right & up/down
		
		int [] LRSkyline = new int [grid.length];
		int [] UDSkyline = new int [grid[0].length];
		//System.out.println("Number of buildings long (LR): " + grid.length);
		//System.out.println("Number of buildings wide (UD): " + grid[0].length);
		
		//find LRSkyline heights
		for(int i = 0; i<grid.length; i++){
			int max = 0;
			for(int k = 0; k<grid[0].length;k++){
				if (grid[i][k] > max)
					max = grid[i][k];
			}
			LRSkyline[i] = max;
		}
		
		//find UDSkyline heights
		for(int i = 0; i<grid[0].length; i++){
			int max = 0;
			for(int k = 0; k<grid.length;k++){
				if (grid[k][i] > max)
					max = grid[k][i];
			}
			UDSkyline[i] = max;
		}
		
		//print out heights from each view
		System.out.print("Skyline from left or right: ");
		for(int j = 0; j<LRSkyline.length; j++){
			System.out.print(LRSkyline[j] + " ");
		}
		
		System.out.println();
		
		System.out.print("Skyline from up or down: ");
		for(int j = 0; j<UDSkyline.length; j++){
			System.out.print(UDSkyline[j] + " ");
		}
		
		for (int j = 0; j < grid[0].length; j++){
			for (int k = 0; k < grid.length;){
				if (grid[k][j] < UDSkyline[j] && grid[k][j] < LRSkyline[k]){
					grid[k][j]++;
					ans++;
				}
				else {
					k++;
				}
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < grid.length; i++){
			for (int j = 0; j < grid[i].length; j++){
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n" + ans);
		
		
		return ans;
        
    }
	
}
