//model a student in a school class, and keep track of grades. Students will have a name
// calculated by points earned over points available
// class has no main method, it will model something

public class Student {

    //instance fields
    //core information that model needs to keep track of
    // all students will have these

    //string is not a primitive data type
    private String name;
    private int pointsEarned, pointsAvailable;

    //constructor(s)
    public Student(String n) {
        this.name = n;
        pointsEarned = 0;
        pointsAvailable = 0;

    }

    public Student(String name, int pointsEarned, int pointsAvailable) {
        this.name = name;
        this.pointsEarned = pointsEarned;
        this.pointsAvailable = pointsAvailable;

    }

    //method(s)
    public String getAverage(){
        double average = (double)pointsEarned/pointsAvailable; //cast pointsEarned to a double
        //return 1.0*pointsEarned/pointsAvailable
        String percent = average * 100 + "%";
        return percent;

    }

    //addScore(earned, outOf) (parameters)
    //mutater method, changes instance fields in an object
    public void addScore(int got, int outOf){
        pointsEarned += got;
        pointsAvailable += outOf;

    }

}
