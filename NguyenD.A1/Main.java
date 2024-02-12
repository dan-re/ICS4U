public class Main {
  public static void main(String[] args) {
    XsAndOs xo = new XsAndOs();
    boolean gameStatus = false;
    do {
      xo.printBoard();
      xo.updateBoard();
    } while (gameStatus == false);
  }
}