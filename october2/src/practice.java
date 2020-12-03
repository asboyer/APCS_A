public class practice {
    public static void main(String[] args) {
        String word = "keyboard";

        System.out.println(word.substring(1, 3));

        System.out.println(word.substring(4, word.length()-2));

        for (int i = 0; i < word.length(); i++) {
            if(word.substring(i, i+1).equals("a") ||
                    word.substring(i,i+1).equals("e")){
                System.out.print("*");
            }
        }
        System.out.println(word.length());
        System.out.println(word.indexOf("board"));

        boolean t = true;
        System.out.println(13%7);
        for (int i = 1; i <= 15; i++) {
            if(i % 5 == 0 && i % 2 == 0)
                System.out.println("*");
            else if(i % 7 < 1 || (i < 5 && i > 2))
                System.out.println("#");
        }
        int c = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i == j)
                    c *= 2;
            }
        }
        System.out.println(c);
    }
}
