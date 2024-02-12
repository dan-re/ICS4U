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
  char[][] positions;
  char currentPlayer;

  public XsAndOs() {
    positions = new char[rows][columns];
    currentPlayer = 'x';
    initializeBoard();
  }

  public void initializeBoard() {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        positions[i][j] = '-';
      }
    }
  }

  public void printBoard() {
    System.out.println();
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
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

  public void gamePlay() {
    System.out.println("This is a game of X's and O's. Player 1 is X and Player 2 is O.");
    System.out.println();
    boolean validInput = false;
    int row;
    int col;

    do {
      if (currentPlayer == 'x') {
        System.out.print("Player 1, enter a row number (1, 2, or 3): ");
        row = s.nextInt() - 1;
        System.out.print("Enter a column number (1, 2, or 3): ");
        col = s.nextInt() - 1;
      } 
      else {
        System.out.print("Player 2, enter a row number (1, 2, or 3): ");
        row = s.nextInt() - 1;
        System.out.print("Enter a column number (1, 2, or 3): ");
        col = s.nextInt() - 1;
      }

      if (row >= 0 && row < rows && col >= 0 && col < columns && positions[row][col] == '-') {
        positions[row][col] = currentPlayer;
        validInput = true;
      } else {
        System.out.println("Sorry, the move at (" + (row + 1) + ", " + (col + 1) + ") is not valid. Please try again");
      }
    } while (!validInput);
  }
}