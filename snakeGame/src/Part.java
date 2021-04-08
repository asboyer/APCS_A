import java.awt.*;
import java.awt.event.KeyEvent;

public class Part {

    private int x, y, w, h, speed;
    private boolean moveRight, moveLeft, moveDown, moveUp;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int UP = 2;
    public static final int DOWN = 3;
    private int direction;

    public Part(int x, int y, int speed){
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.w = 30;
        this.h = 30;
        moveRight = false;
        moveLeft = false;
        moveDown = false;
        moveUp = false;
        direction = UP;

    }
    public void draw(Graphics2D g2){
        g2.fillRect(x, y, w, h);
    }

    public void pressed(int keyCode){
        if(keyCode == KeyEvent.VK_A && direction != RIGHT)
            direction = LEFT;
        else if(keyCode == KeyEvent.VK_D && direction != LEFT)
            direction = RIGHT;
        else if(keyCode == KeyEvent.VK_S && direction != UP)
            direction = DOWN;
        else if(keyCode == KeyEvent.VK_W && direction != DOWN)
            direction = UP;
    }

    public void released(int keyCode){

    }

    public void typed(int keyCode){

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return w;
    }

    public int getHeight() {
        return h;
    }

    public Rectangle getHitBox(){
        return new Rectangle(x, y , w, h);
    }

    public int getDirection() {
        return direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
}
