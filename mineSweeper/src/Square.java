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

        for (int r = row-1; r <= row+1; r++) {
            for (int c = col-1; c <= col+1; c++) {
                if (board[r][c].isMine()){
                    count++;
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
        isRevealed = true;
    }

    public boolean isMine(){
        return isMine;
    }

}