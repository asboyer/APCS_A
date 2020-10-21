import java.awt.*;

public class witchFace extends SmileyFace {

    public witchFace(int x, int y, int n){
        super(x,y,n);
    }

    public void draw(Graphics2D g2){
        super.draw(g2); //draws the normal smiley face that we inherited

        g2.drawLine(x,y,x+n,y);


        int[] xs = {x+n/5,x+n/2,x+x/5*4};
        int[] ys = {y, y - n/3, y};
        g2.fillPolygon(xs,ys,3);
    }

}
