public class QueenBoard{
    private int[][]board;
    private int solutionCount = -1;

    public QueenBoard(int size){
	board = new int[size][size];
    }

    public boolean solve(){
	return solveH(0);
    }

    private boolean solveH(int r){
	for(int c = 0; c < board[r].length; c++){
	    if(r<board.length){
		if(board[r][c] == 0){
		    addQueen(r,c);
		    if(!solveH(r++)){
			removeQueen(r,c);
			return false;
		    }
		}
		else{}
	    }
	    else{
		return false;
	    }
	}
    }
    
    public int getSolutionCount(){
	return solutionCount;
    }
    
    private void addQueen(int r, int c){
	board[r][c] -= 2;
	for(int i = 0; i < board.length; i++){
	    for(int j = 0; j < board.length; j++){
		if(i == r || i == c|| j == r || j == c){
		    board[r][c]++;
		}
	    }
	}
    }
    private void removeQueen(int r, int c){
	board[r][c] += 2;
	for(int i = 0; i < board.length; i++){
	    for(int j = 0; j < board.length; j++){
		if(i == r || i == c|| j == r || j == c){
		    board[r][c]--;
		}
	    }
	}
    }
    
    public String toString(){
	String toOut = "";
	for(int i = 0; i<board.length; i++){
	    for(int j = 0; j<board[i].length; j++){
		if(board[i][j] == -1){toOut += "Q";}
		else{toOut += "_";}
	    }
	}
	return toOut;
    }
}
