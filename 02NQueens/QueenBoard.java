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
	for(int c = 0; c < board.length; c++){
	    if(r<board.length){
		if(board[r][c] == 0){
		    addQueen(r,c);
		    qnum++;
		    if(qnum == board.length){
			return true;
		    }
			if(!solveH(r++)){
			    removeQueen(r,c);
			    qnum--;
			    return false;
			}
			else{
			    solutionCount ++;
			    return solveH(r+1);
			}
		}
		else{
		    return false;
		}
	    }
	    else{
		return false;
	    }
	}
	return true;
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
	    toOut += "\n";
	}
	return toOut;
    }
}
