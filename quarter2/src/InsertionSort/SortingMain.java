package InsertionSort;

public class SortingMain {
    public static void main(String[] args) {
        int[] test = {5, 1, 9, -1, 0, 3, 7};
        InsertionSort insertionSorter = new InsertionSort();
        insertionSorter.sort(test);
        for(int a: test)
            System.out.print(a + " ");
        System.out.println();
    }
}
