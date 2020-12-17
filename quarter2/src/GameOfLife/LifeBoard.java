package GameOfLife;

import java.awt.*;

public class LifeBoard {

    private Cell[][] board;
    public static final int ROWS=40, COLS=40, SIZE=20;

    public LifeBoard() {

    }

    public void draw(Graphics2D g2){
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[0].length; c++) {

            }
        }
    }

    //returns how many of the 8 cells around [row][col] are alive
    public int numNeighbors(int row, int col){
        int count = 0;

        return count;
    }

    //returns true if [r][c] is a legal index in board, false if not.
    public boolean isValidCell(int r, int c){
        return (r >= 0 && r < board.length && c >= 0 && r < board[0].length);
    }

    /*applies the rules of Life to determine the next board state.
    1. Any live cell with two or three live neighbours survives.
    2. Any dead cell with three live neighbours becomes a live cell.
    3. All other live cells die in the next generation.
        Similarly, all other dead cells stay dead.  */
    public void nextGen(){
        Cell[][] nextBoard = new Cell[board.length][board[0].length];

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                int n = numNeighbors(r, c);

                if(board[r][c].isAlive()){

                }else{

                }
            }
        }
        board = nextBoard;
    }

    //turns a living cell off, and a dead cell on.
    public void toggleCell(int r, int c){
        board[r][c].setAlive(!board[r][c].isAlive());
    }


}
