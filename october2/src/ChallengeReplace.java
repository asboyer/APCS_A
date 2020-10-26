public class ChallengeReplace
{
    public static void main(String[] args)
    {
        String message = "I love cats! I have a cat named Coco. My cat's very smart!";
        int index = 0;
        int count = 0;
        // Write a loop here that replaces every occurrence of "cat"
        // in the message with "dog", using indexOf and substring.
        while (message.indexOf("cat") >= 0)
        {
            index = message.indexOf("cat");
            String firstpart = message.substring(0,index);
            String lastpart = message.substring(index+3);
            message = firstpart + "dog" + lastpart;
            count ++;
            if (count == 1){
                System.out.println("Replaced " + count + " time");
            }
            else{
                System.out.println("Replaced " + count + " times");
            }

        }
        System.out.println(message);
    }
}
