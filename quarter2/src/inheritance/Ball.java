package inheritance;

import java.awt.*;

public class Ball {

    private int x, y, size;
    private int vx, vy;

    public Ball(int x, int y, int vx, int vy) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        size = 25;
    }

    public void move(int width, int height){
        x += vx;
        y += vy;
        handleEdges(width, height);
    }

    public void handleEdges(int width, int height){
        if (x + size > width && vx > 0)
            vx *= - 1;
        if( x < 0 && vx < 0)
            vx *= -1;
        if(y + size > height && vy > 0)
            vy *= -1;
        else if(y < 0 && vy < 0)
            vy *= - 1;
    }

    public void draw(Graphics2D g2){
        g2.fillOval(x, y,size, size);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getVx() {
        return vx;
    }

    public void setVx(int vx) {
        this.vx = vx;
    }

    public int getVy() {
        return vy;
    }

    public void setVy(int vy) {
        this.vy = vy;
    }
}