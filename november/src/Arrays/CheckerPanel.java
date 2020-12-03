package Arrays;


import javax.swing.*;
import java.awt.*;

public class CheckerPanel extends JPanel {

    private int[][] board;

    public CheckerPanel(int width, int height) {
        setSize(width, height);

        board = new int[8][8];
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if ((r + c ) % 2 == 1)
                    board[r][c] = 1;
//                if (r % 2 == 0) {
//                    if (c % 2 == 1)
//                        board[r][c] = 1;}
//                else {
//                    if (c % 2 == 0)
//                        board[r][c] = 1;}
            }
        }
        for(int[] i: board){
            ArrayUtil.printArray(i);
        }
        setupMouse();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        int size = 100;
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (board[r][c] == 1)
                    g2.setColor(Color.BLACK);
                else
                    g2.setColor(Color.white);
                g2.fillRect( c * size, r * size, size, size);
            }
        }

    }

}