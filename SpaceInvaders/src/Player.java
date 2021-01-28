import java.awt.*;
import java.util.*;

public class Player {

    private int x, y, width, height;

    public Player(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = 30;
        this.height = 20;
    }

    public void draw(Graphics2D g2){
        g2.fillRect(x, y, width, height);

    }

//    public void move
}
