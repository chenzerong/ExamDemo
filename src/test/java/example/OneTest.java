package example;

import static org.junit.Assert.*;
import org.junit.Test;

public class OneTest {
  @Test
  public void testFoo() throws Exception {
    One one = new One();
    //Test foo
    System.out.println(111);
    assertEquals("foo", one.foo());
  }

}