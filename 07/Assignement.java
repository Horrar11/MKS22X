public class Assignement{
    public static int part(int[] data, int start, int end){
	int pivot = data[end];
	for(int i = 0; i < data.length; i ++){
	    if(data[i] >= pivot){
		int block0 = data[i];
		int block1 = pivot;
		data[i] = block1;
		data[] = block0;
	    }
	}
	return end;
    }
    public static void main(String[]args){
	int[]arrayBlock00 = {999,999,999,4,1,0,3,2,999,999,999};
	part(arrayBlock00, 0, arrayBlock00.length - 1);
	System.out.println(arrayBlock00);
    }
}
