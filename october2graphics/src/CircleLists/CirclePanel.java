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
            int radius = (int)(Math.random()*31+10); //[10-40]
            int ranx = (int)(Math.random()*(800-2*radius));
            System.out.print(ranx);
            System.out.print(", ");
            int rany = (int)(Math.random()*(800-2*radius));
            System.out.print(rany);
            System.out.println(" :: " + radius);
            circleList.add(new Circle(ranx,rany,radius));
            System.out.println(circleList);
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
            g2.drawRect(800,800,20,20);
            g2.drawRect(0,800,20,20);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

        int mouseX = e.getX();
        int mouseY = e.getY();
        if (e.getButton() == 1) {
            for (int i = 0; i < circleList.size(); i++) {
                Circle c = circleList.get(i);
                //TODO: If (mouseX, mouseY) is inside a circle, remove that circle.
                if (c.contains(e.getX(), e.getY())) {
//                remove the i-th element from the circle list.
                    circleList.remove(i);
                }

            }
        }
        else if (circleList.size() > 0) { //remove the smallest circle - lowest radius

            /*
            look through the list, one element at a time.
            store the smallest so far, starting with first element
            if you find a smaller one, change the stored value.
             */

            int mindex = 0;
            for (int i = 1; i < circleList.size(); i++) {
                if(circleList.get(i).getR() < circleList.get(mindex).getR())
                    mindex = i;
            }
            circleList.remove(mindex);
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
