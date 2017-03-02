public class Test{
    public Test(String filename){
	char[][] grid;
	try{
	    File file = new File(filename);
	    Scanner in = new Scanner(file);
	    int counter = 0;
	    while(in.hasNextLine()){
		String pass = in.nextLine();
		counter++;
	    }
	    in.close();
	    Scanner in = new Scanner(file);
	    grid = new char[in.nextLine.length()][counter];
	    for(int i = 0;i < grid.length;i++){
		String pass = in.nextLine();
		for(int j = 0;j < pass.length();j++;){
		    grid[i][j] = pass.charAt(j);
		}
	    }
	} catch (FileNotFoundException e){
	    System.exit(1);
	}
    }
    
    public static void main(String[]args){
	Test testy = new Test(data1.dat)
    }
}
