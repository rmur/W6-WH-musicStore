import static org.junit.Assert.*;
import org.junit.*;
import store_management.*;

public class PianoTest {

Piano piano;

@Before
public void before(){
  piano = new Piano("Grande", "FirstPiano");
}

@Test
public void testName(){
  assertEquals("FirstPiano", piano.getName());
} 

@Test
public void testPianoType(){
  assertEquals("Grande", piano.getType());
}

}