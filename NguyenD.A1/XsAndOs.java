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

  // Introduce the game
  public void intro() {
    System.out.println("This is a game of X's and O's. Player 1 is X and Player 2 is O.");
  }

  // Initialize the board with empty positions
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

  // Change users after each turn
  public void changePlayer() {
    if (currentPlayer == 'x') {
      currentPlayer = 'o';
    } else {
      currentPlayer = 'x';
    }
  }

  // Read the user's input and check if the move is valid
  public void gamePlay() {
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
      } else {
        System.out.print("Player 2, enter a row number (1, 2, or 3): ");
        row = s.nextInt() - 1;
        System.out.print("Enter a column number (1, 2, or 3): ");
        col = s.nextInt() - 1;
      }

      if (row >= 0 && row < rows && col >= 0 && col < columns && positions[row][col] == '-') {
        positions[row][col] = currentPlayer;
        validInput = true;
      } else {
        System.out.println("Sorry, the move at (" + (row + 1) + ", " + (col + 1) + ") is not valid. Please try again.");
        System.out.println();
      }
    } while (!validInput);
  }

  public boolean checkForWin() {
    // Check rows
    for (int i = 0; i < rows; i++) {
      if (positions[i][0] == currentPlayer && positions[i][1] == currentPlayer && positions[i][2] == currentPlayer) {
        return true;
      }
    }

    // Check columns
    for (int j = 0; j < columns; j++) {
      if (positions[0][j] == currentPlayer && positions[1][j] == currentPlayer && positions[2][j] == currentPlayer) {
        return true;
      }
    }

    // Check diagonals
    if (positions[0][0] == currentPlayer && positions[1][1] == currentPlayer && positions[2][2] == currentPlayer) {
      return true;
    }
    if (positions[0][2] == currentPlayer && positions[1][1] == currentPlayer && positions[2][0] == currentPlayer) {
      return true;
    }

    return false;
  }

  public boolean checkForTie() {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        if (positions[i][j] == '-') {
          return false;
        }
      }
    }
    return true;
  }
}