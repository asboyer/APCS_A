public class Arithmetic {

    public static void main(String[] args) {

        int n = 10;
        int p = 8;

        System.out.println(n+p);
        System.out.println(p-n);
        System.out.println(n*p);
        System.out.println(p/n); //int/int -> int (ditches remainder)

        //modulo (remainder) operator - %

        System.out.println(n%p); // 2 -> remainder 10/8
        System.out.println(p%n); //8 -> 8/10 = 0 R8

        System.out.println(7%3); // only the int remainder of what is left over
        System.out.println(153/100); //1
        System.out.println(153%100);//53

        int score = 0;
        System.out.println(score);
        //player earned 500 points
        score = score + 500; //assignment goes from right to left
        System.out.println(score);
        //player loses 100 points
        score = score - 100;
        System.out.println(score);
        score +=300; //score = score + 300
        score -= 100; //score = score - 100


        int lives = 3;
        lives = lives -1;
        lives -= 1;
        lives --; // decrement operator, just takes one away from the variable

        if(lives <= 0)
            System.out.println("GG");
    }
}

