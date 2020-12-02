package Arrays;

public class TwoArray {

    public static void main(String[] args) {
        //What are 2D arrays?
        int[][] grid = {{1,2,3}, //array 0
                        {1,2,3}}; //array 1

        System.out.println(grid[0][1]); // row 0 col 1

        int[][] mat = new int[3][2];
//           {{0, 0},
//            {0, 0},
//            {0, 0}}
        // how do we access the elements in a 2D array?
        for (int r = 0; r < mat.length; r++) { //mat.length -> numRows
            for (int c = 0; c < mat[r].length; c++) {
                mat[r][c] = r * (c + 1);
            }
        }
        for(int[] row: mat){
            ArrayUtil.printArray(row);
        }

        //When should we use 2D arrays?
        //TicTacToe Chess checkers
        //Gameboy pokemon games -> map tiles 2D array!

    }

}
