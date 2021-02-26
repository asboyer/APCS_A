import java.awt.*;
import java.awt.event.KeyEvent;

public class head {

    private int x, y, w, h, speed;
    private boolean moveRight, moveLeft, moveDown, moveUp;
    private final int LEFT = 0;
    private final int RIGHT = 1;
    private final int UP = 2;
    private final int DOWN = 3;

    public head(int x, int y, int speed){
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.w = 30;
        this.h = 30;
        moveRight = false;
        moveLeft = false;
        moveDown = false;
        moveUp = false;

    }

    public void draw(Graphics2D g2){
        g2.fillRect(x, y, w, h);
    }

    public void move(int screenHeight, int screenWidth){
        if(moveRight){
            if(x + w <= screenWidth)
                x += speed;
        }
        if(moveLeft) {
            if (x >= 0)
                x -= speed;
        }
        if(moveUp){
            if(y >= 0)
                y -= speed;
        }
        if(moveDown) {
            if (y + h <= screenHeight)
                y += speed;
        }
    }


    public void pressed(int keyCode){
        if(keyCode == KeyEvent.VK_A)
            moveLeft = true;
        else if(keyCode == KeyEvent.VK_D)
            moveRight = true;
        else if(keyCode == KeyEvent.VK_S)
            moveDown = true;
        else if(keyCode == KeyEvent.VK_W)
            moveUp = true;
    }

    public void released(int keyCode){
        if(keyCode == KeyEvent.VK_A)
            moveLeft = false;
        else if(keyCode == KeyEvent.VK_D)
            moveRight = false;
        else if(keyCode == KeyEvent.VK_S)
            moveDown = false;
        else if(keyCode == KeyEvent.VK_W)
            moveUp = false;
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

}
