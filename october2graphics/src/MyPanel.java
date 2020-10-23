import javax.swing.*; // user interface stuff
import java.awt.*;//abstract window tool kit

public class MyPanel extends JPanel{  //JPanels are things we draw on. Canvas?

    public MyPanel(int width, int height) {
        setSize(width, height); // set size is what we got from JPanel


    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        correctBull test = new correctBull(0,0,800);
        test.draw(g2);


//        for (int j = 0; j < 4; j++) {
//            for (int i = 0; i < 6; i++) {
//
//                Bullseye b = new Bullseye(i * 80, j * 80, 80);
//                b.draw(g2);
//            }
//
//        }
   }
//        Graphics2D g2 = (Graphics2D)g;
////        drawFaceGrid(16, g2);
//        witchFace boo = new witchFace(200,200,200);
//        boo.draw(g2);
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

//        SmileyFace bface = new SmileyFace(400,500,100);
//        bface.draw(g2);



//            SmileyFace bFace = new SmileyFace(0,i*100,100);
//

//            bFace.draw(g2);
//            SmileyFace cFace = new SmileyFace(i*100,i*100,100);
//            cFace.draw(g2);


//            int x = (int)(Math.random() * 700);
//            int y = (int)(Math.random()*700);
//            SmileyFace face = new SmileyFace(x,y,100);
//            face.draw(g2);


//        for (int i = 0; i < 8; i++){
//            SmileyFace aFace = new SmileyFace(i*100,100,100);
//            aFace.draw(g2);



    /*
    This will fill the screen with a numFaces x numFaces grid of faces
    The faces will be scaled an they will be tangent to each other
    */
//    public void drawFaceGrid(int numFaces, Graphics2D g2){
//        int scaled = getWidth()/numFaces;
//        for (int j = 0; j<numFaces; j++){
//            for (int i = 0; i < numFaces; i++){
//                SmileyFace aFace = new SmileyFace(i*scaled, j*scaled, scaled);
//                aFace.draw(g2);




}