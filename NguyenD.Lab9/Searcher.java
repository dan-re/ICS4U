import java.util.Random;

/**
  This class implements several searching algorithms
  @author Mr. Guglielmi
  @version 1.0
*/
public class Searcher{

  /**
  The data going to be searched
  */
  int[] data;


  /**
  Constructor with a pre-existing array
  @param d an integer array to be read
  */
  Searcher (int[] d){
    this.data = d;
  }

  /**
  Constructor with a desired array size -- will be filled with random numbers
  @param n an integer that determines the array length
  */
  Searcher (int n){
    this.data = new int [n];
    Random r = new Random();

    for (int i = 0; i < this.data.length; i++){
      this.data[i] = r.nextInt(500);
    }
  }

  /**
  A linear search for a key value
  @param key an integer going to be searched for in the data
  @return returns the index of where the key is found
  */
  public int search (int key){
    int index = -1;
    int i = 0;
    do {
      if (this.data[i] == key){ //if the data is found
        index = i; //set the index
      }
      i++;

    }while(i < this.data.length && index == -1); //loop until data is found or the end of the list is reached
    return index; //return the index of the value. If not found, -1 will be returned
  }


  /**
  A binary search for a key value
  @param key an integer going to be searched for in the data
  @return returns the index of where the key is found
  */
  public int binarySearch(int key){
    sort(); //make sure the array is sorted. 

    int l = 0, r = this.data.length - 1; //set left and right for the subarray
    while (l <= r){
      int m = l + (r - l) /2; //find the middle index

      if (this.data[m] == key){ // if the middle index is the key, return the index
        return m;
      }

      if (this.data[m] < key){ //if the midpoint is less than the key, drop the lower half
        l = m + 1;
      }
      else {
        r = m - 1; //otherwisem drop the upper half
      }
    }
    return -1; //if value is not found
  }

  //=============================
  //Sorting methods 

  /**
  Sort the data currently in the instance by using comb sort
  */
  public void sort(){
    int n = this.data.length; //get the length

    int gap = n; //start the gap being the size of the array

    boolean swapped = true; //flag for if elements have swapped

    //while we're not at a gap of 1 and swaps have been made
    while (gap != 1 || swapped){

      gap = nextGap(gap); //get the next gap value

      swapped = false; //set the swapped flag

      for (int i = 0; i < n-gap; i++){ //iterate through the array by the gap size
        if (data[i] > data[i + gap]){ //if the current element is larger than the element 1 gap ahead 
          swap (data, i, i+gap); //swap them
          swapped = true;
        }
      }
    }


  }
  /**
  utility method for calculating the gap size
  @param g an integer that represents the gap size
  @return the size of the following gap
  */
  private int nextGap (int g){
    g = (g*10)/13; //calculate the gap shrink factor (1.3)
    if (g < 1){ //if we're below 1, the gap is 1
      return 1;
    }
    else{
      return g;
    }
  }

  /**
  utility method for swapping elements
  @param a an array of integers where the swap occurs
  @param i an integer whose position is being switched
  @param j an integer whose position is being switched 
  */
  private void swap(int[] a, int i, int j){
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }
  
  private int sum(int i, int j) {
   return i + j;
  }




}