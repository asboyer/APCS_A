import javax.swing.*;
import java.awt.*;

public class BoyerMystery {

    private Point pointA, pointB, pointC;

    public BoyerMystery(int xA, int yA, int xB, int yB, int xC, int yC){

        pointA = new Point(xA, yA);
        pointB = new Point(xB, yB);
        pointC = new Point(xC, yC);

    }

    public void draw(Graphics2D g2) {
        int currentX = 400;
        int currentY = 400;

        Point current = new Point(currentX, currentY);

        Point selected;

        int rand = (int) (Math.random() * 3) + 1;

        if (rand == 1)
            selected = pointA;
        if (rand == 2)
            selected = pointB;
        if (rand == 3)
            selected = pointC;



    }


}
