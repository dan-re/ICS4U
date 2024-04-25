/*
Author: Mr. Guglielmi, Daniel Nguyen
Date: 25/03/2024
Description: A class that contains the skating roster for a hockey team and the sorting algorithm that put every element in place
*/

import java.util.Scanner;
import java.io.*;

public class Roster {

  HockeyPlayer players[];

  Roster() { // to simplify for this program:
    players = new HockeyPlayer[18]; // a hockey team will always have 18 skaters on the roster
  }

  Roster(String f) {
    players = new HockeyPlayer[18];
    loadRoster(f);
  }

  // utility method to load players from a file
  private void loadRoster(String filename) {
    Scanner s;
    File f;
    try {
      f = new File(filename);
      s = new Scanner(f);

      for (int i = 0; i < 18; i++) {
        String line = s.nextLine();
        String temp[] = line.split(",");
        // file format: name, goals, assists
        this.players[i] = new HockeyPlayer(temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2]));
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    return;
  }

  public void display() {
    // display the roster using the player to string methods
    for (HockeyPlayer i : players) {
      System.out.println(i.toString());
    }
    return;
  }

  // insert assignment methods below this point

   // use merge sort as the sorting algorithm. 
   // the method passes an array of type HockeyPlayer as the parameter
  public static void mergeSort(HockeyPlayer[] arr) {
    int n = arr.length;
    int mid = n / 2;
    HockeyPlayer[] l = new HockeyPlayer[mid];
    HockeyPlayer[] r = new HockeyPlayer[n - mid];

    if (n < 2) {
      return;
    }

    for (int i = 0; i < mid; i++) {
      l[i] = arr[i];
    }

    for (int j = mid; j < n; j++) {
      r[j - mid] = arr[j];
    }

    mergeSort(l);
    mergeSort(r);
    merge(arr, l, r);
  }

   // use variables to help keep track of when to sort the array by goals or by points
  static boolean sortedByGoals = false;
  static boolean sortedByPoints = false;
  
  private static void merge(HockeyPlayer[] arr, HockeyPlayer[] l, HockeyPlayer[] r) {
    int left = l.length;
    int right = r.length;
    int i = 0, j = 0, k = 0;

    while (sortedByGoals == true && i < left && j < right) {
      if (l[i].getGoals() <= r[j].getGoals()) {
        arr[k++] = l[i++];
      } else {
        arr[k++] = r[j++];
      }
    }

    while (sortedByPoints == true && i < left && j < right) {
      if (l[i].getPoints() <= r[j].getPoints()) {
        arr[k++] = l[i++];
      } else {
        arr[k++] = r[j++];
      }
    }

    while (i < left) {
      arr[k++] = l[i++];
    }

    while (j < right) {
      arr[k++] = r[j++];
    }
  }
}