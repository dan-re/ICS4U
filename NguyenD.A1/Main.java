public class Main {
  public static void main(String[] args) {
    XsAndOs xo = new XsAndOs();
    boolean gameStatus = false; // game is over when true

    xo.intro();
    do {
      xo.gamePlay();
      xo.printBoard();

      // print message when game ends
      if (xo.checkForWin()) {
        System.out.println("Player " + xo.currentPlayer + " wins!");
        gameStatus = true;
      } else if (xo.checkForTie()) {
        System.out.println("It's a tie!");
        gameStatus = true;
      }

      // if game goes on, switch player
      else {
        xo.changePlayer();
      }
    } while (gameStatus == false); // loop ends if the game is over
  }
}