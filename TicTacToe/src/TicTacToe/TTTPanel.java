package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TTTPanel extends JPanel {

    //TODO: 3. Declare a Board instance field.
    private Board b;
    private int w;

    public TTTPanel(int width, int height) {
        setSize(width, height);

        //TODO: 4. Initialize your Board instance field.
        b = new Board(200);
        w = 0;
        setupMouse();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        //TODO: 5. Tell your board to draw itself.  Run, test, fix, repeat.
        b.drawBoard(g2);

    }

    public void setupMouse(){
        addMouseListener(new MouseListener() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                int row = y / (b.getSize());
                int col = x / (b.getSize());

                //TODO: 7.  ^^^Uncomment that^^^. Tell your board to takeTurn at row, col.
                //          Run, test, fix, repeat.

                b.takeTurn(row, col);


                if (w == 0)
                    repaint();

                w = b.checkForWinner();


                if (w == 1)
                    System.out.println("O's win!");
                if (w == -1)
                    System.out.println("X's win!");

            }
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });
    }

}