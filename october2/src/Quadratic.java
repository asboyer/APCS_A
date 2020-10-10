public class Quadratic {

    //ax^2 + bx + c
    private double a, b, c;


    //constructor

    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    //methods

    public int getNumSolutions() {
        double discriminant = Math.pow(b, 2) - 4 * (a * c); //b*b
        if (discriminant > 0) {
            return 2;
        } else if (discriminant < 0) {
            return 0;
        } else {
            return 1;
        }
    }

    //get the roots
    //double getRoot1() - b + ....
    public double getRoot1(){
        double root = (- b + Math.sqrt(b*b - 4*a*c))/(2*a);
//        double top = -b + Math.sqrt(Math.pow(b,2)-4*a*c);
//        double ans = top / (2*a);
        return root;
    }

    //double getRoot2() - b .....
    public double getRoot2(){
        double root = (- b -Math.sqrt(b*b - 4*a*c))/(2*a);
        return root;
    }

    // x = 1 and x = 3
    // x = 0
    // No roots
    public void printRoots(){
        if(getNumSolutions() == 2){
            System.out.println("x = " + getRoot1() + " and x = " + getRoot2());
        }
        else if(getNumSolutions() == 1){
            System.out.println("x = " + getRoot1());
        }
        else {
            System.out.println("No roots.");
        }
    }

}
