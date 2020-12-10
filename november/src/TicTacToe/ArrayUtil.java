package TicTacToe;

public class ArrayUtil {

    public static void printArray(int[] arr){
        String out = "{";
        for(int a: arr){
            out += a;
            out += ", ";
        }
        out = out.substring(0, out.length() -2);
        out += "}";
        System.out.println(out);
    }

    public static int getMaxIndex(int[] arr){
        int maxInd = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > arr[maxInd]){
                maxInd = i;
            }
        }
        return maxInd;
    }
    public static int getMinIndex(int[] arr){
        int minInd = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < arr[minInd]){
                minInd = i;
            }
        }
        return minInd;
    }

    public static int[] getRandomArray(int length, int min, int max){
        // returns an array of random ints
        // take in length
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (max-min+1) + min);
        }
        return arr;
    }
}
