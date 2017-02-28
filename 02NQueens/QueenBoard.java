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
	if(r >= board.length){
	    return true;
	}
	for(int c = 0; c < board.length; c++){
	    if(board[r][c] == 0){
		addQueen(r,c);
		//System.out.println(this);
		if(solveH(r+1)){
		    // System.out.println("hello");
		    return true;
		}
		else{
		    removeQueen(r,c);
		}
	    }
	    //else{
	    //	return false;
	    //}
       	}
	return false;
    }
    
    public int getSolutionCount(){
        if (solutionCount == 0 && (board.length!=2 || board.length != 3)){
	    return -1;
	}
	return solutionCount;
    }

    public void countSolutions(){
	solutionCount = 0;
	countSolH(0, false);
    }

    private boolean countSolH(int r, boolean fin){
	if(r >= board.length){
	    if(!fin){
		solutionCount++;
		return fin;
	    }
	    else{
		return fin;
	    }
	}
	for(int c = 0; c < board.length; c++){
	    if(board[r][c] == 0){
		addQueen(r,c);
		if(countSolH(r + 1, fin)){
		    return true;
		}
		else{
		    removeQueen(r,c);
		}
	    }
	}
	return false;
    }
    
    private void addQueen(int r, int c){
	for(int i = c+1; i < board.length; i++){
	    board[r][i] = board[r][i] + 1;
	}
	for(int i = r+1; i < board.length; i++){
	    board[i][c] = board[i][c] + 1;
	}
	for(int col = c, row = r; row < board.length && col < board.length; row++, col++){
	    board[row][col] = board[row][col]+1;
	}
	
	for(int col = c,  row = r; row > -1 && col < board.length; row--, col++){
	    board[row][col] = board[row][col]+1;
	}
	board[r][c]=-1;
    }
    
    private void removeQueen(int r, int c){
	for(int i = c+1; i < board.length; i++){
	    board[r][i] = board[r][i] - 1;
	}
	for(int i = r+1; i < board.length; i++){
	    board[i][c] = board[i][c] - 1;
	}
	for(int col = c, row = r; row < board.length && col < board.length; row++, col++){
	    board[row][col] = board[row][col] - 1;
	}
	
	for(int col = c,  row = r; row > -1 && col < board.length; row--, col++){
	    board[row][col] = board[row][col] - 1;
	}
	board[r][c]=0;
    }
    
    
    public String toString(){
	String toOut = "";
	for(int i = 0; i<board.length; i++){
	    for(int j = 0; j<board[i].length; j++){
		if(board[i][j] == -1){toOut += "Q";}
		else{toOut += "_";}//board[i][j];}
	    }
	    toOut += "\n";
	}
	return toOut;
    }
    
    /*public static void main(String[]args){
      QueenBoard b = new QueenBoard(5);
      System.out.println(b.getSolutionCount());
      //System.out.println(b);
      //b.addQueen(3,3);
      //System.out.println(b);
      //b.removeQueen(3,3);
      //System.out.println(b);
      b.solve();
      System.out.println(b);
      b.countSolutions();
      System.out.println(b.getSolutionCount());
      }*/
}
