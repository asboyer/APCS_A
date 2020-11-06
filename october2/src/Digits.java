import java.util.*;

public class Digits
{
    /** A list of digits */
    private ArrayList<Integer> digitList; //instance fields

    /** Constructs a list of digits from the given number */
    public Digits(int number)
    {
        // initialize digitList to an empty ArrayList of Integers
        digitList = new ArrayList<Integer>();

        // Use a while loop to add each digit in number to digitList
        while(number > 0) {
             digitList.add(number % 10);
             number = number / 10;

        }
        //Use Collections.reverse(digitList); to reverse the digits
        Collections.reverse(digitList);

    }

    /** returns the string representation of the digits list */
    public String toString()
    {
        String a = "bruh";
        //return digitList.toString();
        return a;
    }

    public static void main(String[] args)
    {
        Digits d1 = new Digits(154);
        System.out.println(d1);
    }
}

