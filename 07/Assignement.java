import java.util.Arrays;
public class Assignement{
    public static int part(int[] data, int start, int end){
	int pivot = data[end];
	int pivotLoc = end;
	for(int i = 0; i < data.length; i++){
	    if(data[i] <= pivot){
		int block0 = data[i];
		int block1 = pivot;
		data[i] = block1;
		data[pivotLoc] = block0;		
		pivotLoc = i;
		System.out.println(Arrays.toString(data));
	    }
	}
	return pivotLoc;
    }
    public static void main(String[]args){
	int[]arrayBlock00 = {999,4,1,0,3,2,999,999,999};
	int[]arrayBlock01 = {9,4,1,0,3,2,8,9,7};
	int[]arrayBlock02 = {9,9,9,4,1,0,3,2,9,8,8};
	System.out.println(part(arrayBlock00, 0, arrayBlock00.length - 1));
	System.out.println(part(arrayBlock01, 0, arrayBlock01.length - 1));
	System.out.println(part(arrayBlock02, 0, arrayBlock02.length - 1));
	System.out.println(Arrays.toString(arrayBlock00));
	System.out.println(Arrays.toString(arrayBlock01));
	System.out.println(Arrays.toString(arrayBlock02));
    }
}
