import java.lang.Math;
public class Recursion{ 
    public static String name(){return "Kurkin,Anthony";}
    public static double sqrt(double n){
	if(n == 0.0){return 0.0;}
	else if(n <= 0){
	    throw new IllegalArgumentException("One cannot simply give this type of value for this method...");
	}
	else{
	    return sqrtHelp(n,1);
	}
    } 
    public static double sqrtHelp(double number, double guess){
	double better = (number/guess + guess)/2;
	if((Math.abs(guess - better)/better) < .0000000000001){
	    return better;
	}
	else{
	    return sqrtHelp(number,better);
	}
    }
}
