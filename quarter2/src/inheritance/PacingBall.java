package inheritance;

public class PacingBall extends Ball{
    //Ball is the SUPERCLASS of PacingBall
    //PacingBall is the SUBCLASS of Ball

    private int stepCounter, pathLength;


    public PacingBall(int x, int y, int vx, int vy, int pathLength) {
        // must be first line before anything else
        super(x, y, vx, vy); //calling the Ball constructor
        this.pathLength = pathLength;
        stepCounter = 0;

    }

    //goal is to tweak the move method that was inherited ... Override a method!


    @Override
    public void move() {
        stepCounter ++;
        if(stepCounter >= pathLength){
            //turn around
            setVx(-getVx());
//            vx = - vx
            setVy(-getVy());
            stepCounter = 0;
        }
            super.move();
    }
}
