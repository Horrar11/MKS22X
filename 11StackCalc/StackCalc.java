import java.util.*;
import java.lang.*;

public class StackCalc{

    public static double eval(String s){
	String[] tokens = s.split(" ");
	Stack<Double> values = new Stack<Double>();
	for (int i =0; i < tokens.length; i++){
	    if(isOp(tokens[i])){
		values.push(apply(tokens[i],values.pop(),values.pop()));
	    }
	    else{
		try{
		    double temp;
		    temp = Double.parseDouble(tokens[i]);
		values.push(temp);
		}
		catch(IllegalArgumentException e){
		    System.out.println("Paralegals on the loose!!!");
		}
		
	    }
	}
	return values.pop();
    }

    public static boolean isOp(String s){
	return s.equals("+")
	    || s.equals("-")
	    || s.equals("*")
	    || s.equals("/")
	    || s.equals("%");
    }

    public static Double apply(String s, Double b, Double c){
	if(s.equals("+")){
	    return b + c;
	}
	if(s.equals("-")){
	    return c - b;
	}
	if(s.equals("*")){
	    return c * b;
	}
	if(s.equals("/")){
	    return c / b;
	}
        if(s.equals("%")){
	    return c % b;
	}
	return 0.0;
    }
}
