import java.util.*;
public class MyHeap{
    
    private ArrayList<String> heap;
    private int size;
    public MyHeap(){
	heap = new ArrayList<String>(1);
	heap.add("DUMMY");
	size = 0;
    }
    
    public MyHeap(boolean k){
	if(!k){
	    
	}
    }
    
    public void add(String s){
	heap.add(s);
	size++;
	pushUp(size);
    }

    public String remove(){
	String toRet = peek();
	heap.set(1, heap.get(size));
	heap.set(size, toRet);
	heap.remove(size);
	size--;
	pushDown(1);
	return toRet;
    }

    public String peek(){
	return heap.get(1);
    }

    public void pushUp(int ind){
	if(heap.get(ind)>heap.get(ind/2)){
	    String temp = heap.get(ind/2);
	    heap.set(ind/2, heap.get(ind));
	    heap.set(ind, temp);
	    pushUp(ind/2);
	}
    }

    public void pushDown(int ind){
	if(!(heap.get(ind) >= heap.get(ind*2) && heap.get(ind) >= heap.get(ind*2+1)){
		String temp = heap.get(ind);
		if(heap.get(ind) > heap.get(2*ind)){
		    heap.set(ind, heap.get(2*ind+1));
		    heap.set(2*ind+1, temp);
		    pushDown(2*ind+1);
		}
		else{
		    heap.set(ind, heap.get(2*ind));
		    heap.set(2*ind, temp);
		    pushDown(2*ind);
		}
	    }
	    }
	else{}
    }
}
