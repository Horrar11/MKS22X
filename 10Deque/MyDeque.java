import java.util.*;

public class MyDeque{
    int front, back, size;
    String[] listD;

    public MyDeque(){
	listy = new String[10];
	size = 0;
    }

    public void addFirst(String str){
	if(str.equals("")){
	    throw new NullPointerException();
	}
	if(size == 0){
	    listy[0]=str;
	    front = 0;
	    back = 0;
	}
	else{
	    if(front-1 == back){
		this.resize();
	    }
	    if(front == 0){
		if(back==listy.length - 1){
		    this.resize();
		}
		listy[(listy.length)-1]=str;
		front = listy.length-1;
	    }

	    else{
		listy[front-1]=str;
		front--;
	    }
	}

	size++;
    }

    public void addLast(String str){
	if(str.equals("")){
	    throw new NullPointerException();
	}
	if(size == 0){
	    listD[0]=str;
	    front = 0;
	    back = 0;
	}
	else{
	    if(front-1 == back){
		this.resize();
	    }
	    if(back == listD.length -1){
		if(front != 0){
		    listD[0]=str;
		    back = 0;
		}
		else{
		    this.resize();
		    listD[size]=str;
		    back++;
		}
	    }
	    else{
		listD[back+1]=str;
		back++;
	    }
	}
	size++;
	
    }

    public void resize(){
	String[] temp = new String[2*(size+1)];
	for(int i=0, j=front; i < size; i++, j++){
	    if(j == listD.length){
		j = 0;
	    }
	    temp[i]=listD[j];
	}
	listD = temp;
	front=0;
	back=size-1;
    }

    public String removeFirst(){
	String temp = listD[front];
	if (front == listD.length-1){
	    front = 0;
	}
	else{
	    front--;
	}
	size--;
	return temp;
    }

    public String removeLast(){
	String temp = listD[back];
	if (back==0){
	    back = size;
	}
	else{
	    back--;
	}
	size--;
	return temp;
    }
    
    public String getFirst(){
	if (size ==0){
	    throw new NoSuchElementException();
	}
	else{
	    return listD[front];
	}
    }
    public String getLast(){
	if (size ==0){
	    throw new NoSuchElementException();
	}
	else{
	    return listD[front];
	}
    }
}
