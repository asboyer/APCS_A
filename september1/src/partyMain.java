public class partyMain {
    public static void main(String[] args) {
        Liquid liquid = new Liquid(98.6, -95.0);
        liquid.freeze((int)9.9);
        int x = liquid.oneThing(2,10) + liquid.anotherThing(5,2);
        System.out.println(x);



    }

}
