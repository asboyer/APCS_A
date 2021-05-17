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
        BoyerMystery obj = new BoyerMystery(250, 50, 50, 500, 500,500);

        obj.draw(g2);

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