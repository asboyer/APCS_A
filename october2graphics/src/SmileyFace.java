import java.awt.*;

public class SmileyFace {

    private int x,y,n;

    public SmileyFace(int x, int y, int n) {
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public void draw(Graphics2D g2){

        g2.setColor(new Color (241, 233, 11)); // you can make an object not saved to a var in line
        g2.fillOval(x,y,n,n);

        g2.setColor(Color.BLACK);
        g2.fillOval(x+20,y+20,n/5,n/5);
        g2.fillOval(x+60,y+20,n/5,n/5);

        g2.fillArc(x+20,y+20,n/2+n/10,n/2+n/10,180,180);


    }
}
