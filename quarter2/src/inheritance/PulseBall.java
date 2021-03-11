package inheritance;

public class PulseBall extends Ball{
    private int minSize, maxSize;
    private boolean isGrowing;

    public PulseBall(int x, int y, int vx, int vy, int minSize, int maxSize){
        super(x, y, vx, vy);
        this.minSize = minSize;
        this.maxSize = maxSize;
        isGrowing = true;
    }

    @Override
    public void move(int width, int height) {
        if(isGrowing){
            if (getSize() < maxSize)
                setSize(getSize() + 1);
            else
                isGrowing = false;
        }
        else{
            if (getSize() > minSize)
                setSize(getSize() - 1);
            else
                isGrowing = true;
        }
        super.move(width, height);
    }
}
