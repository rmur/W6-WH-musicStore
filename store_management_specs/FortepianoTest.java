import static org.junit.Assert.*;
import org.junit.*;
import store_management.*;

public class FortepianoTest {

Fortepiano fortepiano;

@Before
public void before(){
  fortepiano = new Fortepiano("Grand", 88);
}

@Test
public void testFortepiano(){
  assertEquals("Grand", fortepiano.returnType());
} 

@Test
public void testKeyNumbers(){
  assertEquals(88, fortepiano.returnKeys());
}

}