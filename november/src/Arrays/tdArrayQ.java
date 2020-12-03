package Arrays;

public class tdArrayQ {
    public static void main(String[] args) {

        //1. Declare a 4x4 2D array of integers
        //Using loops, make the contents of the array...
        // 0 0 0 0
        // 1 1 1 1
        // 2 2 2 2
        // 3 3 3 3

        int[][] mat = new int[4][4];
        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat[0].length; c++) {
                mat[r][c] = r;
            }
        }

        //print array to test
        System.out.println("#1:");
        for(int[] i: mat){
            ArrayUtil.printArray(i);
        }
        System.out.println();

        //2. Change the contents:
        // 4 1 2 3
        // 0 4 2 3
        // 0 1 4 3
        // 0 1 2 4
        int[][] g = new int[4][4];
        for (int r = 0; r < g.length; r++) {
            for (int c = 0; c < g[0].length; c++) {
                g[r][c] = c;
                if (r - c == 0){
                    g[r][c] = 4;
                }
            }
        }
        System.out.println("#2:");
        for(int[] i: g){
            ArrayUtil.printArray(i);
        }
        System.out.println();

        //3. Print the sum of each row.
        //10
        //9
        //8
        //7
        System.out.println("#3:");
        int sum = 0;
        for (int r = 0; r < g.length; r++) {
            sum = 0;
            for (int c = 0; c < g[0].length; c++) {
                sum += g[r][c];
            }
            System.out.println(sum);
        }
        System.out.println();
    }
}
