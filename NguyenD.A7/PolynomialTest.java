import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class PolynomialTest {

   Polynomial p;
	Term t[] = {new Term (2, 1), new Term (0, 2)};

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
      this.p = new Polynomial(t);
   }


   /** A test that always fails. **/
   @Test 
   public void evaluateTest() {
      Assert.assertEquals(p.evaluate(1), 2);
   }
   
   /*
   @Test
   public void sortPoliTest() {
      p.sortPoli();
      Assert.assertArrayEquals(p.terms, t);
   }
   */
   
   @Test
   public void toStringTest() {
      Assert.assertEquals(p.toString(), "0x^2 + 2x^1 ");
   }
   
   @Test
   public void getOrderTest() {
      Assert.assertEquals(p.getOrder(), 2);
   }
   
   @Test
   public void addTermTest() {
      Term temp = new Term(2, 3);
	   Term t[] = {new Term (2, 1), new Term (0, 2)};
      p.addTerm(temp);
      Assert.assertEquals(t[], p[]);
   }
}
