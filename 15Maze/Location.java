public class Location implements Comparable<Location>{

    // instance variables:
    private int row,col;
    private int distToGoal,distToStart;
    private Location previous;// (used to trace the solution)
    private boolean aStar;
    // when this is true, compareTo will use: distToStart + distToGoal
    //	when this is false, compareTo will use the distToGoalonly.
    
    //2c Constructors:
    public Location(int r, int c, Location previous , int distToStart, int distToGoal, boolean aStar){
	row = r;
	col = c;
	this.previous = previous;
	this.distToStart = distToStart;
	this.distToGoal = distToGoal;
	this.aStar = aStar;
    }
    
    //2d Methods: 
    public int getRow(){return row;}
    public int getCol(){return col;}
    //accessors as needed
    
    public int CompareTo( Location other){
	if(aStar){
	    if((this.distToStart + this.distToGoal)>(other.distToStart + other.distToGoal)){return 1;}
	    else{
		if((this.distToStart + this.distToGoal)==(other.distToStart + other.distToGoal)){return 0;}  
		return -1;
	    }
	}
	else{
	if(this.distToGoal > other.distToGoal){return 1;}
	else{
	    if(this.distToGoal == other.distToGoal){return 0;}
	    return -1;
	}
	}
	
	
    }
    // -> decide what number to compare using the aStar boolean.
}
