package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;
//Unit Test for Class A
public class AUnitTest {
 @Test
 public void testAWithStub() {
     BStub bStub = new BStub();
     A a = new A(bStub);
     String result = a.process("");
     assertEquals("H", result);
 } }