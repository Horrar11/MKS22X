import java.util.*;
public class MyLinkedList{
    
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
    
    LNode head,tail;
    int size;
    
    public MyLinkedList(){
	size = 0;
    }
    
    public int size(){
	return size;
    }
    
    
    private LNode getNthNode(int n){/*complete this*/}
    
    private void addAfter(LNode location, LNode toBeAdded){/*complete this*/  }
    
    private void remove(LNode target){
	target.prev.next = target.next;
	target.next.prev = target.prev;
	size--;
    }
    
    public String toString(){ /*complete this*/  }
    
    public boolean add(int value){
	LNode RNode = new LNode(value);
	if(size == 0){
	    head = RNode;
	    tail = RNode;
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
	LNode temp = head;
	if(index > size/2){
	    temp = tail;
	}
	else{
	     
	}
    }
    
    public int set(int index, int value){
	
    }
    
    public int indexOf(int value){/*complete this*/}
    
    public int remove(int index){/*complete this*/}
    
    public void add(int index,int value){}
}
