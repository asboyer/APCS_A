public class TokenPass {
    public int[] board;
    private int currentPlayer;

    public TokenPass(int playerCount){
        board = new int [playerCount];
        for(int space: board){
            space = (int)(Math.random() * (playerCount-1));
            System.out.print(space + " ");
        }
    }
}
