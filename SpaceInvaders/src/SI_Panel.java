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
    private ArrayList<Laser> playerLasers;
    private boolean powerUp;
    private boolean og;
    private boolean wasOg;
    StringBuilder sb = new StringBuilder();
    private int playerLaserSpeed;
    private int baseSpeed;
    private int laserDelay, laserCounter; //delay -> frames between shots, counter counts frames

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

        playerLasers = new ArrayList<>();
        
        laserDelay = 30; //TODO: balance this?
        laserCounter = laserDelay;

        baseSpeed = -12;
        powerUp = false;
        og = true;
        wasOg = false;
        playerLaserSpeed = baseSpeed;

        setupKeyListener();
        timer = new Timer(1000/144, e->update());
        timer.start();
    }

    public void update(){
        laserCounter ++;
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

        for(int i = 0; i < playerLasers.size(); i++){
            Laser laser = playerLasers.get(i);
            laser.move();
            if(laser.getY() < -10){
                playerLasers.remove(i);
                i--;
            }
        }

        repaint();
    }

    public void setupKeyListener(){
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                sb.append(e.getKeyChar());
//                System.out.println(sb.toString());
                if(sb.toString().contains("baller")){ //if enter baller, turn on powerup, enter to clear command
                    powerUp = true;
                    if (og){
                        wasOg = true;
                    }
                    else{
                        og = true;
                    }
                    playerLaserSpeed = playerLaserSpeed * 2;
                }
                else if(sb.toString().contains("stop")){ //if stop, turn off power up
                    powerUp = false;
                    if(!wasOg)
                        og = false;
                    playerLaserSpeed = baseSpeed;
//                    System.out.println("done");
                }
                else if(sb.toString().contains("new")){
                    og = false;
                }
                else if(sb.toString().contains("og")){
                    og = true;
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                player.pressed(e.getKeyCode()); //notify player that key is down
                if(e.getKeyCode() == KeyEvent.VK_SPACE){
                    Laser laser = new Laser(player.getX() + player.getWidth()/2, player.getY(), playerLaserSpeed); //TODO: new speed?
                     //TODO: test this, add power up
                    if(powerUp)
                        playerLasers.add(laser);
                    else{
                        if(og) {
                            if (playerLasers.size() < 1)
                                playerLasers.add(laser);
                        }
                        else{
                            if(laserCounter >= laserDelay){
                                playerLasers.add(laser);
                                laserCounter = 0;
                            }
                        }
                    }
                }
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    sb = new StringBuilder();
                }
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

        for(Laser laser: playerLasers){
            laser.draw(g2);
        }

        player.draw(g2);

    }


}
