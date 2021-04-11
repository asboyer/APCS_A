public class Intro {

    public void badExample(){
        System.out.println("BAD");
        badExample();
    }

    public static void main(String[] args) {
        Intro obj = new Intro();
        obj.badExample();
    }
}
