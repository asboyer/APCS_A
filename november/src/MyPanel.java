import javax.swing.*; // user interface stuff
import java.awt.*;//abstract window tool kit

public class MyPanel extends JPanel{

    private int count;


    public MyPanel(int width, int height) {
        setSize(width, height);
        count = 0;
    }
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        int count = 0;
        for(int i = 0; i < 100; i++){

            // random color
            int r = (int)(Math.random() * 255);
            int green = (int)(Math.random() * 255);
            int b = (int)(Math.random() * 255);
            Color c = new Color(r,green,b);
            // size: 10, 50
            int w = (int)(Math.random()*40+10);
            int h = (int)(Math.random()*40+10);
            int x = (int)(Math.random()*750+10);
            int y = (int)(Math.random() * 500);
            if (w == h){
                count++;
                c = (Color.BLACK);
                g2.fillRect(x, y, w*5, h*5);
            }
            g2.setColor(c);
            g2.fillRect(x,y,w,h);

        }
        System.out.println("\n" + count);


    }
}