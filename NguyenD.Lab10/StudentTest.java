/*
   Name: Daniel Nguyen
   Teacher: Mr. Guglielmi
   Date: 24/4/2024
   Description: This class tests for the functionality of each method in the Student class
*/

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class StudentTest {

   Student s;
   int[] m = new int[] {92, 93, 96};

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
      this.s = new Student("James", 10, m);
   }


   /** A test that always fails. **/
   @Test 
   public void gradeTest() {
      s.nextGrade();
      Assert.assertEquals(s.grade, 11);

   }
   
   @Test
   public void averageTest() {
      Assert.assertEquals(s.computeAverage(), 93);
   }
   
   @Test
   public void markTest() {
      Assert.assertEquals(s.getMark(0), 92);
   }
   
   @Test
   public void updateMarkTest() {
      s.updateMark(93, 0);
      Assert.assertEquals(m[0], 93);
   }
}
