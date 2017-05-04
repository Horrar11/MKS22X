public class KnightBoard{
    private int[][]board;
    private boolean solved;
    public KnightBoard(int startingRows,int startingCols){
	board = new int[startingRows][startingCols];
	solved = false;
    }
    
    public String toString(){
	if(solved){
	    String toOut = "";
	    for(int i = 0; i < board.length; i++){
		for(int j = 0; j < board[i].length; j++){
		    if(board[i][j] < 10){
			toOut = " " + board[i][j];
		    }
		    else{
			toOut += board[i][j];
		    }
		}
		toOut += "\n";
	    }
	    return toOut;
	}
	else{return "";}
    } //blank if you never called solve or when there is no solution
    
    public void solve(){
	if(solveH(0,0,1)){
	    solved = true;
	}
	solved = true;
    }
    
    private boolean solveH(int row ,int col, int level){
	if(level >= row * col){
	    return true;}
	else{
	    addKnight(row, col, level);
	    System.out.println(this);
	    if(!emptySquares(row, col, level)){
		removeKnight(row, col);
		return false;
	    }
	    else{return true;}
	}
    }// level is the # of the knight
    
    private boolean emptySquares(int row, int col,int level){
	if(board[row-2][col+1] == 0/*row-2 >= 0 && col+1 < board.length*/){return solveH(row - 2, col + 1, level + 1);}
	else if(board[row-1][col+2] == 0){return solveH(row - 1, col + 2, level + 1);}
	else if(board[row+1][col+2] == 0){return solveH(row + 1, col + 2, level + 1);}
	else if(board[row+2][col+1] == 0){return solveH(row + 2, col + 1, level + 1);}
	else if(board[row+2][col-1] == 0){return solveH(row + 2, col - 1, level + 1);}
	else if(board[row+1][col-2] == 0){return solveH(row + 1, col - 2, level + 1);}
	else if(board[row-1][col-2] == 0){return solveH(row - 1, col - 2, level + 1);}
	else if(board[row-2][col-1] == 0){return solveH(row - 2, col - 1, level + 1);}
	else{return false;}
    }
    
    private void addKnight(int r, int c, int level){board[r][c] = level;}
    private void removeKnight(int r, int c){board[r][c] = 0;}


    public static void main(String[]args){
	KnightBoard k = new KnightBoard(7, 7);
	System.out.println(k);
	k.solve();
	System.out.println(k);
    }
}
