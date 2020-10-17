import javax.swing.*; // user interface stuff
import java.awt.*;//abstract window tool kit

public class MyPanel extends JPanel{  //JPanels are things we draw on. Canvas?

    public MyPanel(int width, int height) {
        setSize(width, height); // set size is what we got from JPanel

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
// how to make a custom color ->        Color custom = new Color(189, 10, 224);

//        for (int i = 0; i < 8; i ++){
//
//            if (i%2==0){
//                g2.drawRect(i*100, 0, 100,100);
//            }
//            else{
//                g2.fillRect(i*100,0,100,100);
//            }
//        }
////        g2.drawRect(0,0,100,100);
////        g2.drawRect(100,400,100,100);
////        g2.fillRect(100,400,100,100);

        //Random rectangles. 10 randomly located rects
        // x is random from
//        randomCircles circles = new randomCircles(40,40,Color.BLACK,Color.orange);
//        circles.draw(g2);
//
//        randomCircles circle = new randomCircles(100,40,Color.green,Color.red);
//        circle.draw(g2);

        SmileyFace bface = new SmileyFace(400,500,100);
        bface.draw(g2);


        for(int i = 0; i < 200; i ++){

            int x = (int)(Math.random() * 700);
            int y = (int)(Math.random()*700);
            SmileyFace face = new SmileyFace(x,y,100);
            face.draw(g2);
        }

    }
}