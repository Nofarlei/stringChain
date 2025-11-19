/*
 Commit note:
 System test for the full chain A → B → C → D → E.
 Purpose:
 - Validate the full end-to-end behavior using all real classes.
 - No stubs are used in these tests.
*/

package stringCahin.stringCahin;

import static org.junit.Assert.*;
import org.junit.Test;

public class systemTest {

    @Test
    public void testFullChain_ABCD() {
        // Arrange – create the real chain: A → B → C → D
        D realD = new D();
        C realC = new C(realD);
        B realB = new B(realC);
        A realA = new A(realB);

        // Act – start the chain with empty prefix
        String result = realA.process("");

        // Assert – expected final string
        // A adds "H"
        // B adds "E"
        // C adds "L"
        // D adds "LO"
        // Final: "HELLO"
        assertEquals("HELLO", result);
    }

    @Test
    public void testFullChain_WithPrefixX() {
        // Arrange – create the full real chain: A → B → C → D → E
        E realE = new E();
        D realD = new D(realE);
        C realC = new C(realD);
        B realB = new B(realC);
        A realA = new A(realB);

        // Act – start the chain with prefix "X"
        String result = realA.process("X");

        // Assert – expected: "XHELLO"
        assertEquals("XHELLO", result);
    }

    @Test
    public void testFullChain_WithPrefixHI() {
        // Arrange – create the full real chain: A → B → C → D → E
        E realE = new E();
        D realD = new D(realE);
        C realC = new C(realD);
        B realB = new B(realC);
        A realA = new A(realB);

        // Act – start with "HI"
        String result = realA.process("HI");

        // Assert – expected: "HIHELLO"
        assertEquals("HIHELLO", result);
    }
}
