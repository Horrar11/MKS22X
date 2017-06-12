public class Merge{
    
    public static void mergeSort(int[] ary){
	if(ary.length <= 1) return;
	int cut = ary.length / 2;
	int[] left  = copy(ary, 0  , cut);
	int[] right = copy(ary, cut, ary.length);
	mergeSort(left);
	mergeSort(right);
	merge(ary, left, right);
    }

    private static int[] copy(int[] ary, int start, int end){
	int[] ans = new int[end - start]; 
	for(int i = 0; start + i < end; i ++){
	    ans[i] = ary[start + i];
	}
	return ans;
    }
    
    private static void merge(int[] target, int[] a, int[] b){
	int countA = 0;
	int countB = 0;
	for(int i = 0; i < target.length; i ++){
	    if(a[countA] <= b[countB]){
		target[i] = a[countA];
		countA ++;
	    }else{
		target[i] = b[countB];
		countB ++;
	    }

	    if (countA == a.length){
		i++;
		for(; countB < b.length; countB ++){
		    target[i] = b[countB];
		    i++;
		}
	    }
	    if (countB == b.length){
		i++;
		for(; countA < a.length; countA ++){
		    target[i] = a[countA];
		    i++;
		}
	    }
	}    
    }

}
