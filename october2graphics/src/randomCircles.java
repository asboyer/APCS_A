import java.awt.*;

public class randomCircles {

    private int numCircles, size;
    private Color color1, color2;


    public randomCircles(int numCircles, int size, Color color1, Color color2) {
        this.numCircles = numCircles;
        this.size = size;
        this.color1 = color1;
        this.color2 = color2;
    }

    public void draw(Graphics2D g2){
        for (int i = 0; i < numCircles; i++) {
            int x = (int) (Math.random() * (800-size));
            System.out.println(x);
            int y = (int) (Math.random() * (800-size));
            System.out.println(y);
            if (y < 400-size){
                g2.setColor(color1);
            }
            else{
                g2.setColor(color2);
            }
            if (x < 400-size){
                g2.drawOval(x,y,size,size);
            }
            else{
                g2.fillOval(x,y,size,size);
            }



        }
    }

}
