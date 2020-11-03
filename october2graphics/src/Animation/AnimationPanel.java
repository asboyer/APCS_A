package Animation;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AnimationPanel extends JPanel {

    private int x, y;
    private Timer timer;
    private Ball theBall;

    public AnimationPanel(int width, int height) {
        setSize(width, height);
        theBall = new Ball(400,400,40,1,1);
        timer = new Timer(1000/144, e -> {
            theBall.move();
            repaint();
        } );
        timer.start();

    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        theBall.draw(g2);
    }
    }


