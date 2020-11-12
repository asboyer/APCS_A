public class rectangle {

    private double w, h;

    public rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    public double getArea(){
        return w * h;
    }
    public void scaleBy(double factor){
        w *= factor;
        h *= factor;
    }
}
