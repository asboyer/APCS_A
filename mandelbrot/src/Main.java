import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {



    public Main(int w, int h){
        setSize(w, h);


    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;

    }

    // return true if a + bi is IN the set
    public boolean testPoint(double a, double b) {

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
