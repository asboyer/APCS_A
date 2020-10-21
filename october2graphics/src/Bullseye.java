import java.awt.*;

public class Bullseye {
    private int x, y, d;

    public Bullseye(int x, int y, int d) {
        this.x = x;
        this.y = y;
        this.d = d;
    }

    public void draw(Graphics2D g2){
        g2.setColor(Color.red);



            g2.fillOval(x,y,d,d);
            g2.setColor(Color.white);
            g2.fillOval(x+d/10,y+d/10,d*4/5,d*4/5);

            g2.setColor(Color.red);
            g2.fillOval((x+d/5),(y+d/5),d*3/5,d*3/5);

            g2.setColor(Color.white);
            g2.fillOval((x+3*(d/10)),(y+3*(d/10)),d*2/5,d*2/5);

            g2.setColor(Color.red);
            g2.fillOval((x+4*(d/10)),(y+4*(d/10)),d*1/5,d*1/5);


  }

}
