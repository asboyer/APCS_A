public class forhw {
    public static void main(String[] args) {
        for (float i = 1; i < 4; i+=0.1) {
            for (float j = 0; j < i; j+=0.1) {
                System.out.print('*');

            }
            System.out.println();
        }
        int c = 0;
        for (int i = 2; i < 10; i+=2) {
            c+=i;
        }
        System.out.println(c);

        int p = 0;
        for (int i = 1; i <= 20 ; i++) {
            if (i % 4 == 0) {
                p++;
            }
        }
        System.out.println(p);


        int v = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 2; j < 5; j++) {
                if(i>j){
                    v++;
                }
            }
        }
        System.out.println(v);
    }
}
