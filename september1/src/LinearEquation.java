public class LinearEquation {

    //This class won't have a main method. Most classes don't

    //This class will allow us to model a line and enable resuability
    //Class model system has 3 parts: instance fields, constructors, and methods


    // variables, declared in class scope, instance fileds, instance variables
    private double m; //just declared instance fields, most critical values
    private double b;


    //object -> a useable concrete created thing from the class blueprint
    //my car: rav4 design :: object : class
    // you can't drive a blueprint

    //constructors let us add values to the instance fields
    public LinearEquation(double m, double b){ //local variable
        this.m = m; //how to construct the linear equation //this.m is the instance field - private thing up above
        this.b = b; //taking whatever comes in takes it as m, and then assignes it to m
        // all instance fields should get a value
        //objects are instances of classes
    }


    //method:

    public double getY(double x){ //public returnType nameOfMethod()
        // we MUST return a double, in order to compile
        double y = m*x + b;
        return y;


    }

    public void printPoint(double x){
        double y = getY(x);
        System.out.println("(" + x +  ", " + y + ")");
    }












}
