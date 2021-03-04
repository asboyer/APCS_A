import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class panel extends JPanel {

    private final int unit_size = 25;
    private final int game_units = (getWidth()*getHeight())/unit_size;
    private final int delay = 75;
//    final int x[]

    private Timer timer;
    private ArrayList<body> body;
    private head head;


    public panel(int width, int height) {
        setBounds(0,0,width, height);


        timer = new Timer(1000/60, e->update());
        timer.start();
        head = new head(getWidth()/2, getHeight() - 200, 7);
        setupKeyListener();
    }

    public void update(){
        head.move(getWidth(), getHeight());
        repaint();
    }

    public void setupKeyListener(){
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                head.pressed(e.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                head.released(e.getKeyCode());
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        head.draw(g2);
    }


}
