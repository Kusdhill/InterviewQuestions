class WordSearch{
	
	private static void printBoard(char[][] board){
		for(int i=0; i<board.length; i++){
			for(int j=0; j<board[i].length; j++){
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	private static boolean exist(int y, int x, int i, int j, char[][] board, String word, int wordPos){
		System.out.println(Integer.toString(i)+", "+Integer.toString(j));
		printBoard(board);
		// if reached end of word, return true
		if(wordPos>=word.length()){
			return true;
		}

		if(i<0 || i>=y || j<0 || j>=x || board[i][j]=='*' || word.charAt(wordPos)!=board[i][j]){
			return false;
		}
		
		board[i][j] = '*';
		boolean result = 	exist(y, x, i-1, j, board, word, wordPos+1) // up
							|| exist(y, x, i+1, j, board, word, wordPos+1) // down
							|| exist(y, x, i, j-1, board, word, wordPos+1) // left
							|| exist(y, x, i, j+1, board, word, wordPos+1); // right
		board[i][j] = word.charAt(wordPos);

		return result;
	}

	public static boolean exist(char[][] board, String word){
		int y = board.length;
		int x = board[0].length;

		int wordPos=0;

		for(int i=0; i<y; i++){
			for(int j=0; j<x; j++){
				if(exist(y, x, i, j, board, word, wordPos)) return true;
			}
		}

		return false;
	}

	public static void main(String[] args){
		char[][] board = {
  			{'A','B','C','S'},
  			{'S','F','A','F'},
  			{'A','C','E','E'}
		};

		String word = "SFC";
		System.out.println(exist(board, word));
	}
}