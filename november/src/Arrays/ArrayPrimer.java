package Arrays;

public class ArrayPrimer {

    //arrays                            arrayList
    //better syntax [ ]                 class, use methods to interact
    //locked size                       flexible - add, remove elements

    public static void main(String[] args) {
        int[] arr = new int[5]; // declare int[] var - arr; inits to a 5 element array, all 0s
        int[] nums = {5, 4, 3, 2, 1, 9}; //shortcut - static array initializer

        arr[2] = 20;
        System.out.println(arr); //memory address of the array
        //sumThree plusTwo Swapends

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i]; //access the value at i.....
        }
        System.out.println(sum);

        //THERE'S ANOTHER FOR LOOP
        //these loop over each value in a collection - arrays and array lists

        for(int num: nums){
            System.out.print(num + ", ");
        }

        // for each loops are great when you just want to access values
    }
}
