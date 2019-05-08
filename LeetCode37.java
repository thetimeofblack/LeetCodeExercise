class LeetCode37{
	public static void solveSudoku(char[][] board){
			solve(board,0); 
	}
	
	public static boolean solve(char[][] board, int position){
		if(position==81) return true; 
		int row = position/9 ; 
		int col = position%9 ; 
		if(board[row][col]=='.'){
			for(int i = 1 ; i<=9 ;i++){
				board[row][col] =(char) (i+48); 
				if(validate(board,position)){
					//board[row][col] =(char) (i+48); 
					if(solve(board,position+1)) {
						
					    //System.out.println("position "+position+"character "+board[row][col]);
				
						return true; 
					}
					board[row][col] = '.'; 
				}//System.out.println("position "+position+"character "+board[row][col]);
				else{
						board[row][col] = '.'; 
						//System.out.println("position "+position+"character "+board[row][col]);	
				}
				
			}
		}else{
			if(solve(board,position+1)) return true;  
		}
		return false;
	}
	
	public static boolean validate(char[][] board , int position){
			int row = position/9; 
			int col = position%9;
			int gridx = row/3*3; 
			int gridy = col/3*3; 
			for(int i= 0 ;i<9 ;i++){
				//System.out.println("The row is "+ row + "The col is "+ col + "The value is"+ board[row][col]);
				if(i!=col&&board[row][i]==board[row][col]) return false;
				if(i!=row&&board[i][col]==board[row][col]) return false;
				int x = i/3; 
				int y = i%3;
				x += gridx ; 
				y += gridy ; 
				if((row!=x)&&(col!=y)&&(board[row][col]==board[x][y])) return false;
			}
			//System.out.println("The row is "+ row + "The column is "+col+ "The b is" +board[row][col]);
			return true; 
	}
	public static void main(String[] args){
		char[][] b1 = {{'5','3','.','.','7','.','.','.','.'},
					   {'6','.','.','1','9','5','.','.','.'},
					   {'.','9','8','.','.','.','.','6','.'},
					   {'8','.','.','.','6','.','.','.','3'},
					   {'4','.','.','8','.','3','.','.','1'},
					   {'7','.','.','.','2','.','.','.','6'},
					   {'.','6','.','.','.','.','2','8','.'},
					   {'.','.','.','4','1','9','.','.','5'},
					   {'.','.','.','.','8','.','.','7','9'}
					  };
		solveSudoku(b1);
		for(int i= 0 ;i<9 ;i++){
			for(int j= 0 ; j<9 ;j++){
				System.out.print(b1[i][j]+" "); 
			}
			System.out.println(); 
		}
	
}
} 