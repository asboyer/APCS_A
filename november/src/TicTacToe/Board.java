package TicTacToe;

import java.awt.*;
import java.sql.SQLOutput;

public class Board {

    private int[][] board;
    private int moveCount, size;

    //these are constants to be used in the board.
    public static final int X=-1, O=1;

    /*TODO: 1. initialize the instance fields.
                board should be a 3x3 int 2D array, all 0's.
                moveCount should be 0.
                size...maybe 50?*/

    public Board(int size) {
        board = new int[3][3];
        moveCount = 0;
        this.size = size;
    }

    /*TODO: 2. Complete the drawBoard method.
            Visit each element in the board and draw
            a rectangle that is size by size at
            (size*col, size*row)
            If there is an X in the board, draw an X.
            If there is an 0 in the board, draw an 0.
    */
    public void drawBoard(Graphics2D g2){
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                g2.setStroke(new BasicStroke(1));
                g2.drawRect(c*size,r*size,size,size);
                g2.setStroke(new BasicStroke(5));
                if (board[r][c] == X){
                    g2.drawLine(c * size, r * size, c * size + size, r * size + size);
                    g2.drawLine(c * size, r * size+size, c *size +size, r*size);
                }
                if (board[r][c] == O)
                    g2.drawOval(c*size,r*size,size,size);
            }
        }


    }

    /*TODO: 7. Put an X or an O in the board at row, col.
               Use moveCount to figure out whose turn it is.
               increase moveCount by 1 after you make the move.
               Run, test, fix, repeat.
               Does your program allow players to overwrite
               existing marks?  Can you prevent that?
     */
    public void takeTurn(int row, int col){
        if (board[row][col] == 0) {
            if (moveCount % 2 == 0)
                board[row][col] = X;
            else
                board[row][col] = O;
            moveCount++;
        }
    }

    //returns the winner, or 0 if no winner yet. Tie?
    public int checkForWinner(){
        int w = 0;
        for (int r = 0; r < board.length; r++) {
            if (board[r][0] == board[r][1] && board[r][0] == board[r][2]){
                if (board[r][0] == 1) {
                    w = 1;
                    break;
                }
                if (board[r][0] == -1){
                    w = -1;
                    break;
                }
                }
            }
        for (int c = 0; c < board[0].length; c++) {
            if (board[0][c] == board[1][c] && board[0][c] == board[2][c]){
                if (board[0][c] == 1) {
                    w = 1;
                    break;
                }
                if (board[0][c] == -1){
                    w = -1;
                    break;
                }
            }
        }
        if (w == 0){
            if (board[0][0] == board[1][1] && board[0][0] == board[2][2]){
                if (board[0][0] == 1)
                    w = 1;
                if (board[0][0] == -1)
                    w = -1;
            }
            if (board[0][2] == board[1][1] && board[0][2] == board[2][0]){
                if (board[0][2] == 1)
                    w = 1;
                if (board[0][2] == -1)
                    w = -1;
            }
        }
        return w;
    }

    public int getSize() {
        return size;
    }
}