import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class SI_Panel extends JPanel {

    private Timer timer;
    private ArrayList<Alien> aliens;
    private int alienVx;
    private Player player;


    public SI_Panel(int width, int height) {
        setBounds(0,0,width, height);
        aliens = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                aliens.add(new Alien(j*40, i*40, 20));
            }
        }
        alienVx = 2;
        player = new Player(getWidth()/2 - 15, getHeight() - 80); //??
        setupKeyListener();
        timer = new Timer(1000/144, e->update());
        timer.start();
    }

    public void update(){
        boolean hitEdge = false;
        for(Alien alien: aliens){
            alien.move(alienVx);

            if(alien.getX() + alien.getSize() >= getWidth())
                hitEdge = true;
            else if(alien.getX() <= 0)
                hitEdge = true;
        }
        if(hitEdge){
            alienVx *= -1;
            for(Alien alien: aliens){
                alien.shiftDown();
            }
        }
        player.move(getWidth());
        repaint();
    }

    public void setupKeyListener(){
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                player.pressed(e.getKeyCode()); //notify player that key is down
            }

            @Override
            public void keyReleased(KeyEvent e) {
                player.released(e.getKeyCode()); //notify player that key is down
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for(Alien alien: aliens){
            alien.draw(g2);
        }

        player.draw(g2);

    }


}
