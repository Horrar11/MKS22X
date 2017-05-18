public class RunningMedian{
    private MyHeap maxH, minH;
    
    public RunningMedian(){
	maxH = new MyHeap();
	minH = new MyHeap(false);
    }//make an empty running median.
    
    public void add(int toAdd){
	if(toAdd > getMedian()){
	    maxH.add(toAdd);
	    
	}
	else{
	    minH.add(toAdd);
	    
	}
    }//insert the value into the heap.
    
    public double getMedian(){
	if(maxH.size == minH.size){
	    return maxH.peek() + minH.peek() / 2.0;
	}
	else{
	    if(minH.size > maxH.size){
		return minH.peek();
	    }
	    return maxH.peek();
	}
	
    }//return the median (do not remove anything)
}
