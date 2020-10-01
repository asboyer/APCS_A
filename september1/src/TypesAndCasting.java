public class TypesAndCasting {

    public static void main(String[] args) {

        // int -  whole numbers (+, -, 0)
        // double - decimals, 14 or 15 digits of accuracy, sci notation

//        int a = 5;
//        int b = 3;
//        double x = 10.0; //10, auto convert to 10.0
//
//        System.out.println(a/b); //sout enter
//        System.out.println(b/a);
//
//        System.out.println(a/x);
//        //^ int division
//        System.out.println(a/b*x);
//        System.out.println(x*a/b); //doubles take over as soon as they show up
//
//        int p = (int)(x/a); //10/5 //CASTING forces one type to another.
//        System.out.println(p);
//        double ratio = (double)a/b;
//        double ration2 = (b+0.0)/a;
//        System.out.println(ratio);


        //integers have limits

        int big = 210000000;
        System.out.println(big*2); //we have gone too big //integer overflow
        //Upper limit of int is apprx 2.14 billion
        //2^31 -1
        System.out.println(Integer.MAX_VALUE + 1); //rolls over to lowest
        System.out.println(Integer.MIN_VALUE -1); //rolls over to highest





        // NOT part of AP exam:

//        char letter = 'a';
//        letter = (char)((int)letter + 1);
//
//        System.out.println(letter);
    }

}
