import static org.junit.Assert.*;
import org.junit.*;
import store_management.*;

public class GuitarTest {

Guitar guitar;

@Before
public void before(){
  guitar = new Guitar("Fender", 7);
}

@Test
public void testFGuitarName(){
  assertEquals("Fender", guitar.getName());
} 

@Test
public void testStringsNumber(){
  assertEquals(7, guitar.getStrings());
}

}