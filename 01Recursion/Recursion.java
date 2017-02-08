public class Recursion{ 
    public static String name(){return "Kurkin,Anthony"}
    public static double sqrt(double n){
	if(n < 0){
	    throw IllegalArguementException("You can't do that! MAN!!!");
	}
	else{
	    return sqrtHelp(n,1);
	}
    } 
    public static sqrtHelp(double number, double guess){
	double better = (n/guess + guess)/2;
	if((guess - better)/better < .000001){
	    return better;
	}
	else{
	    return sqrtHelp(n,better);
	}
    }
}
