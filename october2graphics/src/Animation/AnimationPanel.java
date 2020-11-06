package Animation;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AnimationPanel extends JPanel {

    private int x, y;
    private Timer timer;
    private Ball theBall, newBall;

    public AnimationPanel(int width, int height) {
        setSize(width, height);



        // panel method: getWidth(), getHeight()
        timer = new Timer(1000/60, e -> {
            theBall.move(getWidth(),getHeight());

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


