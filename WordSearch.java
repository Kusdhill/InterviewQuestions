class WordSearch{
	
	private static boolean exist(int y, int x, int i, int j, char[][] board, String word, int wordPos){
		// if reached end of word, return true
		if(wordPos>=word.length()){
			return true;
		}

		if(i<0 || i>=y || j<0 || j>=x || board[i][j]=='*' || word.charAt(wordPos)!=board[i][j]){
			return false;
		}

		board[i][j] = '*';
		boolean result = 	exist(y, x, i-1, j, board, word, wordPos+1)
							|| exist(y, x, i+1, j, board, word, wordPos+1)
							|| exist(y, x, i, j-1, board, word, wordPos+1)
							|| exist(y, x, i, j+1, board, word, wordPos+1);		
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
  			{'A','B','C','E'},
  			{'S','F','C','S'},
  			{'A','D','E','E'}
		};

		String word = "ABCCEDS";
		System.out.println(exist(board, word));
	}
}