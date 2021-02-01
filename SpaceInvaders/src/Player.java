import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;

public class Player {

    private int x, y, width, height;
    private boolean moveLeft, moveRight;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
        this.width = 30;
        this.height = 20;
        moveRight = false;
        moveLeft = false;
    }

    public void draw(Graphics2D g2){
        g2.fillRect(x, y, width, height);

    }

    public void move(int screenWidth){
        if(moveRight){
            if(x + width <= screenWidth)
                x += 5;
        }
        if(moveLeft) {
            if (x >= 0)
                x -= 5;
        }
        }


    public void pressed(int keyCode){
        if(keyCode == KeyEvent.VK_A)
            moveLeft = true;
        else if(keyCode == KeyEvent.VK_D)
            moveRight = true;
    }

    public void released(int keyCode){
        if(keyCode == KeyEvent.VK_A)
            moveLeft = false;
        else if(keyCode == KeyEvent.VK_D)
            moveRight = false;
    }
}
