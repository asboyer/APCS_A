import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {

    int maxLoops = 420;


    public Main(int w, int h){
        setSize(w, h);


    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;

        double da = (2.5 - - 2)/getWidth();
        double db = (1.5 - - 1.5)/getHeight();

        for (double a = -2; a < 1.5; a+=da) {
            for (double b = -1.5; b < 1.5; b+=db){
                int count = testPoint(a, b);
                if(count == maxLoops){
                    g2.setColor(Color.black);
                    plotPoint(a, b, g2);
                }
                else {
                    g2.setColor(Color.getHSBColor(1f*count/maxLoops, 1-1f*count/maxLoops,1f));
                    plotPoint(a,b,g2);
                }
            }
        }

    }

    // return true if a + bi is IN the set
    public int testPoint(double a, double b) {
        double an = a;
        double bn = b;

        int counter = 0;

        while(counter < maxLoops && an*an + bn*bn <= 4) {

            double nextA = (an*an - bn*bn) + a;
            double nextB = (2*an*bn) + b;
            an = nextA;
            bn = nextB;
            counter ++;
        }

        return counter;
    }

    public void plotPoint(double a, double b, Graphics2D g2) {

        double x = (a - -2)*(getWidth()/(3.5));
        double y = getHeight() - (b - -1.5)*(getHeight()/3);
        g2.drawLine((int)x, (int)y, (int)x+1, (int)y+1);

    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int width = 600;
        int height = 600;
        window.setBounds(0, 0, width, height + 22); //(x, y, w, h) 22 due to title bar.

        Main panel = new Main(width, height);
        panel.setFocusable(true);
        panel.grabFocus();

        window.add(panel);
        window.setVisible(true);
        window.setResizable(true);
    }
}
