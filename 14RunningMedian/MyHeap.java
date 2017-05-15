import java.util.*;
public class MyHeap{
    
    private ArrayList<Integer> heap;
    private int size;
    private boolean way;
    public MyHeap(){
	heap = new ArrayList<Integer>(1);
	heap.add(null);
	size = 0;
	way = true;
    }
    
    public MyHeap(boolean k){
	if(!k){
	    way = k;
	}
    }
    
    public void add(int s){
	heap.add(s);
	size++;
	pushUp(size, way);
    }

    public int remove(){
	int toRet = peek();
	heap.set(1, heap.get(size));
	heap.set(size, toRet);
	heap.remove(size);
	size--;
	pushDown(1, way);
	return toRet;
    }

    public int peek(){
	return heap.get(1);
    }

    public void pushUp(int ind, boolean turn){
	
	if(turn){
	    if(heap.get(ind)>heap.get(ind/2)){
		int temp = heap.get(ind/2);
		heap.set(ind/2, heap.get(ind));
		heap.set(ind, temp);
		pushUp(ind/2);
	    }
	}
	else{
	    if(heap.get(ind)<heap.get(ind/2)){
		int temp = heap.get(ind/2);
		heap.set(ind/2, heap.get(ind));
		heap.set(ind, temp);
		pushUp(ind/2, turn);
	    }
	}
    }
    
    public void pushDown(int ind, boolean turn){
	
	if(turn){
	
	if(!(heap.get(ind)>=heap.get(ind*2)&&heap.get(ind)>=heap.get(ind*2+1)){
		int temp = heap.get(ind);
		if(heap.get(ind) > heap.get(2*ind)){
		    heap.set(ind, heap.get(2*ind+1));
		    heap.set(2*ind+1, temp);
		    pushDown(2*ind+1, turn);
		}
		else{
		    heap.set(ind, heap.get(2*ind));
		    heap.set(2*ind, temp);
		    pushDown(2*ind, turn);
		}
	    }
	    }
	}
	else{
	if(!(heap.get(ind)<=heap.get(ind*2)&&heap.get(ind)<=heap.get(ind*2+1)){
		int temp = heap.get(ind);
		if(heap.get(ind) < heap.get(2*ind)){
		    heap.set(ind, heap.get(2*ind+1));
		    heap.set(2*ind+1, temp);
		    pushDown(2*ind+1, turn);
		}
		else{
		    heap.set(ind, heap.get(2*ind));
		    heap.set(2*ind, temp);
		    pushDown(2*ind, turn);
		}
	    }
	    }
	}
    }
}
