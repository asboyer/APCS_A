public class StudentMain {
    public static void main(String[] args) {
        Student dylan = new Student("Dylan Bonanno"); //0/0
        Student sophie = new Student("Sophie Ellenbogen",15,18);
        System.out.println(sophie.getAverage());
        System.out.println(dylan.getAverage());


        dylan.addScore(38,40);
        System.out.println(dylan.getAverage());
        dylan.addScore(0,2);
        System.out.println(dylan.getAverage());
    }

}
