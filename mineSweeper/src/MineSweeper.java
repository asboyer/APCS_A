import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// Andrew Boyer

public class MineSweeper extends JPanel {
    private Square[][] board;

    public static final int SIZE = 30;
    private int numMines = 30;

    public MineSweeper(int width, int height) {
        setSize(width, height);

        board = new Square[15][15];

        for(int i = 0; i <numMines; i++){
            int row = (int)(Math.random() * 15);
            int col = (int)(Math.random() * 15);
            if(board[row][col] == null){
                board[row][col] = new Square(true, row, col, board);
            }
            else{
                i--;
            }
        }
        for(int r = 0; r < board.length; r ++){
            for(int c = 0; c < board[0].length; c++){
                if(board[r][c] == null){
                    board[r][c] = new Square(false, r, c, board);
                }
            }
        }

        //Here is a good spot to calc each Square's neighborMines (after all squares are initialized)
        //Maybe write a method in Square that finds how many
        //mines are around it, and call that method on each Square here.


        setupMouseListener();
    }


    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        for (int r = 0; r < board.length; r++)
            for (int c = 0; c < board[0].length; c++) {
                board[r][c].draw(g2);
            }
    }

    public void setupMouseListener(){
        addMouseListener(new MouseListener() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                int r = y / SIZE;
                int c = x / SIZE;

                board[r][c].click();

                repaint();
            }

            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    //sets ups the panel and frame.  Probably not much to modify here.
    public static void main(String[] args) {
        JFrame window = new JFrame("Minesweeper");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(0, 0, 600, 600 + 22); //(x, y, w, h) 22 due to title bar.

        MineSweeper panel = new MineSweeper(600, 600);

        panel.setFocusable(true);
        panel.grabFocus();

        window.add(panel);
        window.setVisible(true);
        window.setResizable(false);
    }

}