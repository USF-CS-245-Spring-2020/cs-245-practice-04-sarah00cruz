//insertion sort is like sorting a deck of cards, simply comparing each element down the list

public class InsertionSort implements SortingAlgorithm{
	public void sort(int[] a){
		for(int i=1;i<a.length;i++){
			int temp = a[i];
			int j = i-1; //index of prev element
			while(j>=0&&a[j]>temp){
				a[j+1] = a[j];//neighbor vals switch
				j-=1; //decrements j to land on current j val
			}
			a[j+1]=temp;//i value is ahead
		}
	}
}