import java.util.HashSet;

public class SudokuSolver {

	public static void main(String[] args) {
		
		char[][] board = {
				{'.','.','3','.','4','7','6','.','.'},
				{'.','9','.','.','.','.','.','3','.'},
				{'7','.','.','.','.','6','.','.','5'},
				{'8','.','5','.','7','.','.','.','.'},
				{'4','.','.','2','9','3','.','.','8'},
				{'.','.','.','.','8','.','1','.','4'},
				{'2','.','.','3','.','.','.','.','1'},
				{'.','7','.','.','.','.','.','2','.'},
				{'.','.','4','7','2','.','8','.','.'}};
		
		printBoard(board);
		System.out.println();
		if(solve(board))
			printBoard(board);
		else
			System.out.println("No Solution.");
		
		System.out.println(System.currentTimeMillis());
		
	}

	public static boolean solve(char[][] board){
	    for(int i=0; i<9; i++){
	        for(int j=0; j<9; j++){
	            if(board[i][j]!='.')
	                continue;
	            for(int k=1; k<=9; k++){
	                board[i][j] = (char) (k+'0');
	                if(isValid(board, i, j) && solve(board))
	                    return true;
	                board[i][j] = '.';    
	            }
	 
	            return false;
	        }
	    }
	 
	    return true;
	}
	
	public static boolean isValid(char[][] board, int i, int j){
	    HashSet<Character> set = new HashSet<Character>();
	 
	    for(int k=0; k<9; k++){
	        if(set.contains(board[i][k]))
	            return false;
	 
	        if(board[i][k]!='.' ){
	            set.add(board[i][k]);
	        }
	    }
	 
	    set.clear();
	 
	    for(int k=0; k<9; k++){
	        if(set.contains(board[k][j]))
	            return false;
	 
	        if(board[k][j]!='.' ){
	            set.add(board[k][j]);
	        }
	    }
	 
	    set.clear();
	 
	    for(int m=0; m<3; m++){
	        for(int n=0; n<3; n++){
	            int x=i/3*3+m;
	            int y=j/3*3+n;
	            if(set.contains(board[x][y]))
	                return false;
	 
	            if(board[x][y]!='.'){
	                set.add(board[x][y]);
	            }    
	        }
	    }
	 
	    return true;
	}
	
	public static void printBoard(char[][] board){
		for (int k = 0; k < board.length; k++){
			System.out.println("-------------------------------------");
			for (int i = 0; i < board.length; i++){
				System.out.print("| " +board[k][i] + " ");
			}
			System.out.print("|\n");
		}
		System.out.println("-------------------------------------");
	}

}