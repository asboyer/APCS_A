import javax.swing.*;
import java.awt.*;

public class BoyerMystery{

    private Point pointA, pointB, pointC;

    public BoyerMystery(int xA, int yA, int xB, int yB, int xC, int yC){

        pointA = new Point(xA, yA);
        pointB = new Point(xB, yB);
        pointC = new Point(xC, yC);

    }

    public void draw(Graphics2D g2) {

      int currentX = 400;
      int currentY = 400;

        for (int i = 0; i < 100000; i++) {



            int rand = (int) (Math.random() * 3) + 1;

            if (rand == 1) {
                g2.setColor(Color.blue);
                currentX = (currentX + pointA.x) / 2;
                currentY = (currentY + pointA.y) / 2;
            }
            else if (rand == 2) {
                g2.setColor(Color.pink);
                currentX = (currentX + pointB.x) / 2;
                currentY = (currentY + pointB.y) / 2;

            }
            else {
                g2.setColor(Color.green);
                currentX = (currentX + pointC.x) / 2;
                currentY = (currentY + pointC.y) / 2;
            }

            g2.drawLine(currentX, currentY, currentX + 1, currentY + 1);


        }


    }


}
