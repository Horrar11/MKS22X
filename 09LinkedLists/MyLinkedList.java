import java.util.*;
public class MyLinkedList implements Iterable<Integer>{
    
    private class LNode{
	LNode next,prev;
	int value;
	public LNode(int value){
	    this.value=value;
	}
	public String toString(){
	    return value+"";
	}
    }
    
    LNode head,tail, current;
    int size, cp;
    
    public MyLinkedList(){
	size = 0;
    }
    
    public int size(){
	return size;
    }
    
    
    private LNode getNthNode(int n){
	if(cp == n){
	    return current;
	}
	if(cp > n){
	    for(cp > n; cp--){
		current = current.prev;
	    }
	}
	if(cp < n){
	    for(cp < n; cp++){
		current = current.next;
	    }
	}
	return current;
    }
    
    private void addAfter(LNode location, LNode toBeAdded){
	location.next.prev = toBeAdded;
	toBeAdded.next = location.next;
	location.next = toBeAdded;
	toBeAdded.prev = location;
    }
    
    private void remove(LNode target){
	target.prev.next = target.next;
	target.next.prev = target.prev;
	size--;
    }
    
    public String toString(){
	String toRet = "";
	for(int i = 0; i < size(); i++){
	    
	}
    }
    
    public boolean add(int value){
	LNode RNode = new LNode(value);
	if(size == 0){
	    current = RNode;
	    head = RNode;
	    tail = RNode;
	    cp = 0;
	}
	else{
	    RNode.prev = tail;
	    tail.next = RNode;
	    tail = RNode;
	}
	size++;
	return true;
    }
    
    public int get(int index){
	return getNthNode(index).value;
    }
    
    public int set(int index, int value){
	getNthNode(index).value = value;
	return value;
    }
    
    public int indexOf(int value){
	for(int i = 0; i < size; i++){
	    if(getNthNode(i).value == value){
		return i;
	    }
	}
	return -1;
    }
    
    public int remove(int index){
	LNode RNode = getNthNode(index); 
	remove(getNthNode(index));
	return RNode.value;
    }
    
    public void add(int index,int value){
	LNode RNode = getNthNode(index);
	LNode NNode = new LNode(value);
	RNode.prev.next = NNode;
	NNode.prev = RNode.prev;
	NNode.next = RNode;
	RNode.prev = NNode;
    }
    
    public Iterator<T> iterator(){}
}
