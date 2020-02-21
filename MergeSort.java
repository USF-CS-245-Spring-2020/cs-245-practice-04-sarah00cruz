//splitting an array to ind elements
//merging altogether in order
import java.util.*;
public class MergeSort implements SortingAlgorithm {
    public void sort(int[]a) {
        if (a.length > 1) { //base case
            int[] left = left(a);
            int[] right = right(a);
            sort(left);
            sort(right);
            merge(a, left, right);
        }
    }
    //creating left array
    public static int[] left(int[] arr) {
        int size = arr.length / 2;
        int[] left = new int[size];
        for (int i = 0; i < size; i++) {
            left[i] = arr[i];
        }
        return left;
    }
    //create right array
    public static int[] right(int[] arr) {
        int size1 = arr.length / 2;
        int size2 = arr.length - size1;
        int[] right = new int[size2];
        for (int i = 0; i < size2; i++) {
            right[i] = arr[i + size1];
        }
        return right;
    }
    public void merge(int[] target, int[] left, int[] right) {
        //initialize indexes
        int indexL = 0, indexR=0, indexTarget = 0;
        //merging sorted lists   
        while(indexL<left.length&&indexR<right.length){
			if(left[indexL]<=right[indexR])
				target[indexTarget++]=left[indexL++];
			else
				target[indexTarget++]=right[indexR++];
		}
		while(indexL<left.length)
			target[indexTarget++]=left[indexL++];
		while(indexR<right.length)
			target[indexTarget++]=right[indexR++];
    }
}