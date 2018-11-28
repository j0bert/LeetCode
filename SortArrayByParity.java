/*Given an array A of non-negative integers, return an array consisting of all the even elements of A,
followed by all the odd elements of A.

You may return any answer array that satisfies this condition.*/

public class SortArrayByParity {

	public static void main(String[] args) {
		
		int [] A = {1,2,3,4,5,6,7,9};
		int [] B = sortArrayByParity(A);
		
		for (int i = 0; i < B.length; i++)
			System.out.print(B[i] + " ");
		
	}
	
    public static int[] sortArrayByParity(int[] A) {
        
        int [] ans = new int [A.length];

        int next = 0;
        
        for (int i = 0; i < A.length; i++){
        	
        	if (A[i] % 2 == 0){
        		ans[next] = A[i];
        		next++;
        	}
        	
        }
        
        for (int j = 0; j < A.length; j++){
        	
        	if (A[j] % 2 == 1){
        		ans[next] = A[j];
        		next++;
        	}
        }
        
        return ans;
        
    }

}
