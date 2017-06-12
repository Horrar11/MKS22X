public class KnightBoard{
    private int[][]board;
    private boolean solved;
    private int maxlvl, maxR, maxC;
    public KnightBoard(int startingRows,int startingCols){
	board = new int[startingRows][startingCols];
	maxlvl =startingRows * startingCols;
	maxR = startingRows;
	maxC = startingCols;
	solved = false;
    }
    
    public String toString(){
	if(solved){
	    String toOut = "";
	    for(int i = 0; i < board.length; i++){
		for(int j = 0; j < board[i].length; j++){
		    if(board[i][j] < 10){
			toOut += "    " + board[i][j];
		    }
		    else if(board[i][j] < 100){
			toOut += "   " + board[i][j];
		    }
		     else if(board[i][j] < 1000){
			toOut += "  " + board[i][j];
		     }
		    else{
			toOut += " " + board[i][j];
		    }
		}
		toOut += "\n";
	    }
	    return toOut;
	}
	else{return "";}
    } //blank if you never called solve or when there is no solution
    
    public void solve(){
	solved = true;
	//solveH(0,0,1);
	for(int i = 0; i < board.length; i++){
	    for(int j = 0; j < board[i].length; j++){
		if(solveH(i, j, 1)){
		    i = board.length - 1;
		    j = board[i].length;
		}
	    }
	}
	System.out.println(this);
    }
    
    private boolean solveH(int row ,int col, int level){
	if(maxR == 1 && maxC == 1){
	    addKnight(0,0,1);
	    return true;
	}
	if(level > maxlvl){
	    return true;}
	else{
	    if(board[row][col] == 0){
		addKnight(row, col, level);
		System.out.println(this);
		if(!emptySquares(row, col, level)){
			    removeKnight(row, col);
			    return false;
		}
		else{return true;}
	    }
	}
	return false;
    }// level is the # of the knight
    
    private boolean emptySquares(int row, int col,int level){
	return (((row + 1 < maxR && col + 2 < maxC) && solveH(row + 1, col + 2, level + 1))||
		((row + 1 < maxR && col - 2 >= 0) && solveH(row + 1, col - 2, level + 1))||
		((row - 1 >= 0 && col + 2 < maxC) && solveH(row - 1, col + 2, level + 1))||
		((row - 1 >= 0 && col - 2 >= 0) && solveH(row - 1, col - 2, level + 1))||
		((row + 2 < maxR && col + 1 < maxC) && solveH(row + 2, col + 1, level + 1))||
		((row + 2 < maxR && col - 1 >= 0 ) && solveH(row + 2, col - 1, level + 1))||
		((row - 2 >= 0 && col + 1 < maxC) && solveH(row - 2, col + 1, level + 1))||
		((row - 2 >= 0 && col - 1 >= 0) && solveH(row - 2, col - 1, level + 1)));
    }


    private void addKnight(int r, int c, int level){board[r][c] = level;}
    private void removeKnight(int r, int c){board[r][c] = 0;}


    public static void main(String[]args){
	KnightBoard k = new KnightBoard(57, 39);
	//System.out.println(k);
	k.solve();
	//System.out.println(k);
    }
}
