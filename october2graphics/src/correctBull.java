import java.awt.*;

public class correctBull {

    private int x, y, size;

    public correctBull(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public void draw(Graphics2D g2, int numRings){
        int change = size/(2*numRings);

        for (int i = 0; i < numRings; i++) {
            if (i%2==0){
                g2.setColor(Color.red);
            }
            else{
                g2.setColor(Color.white);
            }
            g2.fillOval(x+i*change,y+i*change,size-change*2*i,size-change*2*i);
        }

//        // outer ring: i = 0
//            //(x,y) is the corner
//        g2.setColor(Color.red);
//        g2.fillOval(x,y,size,size);
//
//        //2nd i = 1
//        g2.setColor(Color.white);
//        g2.fillOval(x+change, y + change, size-change*2, size-change*2);
//
//        //3rd ring 1 = 2
//        g2.setColor(Color.red);
//        g2.fillOval(x+change*2, y + change*2, size-change*4, size-change*4);
//
//        //4th ring
//        g2.setColor(Color.white);
//        g2.fillOval(x+change*3, y + change*3, size-change*6, size-change*6);
//
//        //5th ring
//        g2.setColor(Color.red);
//        g2.fillOval(x+change*4, y + change*4, size-change*8, size-change*8);
    }

    //overloaded method:
    public void draw(Graphics2D g2) {
        int change = size / (10);

        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                g2.setColor(Color.red);
            } else {
                g2.setColor(Color.white);
            }
            g2.fillOval(x + i * change, y + i * change, size - change * 2 * i, size - change * 2 * i);
        }
    }
}
