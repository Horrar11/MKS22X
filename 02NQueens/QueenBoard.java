public class QueenBoard{
    private int[][]board;
    private int solutionCount;

    public QueenBoard(int size){
	board = new int[size][size];
    }

    public boolean solve(){
	return solveH(0);
    }

    private boolean solveH(int r){
	return false;
    }
    
    public int getCount(){
	return solutionCount;
    }
    
    private void addQueen(int r, int c){board[r][c]--;}
    private void removeQueen(int r, int c){board[r][c]++;}
    
    public String toString(){
	String toOut = "";
	for(int i; i<board.length(); i++){
	    for(int j; j<board[i].length(); j++){
		if(board[i][j] == -1){toOut += "Q";}
		else{toOut += "_";}
	    }
	}
	return toOut;
    }
}
