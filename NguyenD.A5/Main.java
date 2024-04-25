/*
Author: Daniel Nguyen
Teacher: Mr. Guglielmi
Date: Apr 2, 2024
Description: This is the Main class where the program is run
*/

import java.util.Scanner;

public class Main {

   // utility method to get the desired user input
  public static int getUserInput(int low, int max) {
    Scanner s = new Scanner(System.in);
    System.out.printf("\nEnter a number between [%d, %d].\n", low, max);
    String input = s.nextLine();
    try {
      int index = Integer.parseInt(input);
      if (index < low || index > max) {
        throw new Exception();
      }
    } catch (Exception e) {
      System.out.println("Invalid input. Try again");
      return getUserInput(low, max);
    }
    return Integer.parseInt(input);
  }
  
  public static void main(String[] args) {
    Roster r = new Roster("Caprica_Caps.txt");
    boolean programEnds = false;    // use a variable to control when the program starts or finishes
    System.out.println("Hi, welcome to Roster Sorting.");

    while (programEnds == false) {
      System.out.println("\nPlease choose one of the following options:");
      System.out.println("1. Display the unsorted roster.");
      System.out.println("2. Sort the roster by the number of goals scored.");
      System.out.println("3. Sort the roster by the number of points achieved (points = goals + assists).");
      System.out.println("4. Exit the program.");
      int input = getUserInput(1, 4);

      if (input == 1) {
        System.out.println("\nDisplaying the unsorted roster.");
        r.display();
      }

      else if (input == 2) {
        System.out.println("\nDisplaying the roster sorted by goals.");
        Roster.sortedByGoals = true;   // ask the computer to sort the array by goals,
        Roster.sortedByPoints = false; // not by points
        Roster.mergeSort(r.players);
        r.display();
      }

      else if (input == 3) {
        System.out.println("\nDisplaying the roster sorted by points.");
        Roster.sortedByGoals = false;
        Roster.sortedByPoints = true;
        Roster.mergeSort(r.players);
        r.display();
      }

      else {
        programEnds = true;
        System.out.println("\nProgram exited.");
      }
    }
  }
}