/* Author: Daniel Nguyen
   Date: Feb 8, 2024
   Description: This program creates a game of X's and O's on a 3 x 3 grid.
   A player will win if the get 3 letters in a row, either horizontally or vertically.
*/

import java.util.Scanner;

public class XsAndOs {
  Scanner s = new Scanner(System.in);

  int rows = 3;
  int columns = 3;
  char[][] positions = new char[columns][rows];
  char currentPlayer = 'x';

  public void initializeBoard() {
    for (int i = 0; i < columns; i++) {
      for (int j = 0; j < rows; j++) {
        positions[i][j] = '-';
      }
    }
  }

  public void printBoard() {
    for (int i = 0; i < columns; i++) {
      for (int j = 0; j < rows; j++) {
        System.out.print("   " + positions[i][j] + "   ");
      }
      System.out.println();
      System.out.println();
    }
  }

  public void changePlayer() {
    if (currentPlayer == 'x') {
      currentPlayer = 'o';
    } else {
      currentPlayer = 'x';
    }
  }

  public void updateBoard() {

    boolean validInput = false;

    do {
      if (currentPlayer == 'x') {
        System.out.print("Player 'X', enter your move: ");
      } else {
        System.out.print("Player 'O', enter your move: ");
      }

      int row = s.nextInt() - 1;
      int col = s.nextInt() - 1;

      if (row >= 0 && row < rows && col >= 0 && col < columns && positions[row][col] == '-') {
        positions[row][col] = currentPlayer;
        validInput = true;
      } else {
        System.out.println("Sorry, the move at (" + (row + 1) + ", " + (col + 1) + ") is not valid. Please try again");
      }
    } while (!validInput);
  }
}