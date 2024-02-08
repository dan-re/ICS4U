/* Author: Daniel Nguyen
   Date: Feb 8, 2024
   Description: This program creates a game of X's and O's on a 3 x 3 grid.
   A player will win if the get 3 letters in a row, either horizontally or vertically.
*/

import java.util.Scanner;

public class XsAndOs {
   Scanner s = new Scanner(System.in);
   
   String[][] positions = new String[3][3];
   
   public void intro() {
      System.out.println("This is a game of X's and O's");
      
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            System.out.print("-   ");
         }
         System.out.println();
      }
   }
   
   public void gamePlay() {
      System.out.println("Player 1, start placing your letter");
      locate();
      
   }
   
   public String[][] locate() {
      System.out.print("Row: ");
      int x = s.nextInt();
      System.out.print("Column: ");
      int y = s.nextInt();
      s.nextLine();
      
      System.out.print("Placing 'x' or 'o'? ");
      positions[x-1][y-1] = s.next();
      s.nextLine();
      
      return positions;
   }
}