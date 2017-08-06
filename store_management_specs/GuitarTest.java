import static org.junit.Assert.*;
import org.junit.*;
import store_management.*;

public class GuitarTest {

Guitar guitar;

@Before
public void before(){
  guitar = new Guitar("wood", "brown","Fender", 7);
}

@Test
public void testFGuitarName(){
  assertEquals("Fender", guitar.getName());
} 

@Test
public void testStringsNumber(){
  assertEquals(7, guitar.getStrings());
}

@Test 
public void testGuitarColor(){
  assertEquals("brown", guitar.getColor());
}

@Test
public void testGuitarMaterial(){
  assertEquals("wood", guitar.getMaterial());
}
}