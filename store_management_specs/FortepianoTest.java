import static org.junit.Assert.*;
import org.junit.*;
import store_management.*;

public class FortepianoTest {

Fortepiano fortepiano;

@Before
public void before(){
  fortepiano = new Fortepiano("Oak", "Dark-brown", "Grand", 88);
}

@Test
public void testFortepiano(){
  assertEquals("Grand", fortepiano.returnType());
} 

@Test
public void testKeyNumbers(){
  assertEquals(88, fortepiano.returnKeys());
}

@Test
public void testMaterial(){
  assertEquals("Oak", fortepiano.getMaterial());
}

@Test
public void testColor(){
  assertEquals("Dark-brown", fortepiano.getColor());
}

}