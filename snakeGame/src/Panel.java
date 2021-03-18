import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Panel extends JPanel {

//    private final int unit_size = 25;
//    private final int game_units = (getWidth()*getHeight())/unit_size;
//    private final int delay = 75;
//    final int x[]
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int UP = 2;
    public static final int DOWN = 3;

    private Timer timer;
    private ArrayList<Part> snake;
    private int speed;
    private int score;
    private int highScore;
    StringBuilder sb;
    private int length;
    boolean eatenApple;
    boolean alive;
    boolean beatScore;
    boolean increasedScore;
    boolean appleMap;
    boolean lost;
    Apple apple;


    public Panel(int width, int height) {
        setBounds(0,0,width, height);
        setupKeyListener();

        speed = 5;
        timer = new Timer(1000/70, e->update());
        timer.start();
        length = 20;
//        part = new part(getWidth()/2, getHeight() - 200, 7);
        restart();

    }

    public void restart(){
        System.out.println("\n--- NEW GAME ---\n");
//        Sounds.theme.play();
        snake = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            snake.add(new Part(getWidth()/2 + (speed*i), getHeight() - 200, speed));
        }
        alive = true;
        eatenApple = false;
        increasedScore = true;
        appleMap = true;
        apple = applePlace();
        sb = new StringBuilder();
        score = 0;
        lost = false;
        beatScore = false;
    }

    public void addLength(ArrayList<Part> snake, Part back){
            Part newBack = new Part(back.getX(), back.getY(), back.getSpeed());
            snake.add(0, newBack);
    }

    public boolean eaten(Rectangle snake, Rectangle apple){
        if (snake.intersects(apple)){
            return true;
        }
        else{
            return false;
        }
    }

    public Apple applePlace(){

        int x = (int) (Math.random() * (getWidth() - 100) + 10);
        int y = (int) (Math.random() * (getHeight() - 100) + 10);

        return new Apple(x, y);

    }

    public void move(ArrayList<Part> snake, Part front){
        if(front.getDirection() == Part.UP) {
            Part newFront = new Part(front.getX(), front.getY() - front.getSpeed(), front.getSpeed());
            newFront.setDirection(UP);
            snake.add(newFront);
        }

        if(front.getDirection() == Part.RIGHT) {
            Part newFront = new Part(front.getX() + front.getSpeed(), front.getY(), front.getSpeed());
            newFront.setDirection(RIGHT);
            snake.add(newFront);
        }

        if(front.getDirection() == Part.LEFT) {
            Part newFront = new Part(front.getX() - front.getSpeed(), front.getY(), front.getSpeed());
            newFront.setDirection(LEFT);
            snake.add(newFront);
        }

        if(front.getDirection() == Part.DOWN) {
            Part newFront = new Part(front.getX(), front.getY() + front.getSpeed(), front.getSpeed());
            newFront.setDirection(DOWN);
            snake.add(newFront);
        }
    }

    public void increaseScore(){
            score ++;
    }


    public void lose(Part front){
        //     top                            right edge                           left edge
        if(front.getY() < 0 || front.getX() + front.getWidth() > getWidth() || front.getX() < 0 || front.getY() + front.getHeight() > getHeight()) {
            lost = true;
        }

        //need to figure out some kind of way to detect other body

        for (int i = 0; i < snake.size() - 15; i++) {
            if (front.getHitBox().intersects(snake.get(i).getHitBox())) {
                lost = true;
            }
        }
    }
    public void update(){

            Part front = snake.get(snake.size() - 1); //.move(getWidth(), getHeight());
            Part back = snake.remove(0);


            if (eaten(front.getHitBox(), apple.getHitBox())){
                appleMap = false;
                eatenApple = true;
                apple = applePlace();
                appleMap = true;
            }

            move(snake, front);

            if(eatenApple){
                increaseScore();
                if (score > highScore) {
                    highScore = score;
                    beatScore = true;
                }
             for (int i = 0; i < 3; i++) {

                    addLength(snake, back);
                    repaint();

//                    front = snake.get(snake.size() - 1);
                }
                eatenApple = false;
            }

            lose(front);

            if (alive) {
                repaint();
            }

    }

    public void setupKeyListener(){
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                sb.append(e.getKeyChar());

                snake.get(snake.size() - 1).typed(e.getKeyCode());
                if(sb.toString().contains("game")){
                    if(alive) {
                        System.out.println("You ended the game!");
                        if (beatScore)
                            System.out.println("NEW HIGH SCORE!");
                        System.out.println("Final score: " + score);
                    }
                    restart();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                snake.get(snake.size() - 1).pressed(e.getKeyCode());
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    sb = new StringBuilder();
//                    times = 1;

                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                snake.get(snake.size() - 1).released(e.getKeyCode());
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        setBackground(Color.BLACK);
        g2.setColor(Color.WHITE);
        g2.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        g2.drawString("High score: " + highScore, 7, 20);
        g2.drawString("Score: " + score, 7, 45);
        g2.setColor(Color.GREEN);
        for (Part part : snake) {
            part.draw(g2);
        }
        if (appleMap) {
            while(apple.getX() < 50 && apple.getY() < 20) {
                apple = applePlace();
            }
            for (int i = 0; i < snake.size() - 15; i++) {
                if (snake.get(i).getHitBox().intersects(apple.getHitBox())) {
                    apple = applePlace();
                } else {
                    apple.draw(g2);
                }
            }
        }

        if(score == 50){
            g2.setColor(Color.white);
            g2.drawString("\"Get to one hundred!\"", getWidth()/2 - 150, getHeight()/2);

        }


        if(score == 100){
            g2.setColor(Color.white);
            g2.drawString("\"Congrats on one hundred!\"", getWidth()/2 - 150, getHeight()/2);
            g2.drawString("- Andrew Boyer", getWidth()/2 - 75, getHeight()/2 + 30);
        }
        if(lost) {
            g2.setFont(new Font("TimesRoman", Font.PLAIN, 50));
            g2.drawString("GAME OVER", getWidth()/2 - 150, getHeight()/2);

            g2.setColor(Color.white);
            g2.setFont(new Font("TimesRoman", Font.PLAIN, 10));
            g2.drawString("type \"game\" to start a new game", getWidth()/2 - 75, getHeight()/2 + 30);
            System.out.println("Game Over!");
            if (beatScore)
                System.out.println("NEW HIGH SCORE!");
            System.out.println("Final score: " + score);
            alive = false;

        }

    }


}
