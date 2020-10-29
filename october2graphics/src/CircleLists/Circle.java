package CircleLists;

import java.awt.*;

public class Circle {

    /*
    Instance Fields:
        x and y, representing the top left corner of this Circle.
        radius - the radius of this circle
     */

    int x,y,r;
    //constructor that takes in (x, y, radius) and initializes them.

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }


    /*methods, commented out so no errors.  cmd /  to uncomment them when you are ready to code them.*/

    /*returns the x coordinate of the center of this circle.*/
    public int centerX(int x, int r){
        int centerX = x + r;
        return centerX;
    }

    /*returns the y coordinate of the center of this circle.*/
    public int centerY(int y, int r){
        int centerY = y + r;
        return centerY;
   }

    /*returns true if (px, py) is inside this Circle, false if (px, py) is not in this Circle.
    Mathematically, (px, py) is inside this circle if the distance from (px, py) to the center
    of this circle is less than the radius. */
    public boolean contains(int px, int py){
        double d = Math.sqrt(Math.pow(px - centerX(x,r),2) + Math.pow(py - centerY(y,r),2));
        boolean t = d < r;
        return t;
    }

    /*Fills an oval at (x, y) with width and height both equal to the radius*2. */
    public void draw(Graphics2D g2){
        g2.fillOval(x, y, r*2,r*2);
    }

}
