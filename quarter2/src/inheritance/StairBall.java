package inheritance;

public class StairBall extends Ball{
    private int stepsTaken, stairSize, speed;

    public StairBall(int x, int y, int stairSize, int speed) {
        super(x, y, speed, 0);
        this.stairSize = stairSize;
        this.speed = speed;
        stepsTaken = 0;
    }

    @Override
    public void move(int width, int height) {
        stepsTaken+= speed;
        if(stepsTaken == stairSize){
            stepsTaken = 0;
            if(getVx() == speed){
                setVx(0);
                setVy(speed);
            }
            else if(getVy() == speed){
                setVy(0);
                setVx(speed);
            }
        }
        super.move(width, height);
    }
}
