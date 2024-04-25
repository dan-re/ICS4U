/*
   Name: Daniel Nguyen
   Teacher: Mr. Guglielmi
   Date: 24/4/2024
   Description: This class tests for the functionality of each method in the Validator class
*/

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class ValidatorTest {

   Validator v;

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
      this.v = new Validator(330);
   }


   /** A test that always fails. **/
   @Test 
   public void evenTest() {
      Assert.assertTrue(v.isEven());
   }
   
   @Test 
   public void divisibilityTest() {
      Assert.assertTrue(v.isDivisible(30));
   }
   
   @Test
   public void guessTest() {
      Assert.assertTrue(v.guessNumber(330));
   }
   
   @Test
   public void powerTest() {
      Assert.assertEquals(v.getPower(2), 108900);
   }
}
