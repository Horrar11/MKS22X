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
		System.out.println(this);
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
	return solutionCount;
    }
    
    private void addQueen(int r, int c){
	for(int i = 0; i < board.length; i++){
	    for(int j = 0; j < board.length; j++){
		if(i == r || i == c|| j == r || j == c){
		    board[i][j]++;
		}
	    }
	}
	for(int i = r, j = c;i >= 0 && j >= 0;i--, j--){
	    board[i][j]++;
	}
	for(int i = r, j = c;i >= 0 && j < board.length;i--, j++){
	    board[i][j]++;
	}
	for(int i = r, j = c;i < board.length && j >= 0;i++, j--){
	    board[i][j]++;
	}
	for(int i = r, j = c;i < board.length && j < board.length;i++, j++){
	    board[i][j]++;
	}
	board[r][c] = -1;
	qnum++;
    }
    private void removeQueen(int r, int c){
	for(int i = 0; i < board.length; i++){
	    for(int j = 0; j < board.length; j++){
		if(i == r || i == c|| j == r || j == c){
		    board[i][j]--;
		}
	    }
	}
	for(int i = r, j = c;i >= 0 && j >= 0;i--, j--){
	    board[i][j]--;
	}
	for(int i = r, j = c;i >= 0 && j < board.length;i--, j++){
	    board[i][j]--;
	}
	for(int i = r, j = c;i < board.length && j >= 0;i++, j--){
	    board[i][j]--;
	}
	for(int i = r, j = c;i < board.length && j < board.length;i++, j++){
	    board[i][j]--;
	}
	board[r][c] = 0;
	qnum--;
    }
    
    public String toString(){
	String toOut = "";
	for(int i = 0; i<board.length; i++){
	    for(int j = 0; j<board[i].length; j++){
		if(board[i][j] == -1){toOut += "Q";}
		else{toOut += board[i][j];}
	    }
	    toOut += "\n";
	}
	return toOut;
    }

    public static void main(String[]args){
	QueenBoard b = new QueenBoard(4);
	System.out.println(b.getSolutionCount());
	System.out.println(b);
	b.solve();
	System.out.println(b);
	System.out.println(b.getSolutionCount());
    }
}
