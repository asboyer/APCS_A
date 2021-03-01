package inheritance;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main extends JPanel {

    private ArrayList<Ball> ballList;

    private Timer timer;

    public Main(int width, int height) {
        setBounds(0,0,width,height);

        ballList = new ArrayList<>();

        Ball aBall = new Ball(getWidth()/2, getHeight()/2, 2, -3);
        ballList.add(aBall);

        PacingBall pBall = new PacingBall(30,400,5,0,30);
        ballList.add(pBall);

        timer = new Timer(1000/60, e->update());
        timer.start();
    }

    public void update(){
        for(Ball b: ballList)
            b.move();

        repaint();
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for(Ball b: ballList)
            b.draw(g2);
    }

    public static void main(String[] args) {

        JFrame window = new JFrame("");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(0, 0, 800, 800 + 22); //(x, y, w, h) 22 due to title bar.

        Main panel = new Main(window.getWidth(), window.getHeight());

        panel.setFocusable(true);
        panel.grabFocus();

        window.add(panel);

        window.setVisible(true);
        window.setResizable(true);
    }
}
