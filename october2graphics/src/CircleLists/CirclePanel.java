package CircleLists;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class CirclePanel extends JPanel implements MouseListener {

    private ArrayList<Circle> circleList;

    public CirclePanel(int width, int height) {
        setSize(width, height);

        circleList = new ArrayList<>(); //Empty list of Circles
        /*TODO: Write a for loop that runs 20 times.  Add 20 new Circles to the circleList, each
           with random x and y values, from [0,800), with radii of 25.*/
        for (int i = 0; i < 20; i++) {
            int ranx = (int)(Math.random()*800);
            int rany = (int)(Math.random()*800);
            circleList.add(new Circle(ranx,rany,25));
        }

        addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        //TODO: activate this code when you finish the Circle.draw method.
        for (int i = 0; i < circleList.size(); i++) {
            circleList.get(i).draw(g2);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println(e);
        int mouseX = e.getX();
        int mouseY = e.getY();

        for (int i = 0; i < circleList.size(); i++) {
            Circle c = circleList.get(i);
            //TODO: If (mouseX, mouseY) is inside a circle, remove that circle.
            if(c.contains(e.getX(), e.getY())){
//                remove the i-th element from the circle list.
                circleList.remove(c);
           }

        }


        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

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
