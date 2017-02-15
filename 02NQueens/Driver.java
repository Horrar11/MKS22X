public class Driver{
    public static void main(String[]a){
	QueenBoard b = new QueenBoard(5);
	System.out.println(b.getSolutionCount());
	System.out.println(b);
	b.solve();
	System.out.println(b);
	System.out.println(b.getSolutionCount());
    }
}
