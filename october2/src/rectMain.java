public class rectMain {
    public static void main(String[] args) {
        rectangle r = new rectangle(3,3);
        System.out.println(r.getArea());
        r.scaleBy(2);
        System.out.println(r.getArea());

    }
}
