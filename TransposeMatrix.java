
public class TransposeMatrix {

	public static void main(String[] args) {
		
		int [][] A = new int[][]{
			{1,2,3},
			{4,5,6}
		};
		
		int [][] B = transpose(A);
		
		for (int a = 0; a < B.length; a++){
			for (int b = 0; b < B[0].length; b++){
				System.out.print(B[a][b] + " ");
			}
			System.out.println();
		}
		
	}
	
    public static int[][] transpose(int[][] A) {
    	
    	int[][] ans = new int [A[0].length][A.length];
    	
    	for (int i = 0; i < A[0].length; i++){
    		for (int k = 0; k < A.length; k++){
    			ans[i][k] = A[k][i];
    		}
    	}
    	
    	return ans;
        
    }

}
