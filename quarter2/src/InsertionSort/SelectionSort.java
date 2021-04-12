package InsertionSort;

public class SelectionSort {
    public void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int mindex = findMin(i, arr);
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
        }
    }

    public int findMin(int from, int[] arr){
        int mindex = 
    }
}
