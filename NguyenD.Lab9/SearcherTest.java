import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class SearcherTest {

   MyClass c;

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   c = new MyClass();
   }


   /** A test that always fails. **/
   @Test public void defaultTest() {
      Assert.assertEquals(c.sum(0, 1), 2);
   }
}
