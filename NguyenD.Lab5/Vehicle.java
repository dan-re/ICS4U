/*
   Author: Daniel Nguyen
   Date: Mar 7, 2024
   Description: This is an abstract class that creates a general vehicle
*/

public class Vehicle {
   
   protected int size; // The size of the vehicle
   protected String color; // The color of the vehicle
   protected int capacity; // The maximum number of people can be in that vehicle at a time
   
   Vehicle (int i, String s, int j) {
      this.size = i;
      this.color = s;
      this.capacity = j;
   }
   
   public int getSize() {
      return this.size;
   }
   
   public String getColor() {
      return this.color;
   }
   
   public int getCapacity() {
      return this.capacity;
   }
   
   public void setSize(int i) {
      this.size = i;
   }
   
   public void setColor(String s) {
      this.color = s;
   }
   
   public void setCapacity(int j) {
      this.capacity = j;
   }
}