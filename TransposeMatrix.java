
/*Given a matrix A, return the transpose of A.

The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column indices of the matrix.*/

public class TransposeMatrix {
	
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
