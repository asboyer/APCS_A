package InsertionSort;

public class InsertionSort {
    /*
    5 3 1 7 2 -> 3 5 1 7 2
    3 1 5 7 2 -> 1 3 5 7 2
    1 3 5 7   2
    1 3 5 2 7 -> 1 3 2 5 7 -> 1 2 3 5 7 ;DONE;
     */

    // outer for loop that "grows the sorted portion"
    // inner while loop that swaps the newest number down

    /*
    A note on efficiency:

    Insertion sort is amazing when... the array is sorted (nearly sorted)
    BigO -> order of efficiency for n elements
    BigO  -> n (linear) ex 100 elements - 100 comparisons
        double n -> double comparisons


    Insertion sort is pretty bad when... sorted backwards ... really bad
    4 3 2 1 3 req 1, 2 req 2, 1 req 3 + .. + (n-1) = n^2/2
        double n -> *4 comparisons

     Typical case is still n^2. Still bad
     */


    public void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int j = i - 1;
            int k = i;
            while(j >= 0 && arr[k] < arr[j]){

                // swap elements at j and k
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                k--;
                j = k - 1;
            }
        }
    }
}
