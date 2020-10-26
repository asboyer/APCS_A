public class stringTests {
    public static void main(String[] args) {
        String s = "example";
        int i = 0;
// while there is an a in s
        while (s.indexOf("a") >= 0)
        {
            // Find and save the next index for an a
            i = s.indexOf("a");
            // Process the string at that index
            String ithLetter = s.substring(i,i+1);
            System.out.println(ithLetter);
        }
    }
}
