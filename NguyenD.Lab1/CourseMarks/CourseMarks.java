/*
   Author: Daniel Nguyen
   Date: Feb 6, 2024
   Description: This program asks the user to enter their course codes and marks, stores the data
   in an array, and then compute the average grade
*/

import java.util.Scanner;

public class CourseMarks {
   Scanner s = new Scanner(System.in);
   
   double[] marks = new double[10];
   String[] courseCodes = new String [10];
   double sum = 0;
   double average;
   
   public void userInputs() {
      for (int i = 0; i < marks.length; i++) {
         System.out.print("Please enter your course code: ");
         courseCodes[i] = s.next();
         
         System.out.print("Your mark: ");
         marks[i] = s.nextFloat();
         sum += marks[i];
         s.nextLine();
      }
      average = sum/10;
   }
   
   public void display() {
      System.out.println();
      System.out.println("Here are your results:");
      for (int i = 0; i < marks.length; i++) {
         System.out.println(courseCodes[i] + ": " + marks[i]);
      }
      System.out.println("Your average is: " + average);
   }
}