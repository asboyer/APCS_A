import java.util.Scanner;

public class hw
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Choose a random number from 0-100

        int goal = (int)(Math.random() * 100) + 1;
        // Ask the user to guess a number from 0 to 100
        System.out.println("Guess a number between 1 and 100.");
        System.out.println("Enter a negative number to quit.");
        // Get the first guess using scan.nextInt();
        System.out.print("Guess the number: ");
        int guess = input.nextInt();

        // Loop while the guess does not equal the random number,
        while (guess != goal){
            if(guess > goal){
                System.out.println("Your guess is too high! Try again!");
                System.out.print("Guess the number: ");
                guess = input.nextInt();
            }
            else if (guess < goal){
                System.out.println("Your guess is too low! Try again!");
                System.out.print("Guess the number: ");
                guess = input.nextInt();
            }
            else {
                break;
            }
        }

        // If the guess is less than the random number, print out "Too low!"

        // If the guess is greater than the random number, print out "Too high!"

        // Get a new guess (save it into the same variable)

        System.out.println("You got it");
        // Print out something like "You got it!"


    }
}