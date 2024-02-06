/*
   Author: Daniel Nguyen
   Date: Feb 6, 2024
   Description: This program asks the user to enter their course marks, stores the data
   in an array, and then compute the average grade
*/

import java.util.Scanner;

public class Arrays {
   Scanner s = new Scanner(System.in);
   
   double[] marks = new double[10];
   double sum = 0;
   
   public void display() {
      for (int i = 0; i < marks.length; i++) {
         System.out.print("Please enter your mark:");
         marks[i] = s.nextFloat();
         sum += marks[i];
      }
      System.out.println(sum / 10);
   }
   
   public static void main(String[] args) {
      Arrays a = new Arrays();
      a.display();
   }
}