public class GuessMyNumber {

    int goal, numGuesses;

    public GuessMyNumber() {
        goal = (int)(Math.random() * 100) + 1;

        }
    void checkGuess(int guess){
        numGuesses++;

        if (guess == goal){
            if (numGuesses == 1){
                System.out.println("Correct" + "You got it in " + numGuesses + " guess!");
            }
            else {
                System.out.println("Correct! " + "You got it in " + numGuesses + " guesses!");
            }
            reset();
        }
        else{
            if(guess > goal){
                System.out.println("Your guess is too high! Try again!");
            }
            else{
                System.out.println("Your guess is too low! Try again!");
            }
        }

    }

    void reset(){
        goal = (int)(Math.random() * 100) + 1;
        numGuesses = 0;
        System.out.println();
        System.out.println("New number! Happy guessing! ");
    }
}
