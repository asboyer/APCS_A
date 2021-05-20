import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main extends JPanel {

    private ArrayList<CustomImage> images;

    public Main(int w, int h){
        setSize(w, h);

        images = new ArrayList<>();
        images.add(new CustomImage("slothface.png", 0, 0));
        images.add(new GreenImage("slothface.png", 400, 0));
        images.add(new GreyImage("slothface.png", 0, 287));
        images.add(new NegativeImage("slothface.png", 400, 287));
        images.add(new SepiaImage("slothface.png", 0, 287*2));
        images.add(new FadeWhiteImage("slothface.png", 400, 287*2));



    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        for(CustomImage image: images)
            image.draw(g2);

    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Images!");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setBounds(0, 0, 800, 800 + 22); //(x, y, w, h) 22 due to title bar.

        Main panel = new Main(800, 800);

        panel.setFocusable(true);
        panel.grabFocus();

        window.add(panel);
        window.setVisible(true);
    }

}
