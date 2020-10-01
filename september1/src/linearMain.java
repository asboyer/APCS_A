public class linearMain {

    public static void main(String[] args) {

            int x = 5;
            LinearEquation equation = new LinearEquation(3 ,-2); // new defines it as a constructor
            equation.printPoint(0);
            equation.printPoint(1);
            equation.printPoint(2);

//            LinearEquation equation2 = new LinearEquation(1.5, 3); //this is an object, equation2 is a variable we are assigning to an object // making object using constructor
//            equation2.getY(5);
//            double output = (equation2.getY(5) + equation.getY(5))/2;
//            System.out.println(output);
        System.out.println();
            LinearEquation line = new LinearEquation(-2,5);
            line.printPoint(0);
            line.printPoint(1);


            line = equation;
            line.printPoint(0);

    }
}
