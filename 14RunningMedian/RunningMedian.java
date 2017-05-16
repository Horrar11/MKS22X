public class RunningMedian{
    private MyHeap maxH, minH;
    private double current;
	
    public RunningMedian(){
	maxH = new MyHeap();
	minH = new MyHeap(false);
	current = 0.0;
    }//make an empty running median.

    public void add(int toAdd){
	if(toAdd > current){
	    minH.add(toAdd);
	    
	}
	else{
	    maxH.add(toAdd);
	    
	}
    }//insert the value into the heap.
    
    public double getMedian(){}//return the median (do not remove anything)
    
    public void updateMedian(){
	
    }
}
