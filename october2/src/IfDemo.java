public class IfDemo {
    public static void main(String[] args) {

        int a = 13;
        int b = 13;
        int c = 10;

//        System.out.println(a < b);


        if (a < b) { //if(condition) is true, run the body
            //body of the if statement
            System.out.println("a is less than b");

        } else if (a > b) { // it is possible to get past both.
            System.out.println("a is greater than b");
        } else {
            System.out.println("a");
        }


        // how to make boolean expressions ...
        //numerical comparisons: < > == != <=, >=
        // common error: = vs ==, assignment vs equality

        // check if a number, c, is even

        if(c % 2 == 0){
            System.out.println("c is even");

        }


        //check if a is less than 10 and odd:
        if(a < 10){
            if(a  % 2 != 0){
                System.out.println();
            }
        }


        // combine boolean expressions and (&&) or (||) <- binary not(!) <- unirary, negate one expression}
        if (a < 10 && a % 2 == 1){

        }

        //if b is negative or b > a
        if(b < 0 || b > a){


        }

        if(!(a<b)){ //if a is not less than b

        }
    }
}
