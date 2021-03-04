import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class panel extends JPanel {

//    private final int unit_size = 25;
//    private final int game_units = (getWidth()*getHeight())/unit_size;
//    private final int delay = 75;
//    final int x[]

    private Timer timer;
    private ArrayList<Part> snake;
    private int speed;


    public panel(int width, int height) {
        setBounds(0,0,width, height);

        speed = 5;
        timer = new Timer(1000/1, e->update());
        timer.start();
//        part = new part(getWidth()/2, getHeight() - 200, 7);
        snake = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            snake.add(new Part(getWidth()/2 + (speed*i), getHeight() - 200, speed));

        }



        setupKeyListener();
    }

    public void update(){
//        part.move(getWidth(), getHeight());

        Part front = snake.get(snake.size()-1); //.move(getWidth(), getHeight());
        Part back = snake.remove(0);

        if(front.getDirection() == Part.UP) {
            Part newFront = new Part(front.getX(), front.getY() - front.getSpeed(), front.getSpeed());
            snake.add(newFront);
        }


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
                snake.get(snake.size()).pressed(e.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                snake.get(snake.size()).released(e.getKeyCode());
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for(Part part : snake){
            part.draw(g2);
        }
    }


}
