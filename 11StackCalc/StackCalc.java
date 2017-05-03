public class StackCalc{
    public StackCalc(){}
    
    public boolean isOp(String operator){
	return operator.equals("+")||operator.equals("-")||operator.equals("*")||operator.equals("/");
    }
    
    public static double perform(, double x, double y){}
    
    public static double eval(String s){
	String[] tokens = s.split(" ");
	Stack<Double> values = new Stack<Double>();
	
	for(String token : tokens){
	    if(isOp(token)){
		values.push(perform(token,values.pop(),values.pop()));
	    }
	    else{
		values.push(Double.parseDouble(token));
	    }
	}
	
	return values.pop();
    }
}
