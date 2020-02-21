//pivot
public class QuickSort implements SortingAlgorithm{
    public void sort(int[] a) {
        int p = partition(a, 0, a.length-1);
        sort(a,0, p-1);
        sort(a, p+1, a.length-1);
    }
    public void sort(int a[], int start, int end){
        if (start < end){
            int p = partition(a, start, end);
            //sorts and swaps in orderly fashion
            sort(a, start, p-1);
            sort(a, p+1, end);
        }
    }
    public int partition(int a[], int start, int end){
        int index = a[end];
        int i = start-1; 
        //loop beginning to end
        for (int j=start; j<end; j++){
            if (a[j] <= index){
                //increment 
                i++;
                //swap
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        //swap but also increment
        int temp = a[i+1];
        a[i+1] = a[end];
        a[end] = temp;
        return i+1;
    }
}