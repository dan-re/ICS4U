/* Author: Daniel Nguyen
   Date: Feb 8, 2024
   Description: This program creates a game of X's and O's on a 3 x 3 grid.
   A player will win if the get 3 letters in a row, either horizontally or vertically.
*/

import java.util.Scanner;

public class XsAndOs {
   Scanner s = new Scanner(System.in);
   
   String[][] positions = new String[3][3];
   int x;
   int y;
   
   public XsAndOs() {
      for (int i = 0; i< 3; i++) {
         for (int j = 0; j < 3; j++) {
            positions[i][j] = "   ";
         }
      }
   }
   
   public void gamePlay() {
      System.out.println("This is a game of X's and O's");
      System.out.println();
      
      while (true) {
      System.out.println("Player 1, start placing your letter");
      locate();
      positions[x][y] = "x  ";
      printGrid();
      
      System.out.println("Player 2, place your letter");
      locate();
      positions[x][y] = "o  ";
      printGrid();
      }
   }
   
   public void printGrid() {
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            System.out.print(positions[i][j]);
         }
         System.out.println();
      }
   }
   
   public void locate() {
      System.out.print("Row: ");
      x = s.nextInt() - 1;
      System.out.print("Column: ");
      y = s.nextInt() - 1;
      s.nextLine();

   }
}