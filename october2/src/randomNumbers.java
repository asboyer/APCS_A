public class randomNumbers {

    public static void main(String[] args) {

        System.out.println(Math.random()); //[0,1)


        if(Math.random() < 0.5) {
            System.out.println("Tails");
        }
        else{
            System.out.println("Heads");
        }

        int randomInt = (int)(Math.random()*6) + 1;
        // [0,1) * 6 -> [0,6) - cast -> 0-5 {0,1,2,3,4,5}
        // + 1 --> goes to {1,2,3,4,5,6}
//        System.out.println(randomInt);
//        randomInt = (int)(Math.random()*6) + 1;
//        System.out.println(randomInt);
//        randomInt = (int)(Math.random()*6) + 1;
//        System.out.println(randomInt);
//        randomInt = (int)(Math.random()*6) + 1;
//        System.out.println(randomInt);
//        randomInt = (int)(Math.random()*6) + 1;
//        System.out.println(randomInt);
//        randomInt = (int)(Math.random()*6) + 1;
//        System.out.println(randomInt);


        //random int from 100 up through 150
        int rando = (int)(Math.random() * 51) + 100;
        System.out.println(rando);
        rando = (int)(Math.random() * 51) + 100;
        System.out.println(rando);
        rando = (int)(Math.random() * 51) + 100;
        System.out.println(rando);
        rando = (int)(Math.random() * 51) + 100;
        System.out.println(rando);
        rando = (int)(Math.random() * 51) + 100;
        System.out.println(rando);

    }

}
