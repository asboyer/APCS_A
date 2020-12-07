package Arrays;

public class arrayHW {
    public static void main(String[] args) {
        int[][] grid = new int[5][5];
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                grid[i][j] = i *(j+1);
                System.out.println(grid[0][-1]);

            }
            ArrayUtil.printArray(grid[i]);
            for (int[] l:grid ) {
            }
        }

    }
}
