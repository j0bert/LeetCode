/*Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.
For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].

To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
For example, inverting [0, 1, 1] results in [1, 0, 0].*/

public class FlippingAnImage {

	public static void main(String[] args) {
		
		int [][] A = new int [][] {{1,1,0},{1,0,1},{0,0,0}};
		int [][] B = new int [A.length][A[0].length];
		B = flipAndInvertImage(A);
		for (int i = 0; i < A.length; i++){
			for (int k = 0; k < A[i].length; k++){
				System.out.print(A[i][k] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static int[][] flipAndInvertImage(int [][] A) {
		
		for (int a = 0; a < A.length; a++){
			for (int b = 0; b < A[b].length / 2; b++){
				int temp = A[a][b];
				A[a][b] = A[a][A[a].length - b - 1];
				A[a][A[a].length - b - 1] = temp;
			}
		}
		
		for (int c = 0; c < A.length; c++){
			for (int d = 0; d < A[c].length; d++){
				if (A[c][d] == 1) {A[c][d] = 0;}
				else {A[c][d] = 1;}
			}
		}
		
		return A;
		
	}

}
