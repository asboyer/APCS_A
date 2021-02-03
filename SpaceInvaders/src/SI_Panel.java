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
    private ArrayList<Laser> playerLasers, alienLasers;
    private boolean powerUp;
    private boolean og;
    private boolean wasOg;
    private double laserProbability;
    StringBuilder sb = new StringBuilder();
    private int playerLaserSpeed;
    private final int baseSpeed;
    private final int playerSpeed;
    private int x;
    private int y;
    private int z;
    private int times;
    private int laserDelay, laserCounter; //delay -> frames between shots, counter counts frames
    private int score, lives;

    public SI_Panel(int width, int height) {
        setBounds(0,0,width, height);
        aliens = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                aliens.add(new Alien(j*40, i*40, 20));
            }
        }
//        for(Alien alien: aliens){
//            System.out.println(alien.getY());
//        }
        playerSpeed = 5;
        alienVx = 2;
        player = new Player(getWidth()/2 - 15, getHeight() - 80, playerSpeed); //??
        x = 1;
        y = 1;
        z = 1;
        times = 1;
        playerLasers = new ArrayList<>();
        alienLasers = new ArrayList<>();
        laserDelay = 20; //TODO: balance this?
        laserCounter = laserDelay;
        laserProbability = 0.02;
        baseSpeed = -12;
        powerUp = false;
        og = true;
        wasOg = false;
        playerLaserSpeed = baseSpeed;
        lives = 3;
        score = 0;
        setupKeyListener();
        timer = new Timer(1000/100, e->update());
        timer.start();
    }

    public void update(){
    if(lives > 0){
        laserCounter ++;
        updateAliens();
        player.move(getWidth());
        updatePlayerLaser();
        updateAlienLaser();
        repaint();
        }
    else{
        while(z == 1){
            z ++;
            System.out.println("GAME OVER!");
            }
        }
    }

    public void updateAliens(){
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
        //aliens shooting laser beams...
        if(Math.random() < laserProbability){
            //pick a random alien, have that alien fire
            //make a laser at that aliens location
//            Alien shooter = aliens.get(10 + (int)((Math.random() * (30-10) + x)));
//            x ++;
//
//            aliens.remove(shooter);
            Alien shooter = aliens.get((int)(Math.random() * aliens.size()));
            Laser laser = new Laser(shooter.getX(), shooter.getY(), baseSpeed*-1 / 2);
            alienLasers.add(laser);
        }
    }

    public void updatePlayerLaser(){
        for(int i = 0; i < playerLasers.size(); i++){
            Laser laser = playerLasers.get(i);
            laser.move();
            if(laser.getY() < -10){
                playerLasers.remove(i);
                i--;
            }
        }

        //check for laser/alien collision
        for (int i = 0; i < playerLasers.size(); i++) {
            Laser laser = playerLasers.get(i);
            for (int j = 0; j < aliens.size(); j++){
                Alien alien = aliens.get(j);
                if(laser.getHitBox().intersects(alien.getHitBox())){
                    playerLasers.remove(i);
                    aliens.remove(j);
                    j = aliens.size();
                    i--;
                }
            }

        }
    }
    public void updateAlienLaser() {
        for (int i = 0; i < alienLasers.size(); i++) {
            Laser laser = alienLasers.get(i);
            laser.move();
            if (laser.getY() > getHeight() + 10) {
                alienLasers.remove(i);
                i--;
            }
        }

        for (int i = 0; i < alienLasers.size(); i++) {
            Laser laser = alienLasers.get(i);
            for (int j = 0; j < aliens.size(); j++){
                Alien alien = aliens.get(j);
                if(laser.getHitBox().intersects(player.getHitBox())){
                    alienLasers.remove(i);
                    lives --;
                    System.out.println("Lives: " + lives);
                    j = aliens.size();
                    i--;
                }
            }

        }
    }

    public void setupKeyListener(){
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                sb.append(e.getKeyChar());
//                System.out.println(sb.toString());
                if(sb.toString().contains("baller") && x == 1){ //if enter baller, turn on powerup, enter to clear command
                    System.out.println("Power up activated!");
                    x ++;
                    player.speed = playerSpeed * 2;
                    powerUp = true;
                    if (og){
                        wasOg = true;
                    }
                    else{
                        og = true;
                    }
//                    playerLaserSpeed = baseSpeed / 2;
                }
                else if(sb.toString().contains("life") && times == 1){
                    lives ++;
                    times ++;
                    System.out.println("Lives: " +  lives);
                }
                else if(sb.toString().contains("stop") && x == 2){ //if stop, turn off power up
                    System.out.println("Power up stopped!");
                    x --;
                    player.speed = playerSpeed;
                    powerUp = false;
                    if(!wasOg)
                        og = false;
                    playerLaserSpeed = baseSpeed;
//                    System.out.println("done");
                }
                else if(sb.toString().contains("new") && y == 1){
                    System.out.println("New mode activated");
                    og = false;
                    y ++;
                }
                else if(sb.toString().contains("og") && y == 2){
                    System.out.println("Reverted back to OG");
                    og = true;
                    y --;
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                player.pressed(e.getKeyCode()); //notify player that key is down
                if(e.getKeyCode() == KeyEvent.VK_SPACE){
                    Laser laser = new Laser(player.getX() + player.getWidth()/2, player.getY(), playerLaserSpeed); //TODO: new speed?
                     //TODO: test this, add power up
                    if(powerUp) {
                        playerLasers.add(laser);
                    }
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
                    times = 1;
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
        for(Laser laser: alienLasers)
            laser.draw(g2);

        player.draw(g2);

    }

}
