public class LoopDemoText {
    public static void main(String[] args) {
        //For loops!
        /*
        Syntax: for(DECLARE/INIT A CONTROL VAR; CONDITION TO RUN; CHANGE VAR VALUE){
        //BODY OF LOOP
        }
        ex) for(int i = 0; i < 5; i ++) {
        //This body will execute 5 times (when i = {0,1,2,3,4})
        }

        for (int evens = 0; evens < 100; evens += 2) { //evens = evens + 2
        //This body will execute 50 times (evens = {0,2,4, .... , 98}
        }
         */

        for(int i = 0; i < 5; i ++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int evens = 0; evens < 100; evens += 2) {
            System.out.print(evens + " ");
        }
    }
}
