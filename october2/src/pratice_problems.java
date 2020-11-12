import java.util.ArrayList;

public class pratice_problems {
    public static void main(String[] args) {

        // #1 - correct
        System.out.print("1. ");

        int n = 4;
        int x = 2;
        for (int i = 0; i < n; i++) {
            if(i % 2 == 0)
                x +=i;
            else
                x+=1;
        }
        System.out.println(x);

        //2 - correct
        System.out.print("2. ");

        int a = 10;
        int b = 20;
        while(a<b){
            a += 1;
            b -= 3;
        }
        System.out.println(a);

        //3 - correct
        System.out.print("3. ");
        pratice_problems p = new pratice_problems();
        p.printEvensInRange(1,10);

        //4 - correct
        System.out.print("\n4. ");
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        System.out.println(p.moreOdd(list));
        System.out.println(p.maxV(list));
        System.out.println(1/2);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(i + " ");
            }
            System.out.println();
        }
    }
    public void printEvensInRange(int min, int max){
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
    public int maxV(ArrayList<Integer> nums){
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max;
    }
    public boolean moreOdd(ArrayList<Integer> list){
        int odds = 0;
        int evens = 0;
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if(num % 2 == 1){
                odds++;
            }
            else{
                evens++;
            }
        }
        if(odds > evens){
            return true;
        }
        else{
            return false;
        }

    }
}
