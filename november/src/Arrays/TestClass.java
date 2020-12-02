package Arrays;

public class TestClass {
    public static void main(String[] args) {
        int[] nums = new int[5];
        ArrayUtil.printArray(nums);
        nums[3] = 50;
        ArrayUtil.printArray(nums);
        int a = ArrayUtil.getMaxIndex(nums);
        System.out.println(a);
        int b = ArrayUtil.getMinIndex(nums);
        System.out.println(b);
        int[] arr = ArrayUtil.getRandomArray(3, 99, 100);
        ArrayUtil.printArray(arr);
    }
}
