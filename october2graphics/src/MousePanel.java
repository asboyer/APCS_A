import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class MousePanel extends JPanel implements MouseListener {
    //MouseListener is an example of an "interface", is a collection of undefined methods
    //when a class implements an interface, the class must define those methods ter

    private int x, y, n;
    private ArrayList<Point> points;
    //{ (30,200), (203, 305)

    public MousePanel(int width, int height) {
        setSize(width, height); // set size is what we got from JPanel
        // constructors always have the same name as the class
        //clicking on panel is event
        addMouseListener(this);
        x = -100;
        x = -100;
        points = new ArrayList<>();
        n = 0;
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

            for (int i = 0; i < points.size(); i++) {
                if (i % 3 == 0){
                    g2.setColor(Color.red);
                }
                else if ( i % 3 == 1){
                    g2.setColor(Color.white);
                }
                else{
                    g2.setColor(Color.blue);
                }
                Point p = points.get(i);
                if (i % 2 == 0){

                    g2.fillOval(p.x, p.y, 50,50);

                }
                else {

                    g2.fillRect(p.x, p.y, 50,50);
                }

            }
        }
        
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == 3){
            points.clear();
            repaint();
        }
        else {
            x = e.getX();
            y = e.getY();

            repaint();

            points.add(new Point(e.getX(), e.getY()));
            n++;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
