import java.util.*;
public class Quiz2Redux{  

    public static ArrayList<String> combinations(String s){
	ArrayList<String> words = new ArrayList<String>();
	help( words, s, "", 0);
	Collections.sort(words);
	return words;
    }
    
    private static void help( ArrayList<String> words, String s, String passAlong, int index){ 
	if(index == s.length()){
	    words.add(passAlong);
	    return;
	}
	String passAlong2 = passAlong + s.charAt(index);
	help(words, s, passAlong, index + 1);
	help(words, s, passAlong2, index + 1);
    }
    private static String p(ArrayList<String> x){
	String ans = "{";
	for(String a : x){
	    ans += "\"" + a + "\" ";
	}
	return ans + "}";
    }
}
