import java.awt.*;

public class SmileyFace {

    protected int x,y,n;

    public SmileyFace(int x, int y, int n) {
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public void draw(Graphics2D g2){

        g2.setColor(new Color (241, 233, 11)); // you can make an object not saved to a var in line
        g2.fillOval(x,y,n,n);

        g2.setColor(Color.BLACK);
        g2.fillOval(x+(n/5),y+(n/5),n/5,n/5);
        g2.fillOval(x+3*(n/5),y+(n/5),n/5,n/5);

        g2.fillArc(x+(n/5),y+(n/5),3*(n/5),3*(n/5),180,180);


    }
}
