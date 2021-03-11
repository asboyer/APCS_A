package inheritance;

import java.awt.*;
import java.util.ArrayList;

public class TrailBall extends Ball{

    private ArrayList<Ball> trail;
    private int maxLength;

    public TrailBall(int x, int y, int vx, int vy, int maxLength) {
        super(x, y, vx, vy);
        this.maxLength = maxLength;
        trail = new ArrayList<>();
    }

    @Override
    public void move(int width, int height) {
        Ball addedBall = new Ball(getX(), getY(), 0, 0);
        trail.add(addedBall);

        if(trail.size() > maxLength){
            trail.remove(0);
        }

        super.move(width, height);
    }

    @Override
    public void draw(Graphics2D g2) {
        super.draw(g2);
        for(Ball t: trail){
            t.draw(g2);
        }
    }

}
