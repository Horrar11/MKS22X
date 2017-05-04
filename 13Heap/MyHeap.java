import java.util.*;
public class MyHeap{
    
    private ArrayList<String> heap;
    public MyHeap(){
	heap = new ArrayList<String>(1);
	heap.add("DUMMY");
    }
    
    public MyHeap(boolean){}
    
    public void add(String s){
	heap.add(s);
	
	
    }

    public String remove(int index){
	String toRet = heap.remove(index);
	heap.add(index, heap.get(heap.size() - 1));
	heap.remove(heap.size()-1);
	heap.trimToSize(heap.size()-1);
	

	return toRet;
    }

    public String peek(){}

    public pushUp(){}

    public pushDown(){}
}
