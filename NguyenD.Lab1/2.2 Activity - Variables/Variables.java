/*
   Author: Daniel Nguyen
   Date: Feb 6, 2024
   Description: This program asks the user to enter their course marks, stores the data
   in variables, and then compute the average grade
*/
import java.util.Scanner;

public class Variables {
   Scanner s = new Scanner (System.in);
   
   double mark1;
   double mark2;
   double mark3;
   double mark4;
   double mark5;
   double mark6;
   double mark7;
   double mark8;
   double mark9;
   double mark10;
   double average;
   
   public void enterMarks() {
      System.out.print ("Please enter your first mark: ");
      mark1 = s.nextFloat();
      
      System.out.print ("Please enter your second mark: ");
      mark2 = s.nextFloat();
      
      System.out.print ("Please enter your third mark: ");
      mark3 = s.nextFloat();
      
      System.out.print ("Please enter your fourth mark: ");
      mark4 = s.nextFloat();
      
      System.out.print ("Please enter your fifth mark: ");
      mark5 = s.nextFloat();
      
      System.out.print ("Please enter your sixth mark: ");
      mark6 = s.nextFloat();
      
      System.out.print ("Please enter your seventh mark: ");
      mark7 = s.nextFloat();
      
      System.out.print ("Please enter your eighth mark: ");
      mark8 = s.nextFloat();
      
      System.out.print ("Please enter your ninth mark: ");
      mark9 = s.nextFloat();
      
      System.out.print ("Please enter your tenth mark: ");
      mark10 = s.nextFloat();
   }
   
   public void averageCalc() {
      average = (mark1 + mark2 +  mark3 + mark4 + mark5 + mark6 + mark7 + mark8 + mark9 + mark10) / 10;
   }
   
   public void display() {
      System.out.println("Your average is: " + average);
   }
}