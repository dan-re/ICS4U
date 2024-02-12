public class Main {
  public static void main(String[] args) {
    XsAndOs xo = new XsAndOs();
    boolean gameStatus = false;
    do {
      xo.gamePlay();
      xo.printBoard();
      gameStatus = true;
    } while (gameStatus == false);
  }
}