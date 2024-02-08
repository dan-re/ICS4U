/*
   Author: Daniel Nguyen
   Date: Feb 7, 2024
   Description: This program creates a 2D array in which each cell of the array holds a color name
*/
import java.util.Scanner;
public class ColorChart {
   Scanner s = new Scanner (System.in);
   
   String[][] colors = new String[3][4];
   
   public void colorNaming() {
   
      colors[0][0] = "red   ";
      colors[0][1] = "cherry";
      colors[0][2] = "rose";
      colors[0][3] = "crimson";
   
      colors[1][0] = "green";
      colors[1][1] = "emerald";
      colors[1][2] = "jade";
      colors[1][3] = "fern";
   
      colors[2][0] = "blue";
      colors[2][1] = "indigo";
      colors[2][2] = "azure";
      colors[2][3] = "denim";
   
      for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 3; j++) {
            System.out.print(colors[j][i]);
            for (int k = 0; k < 10 - colors[j][i].length(); k++) {
               System.out.print(" ");
            }
         }
         System.out.println();
      }
   }
}