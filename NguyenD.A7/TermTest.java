/*
Name: Daniel Nguyen
Teacher: Mr. Guglielmi
Date: 25/4/2024
Description: This class tests for the functionality of each method in the Term class
*/

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class TermTest {

   Term t;
   Term temp;

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
      this.t = new Term(2, 2);
   }


   /** A test that always fails. **/
   @Test 
   public void isGreaterTest() {
      this.temp = new Term(2, 1);
      Assert.assertTrue(t.isGreater(temp));
   }
   
   @Test
   public void evaluateTest() {
      Assert.assertEquals(t.evaluate(2), 8);
   }
   
   @Test
   public void toStringTest() {
      Assert.assertEquals(t.toString(), "2x^2");
   }
   
   @Test
   public void getCoeffTest() {
      Assert.assertEquals(t.getCoeff(), 2);
   }
   
   @Test
   public void getExpTest() {
      Assert.assertEquals(t.getExp(), 2);
   }
}
