import javax.swing.*;
import java.awt.*;

public class MainTestpanel extends JPanel {

    public MainTestpanel( int width, int height){
            setSize(width, height);
        }

        protected void paintComponent (Graphics g){
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
        }
    }