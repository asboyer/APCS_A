import java.awt.*;

public class Square {

    private boolean isMine, isRevealed;
    private int neighborMines;
    private int row, col;
    private Square[][] board;

    public Square(boolean isMine, int row, int col, Square[][] board) {
        this.isMine = isMine;
        this.row = row;
        this.col = col;
        this.isRevealed = false;
        this.board = board;
    }

    public void calcNeighborMines(){

        int count = 0;

        if(row == 0 && col == 0){
            for (int r = row; r <= row+1; r++) {
                for (int c = col; c <= col+1; c++) {
                    if (board[r][c].isMine()){
                        count++;
                    }
                }
            }
        }

        else if(row == 0 && col == board[0].length - 1){
            for (int r = row; r <= row+1; r++) {
                for (int c = col-1; c <= col; c++) {
                    if (board[r][c].isMine()){
                        count++;
                    }
                }
            }
        }

        else if(row == 0){
            for (int r = row; r <= row+1; r++) {
                for (int c = col-1; c <= col+1; c++) {
                    if (board[r][c].isMine()){
                        count++;
                    }
                }
            }
        }

        else if(col == 0 && row == board.length - 1){
            for (int r = row-1; r <= row; r++) {
                for (int c = col; c <= col+1; c++) {
                    if (board[r][c].isMine()){
                        count++;
                    }
                }
            }
        }

        else if(col == 0){
            for (int r = row-1; r <= row+1; r++) {
                for (int c = col; c <= col+1; c++) {
                    if (board[r][c].isMine()){
                        count++;
                    }
                }
            }
        }
        else if(row == board.length - 1 || col == board[0].length - 1){
            for (int r = row-1; r <= row; r++) {
                for (int c = col-1; c <= col; c++) {
                    if (board[r][c].isMine()){
                        count++;
                    }
                }
            }
        }

        else if(col == board[0].length - 1){
            for (int r = row-1; r <= row+1; r++) {
                for (int c = col-1; c <= col; c++) {
                    if (board[r][c].isMine()){
                        count++;
                    }
                }
            }
        }

        else if(row == board.length -1){
            for (int r = row-1; r <= row; r++) {
                for (int c = col-1; c <= col+1; c++) {
                    if (board[r][c].isMine()){
                        count++;
                    }
                }
            }
        }

        else {
            for (int r = row-1; r <= row+1; r++) {
                for (int c = col-1; c <= col+1; c++) {
                    if (board[r][c].isMine()){
                        count++;
                    }
                }
            }
        }

        if(board[row][col].isMine())
            count = -1;

        neighborMines = count;



    }

    public void draw(Graphics2D g2){
        int size = MineSweeper.SIZE;
        if (isRevealed) {
            if(isMine) {
                g2.setColor(Color.RED);
            }else{
                g2.setColor(Color.BLACK);
            }
            g2.fillRect(col * size, row * size, size, size);
        }else{
            g2.setColor(Color.GRAY);
            g2.fillRect(col * size, row * size, size, size);
        }
        g2.setColor(Color.BLACK);
        g2.drawRect(col * size, row * size, size, size);

    }

    public void click(){
        System.out.println(neighborMines);
        isRevealed = true;
    }

    public boolean isMine(){
        return isMine;
    }

}