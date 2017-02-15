public class QueenBoard{
    private int[][]board;
    private int solutionCount = -1;
    private int qnum = 0;

    public QueenBoard(int size){
	board = new int[size][size];
    }

    public boolean solve(){
	return solveH(0);
    }

    private boolean solveH(int r){
	if(r >= board.length){
	    return true;
	}
	for(int c = 0; c < board.length; c++){
	    if(board[r][c] == 0){
		addQueen(r,c);
		if(solveH(r+1)){
		    return true;
		}
		else{
		    removeQueen(r,c);
		}
	    }
	    else{
		return false;
	    }
       	}
	return false;
    }
    
    public int getSolutionCount(){
	return solutionCount;
    }
    
    private void addQueen(int r, int c){
	for(int i = 0; i < board.length; i++){
	    for(int j = 0; j < board.length; j++){
		if(i == r || i == c|| j == r || j == c){
		    board[i][j]++;
		    qnum++;
		}
	    }
	}
	board[r][c] = -1;
    }
    private void removeQueen(int r, int c){
	for(int i = 0; i < board.length; i++){
	    for(int j = 0; j < board.length; j++){
		if(i == r || i == c|| j == r || j == c){
		    board[i][j]--;
		    qnum--;
		}
	    }
	}
	board[r][c] = 0;
    }
    
    public String toString(){
	String toOut = "";
	for(int i = 0; i<board.length; i++){
	    for(int j = 0; j<board[i].length; j++){
		if(board[i][j] == -1){toOut += "Q";}
		else{toOut += "_";}
	    }
	    toOut += "\n";
	}
	return toOut;
    }
}
