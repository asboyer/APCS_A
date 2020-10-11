import java.util.Scanner;

public class GuessTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  //allows text input in the console (where output usually happpens)
        int guess = 1000;
        System.out.println("Guess a number between 1 and 100.");
        System.out.println("Enter a negative number to quit.");
        GuessMyNumber game = new GuessMyNumber();
        while(guess > 0){
            System.out.print("Guess the number: ");
            guess = input.nextInt(); //waits for user to type an int into the console
            if (guess > 0) {
                game.checkGuess(guess);
            }
            else{
                System.out.println("Good game! Play again soon!");
            }
        }
    }
}