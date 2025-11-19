/*
    Commit note:
    System test for full chain A → B → C → D.
    Purpose:
    - Validate the full end-to-end behavior with real classes.
    - No stubs are used in this test.
*/

package stringCahin.stringCahin;

import static org.junit.Assert.*;
import org.junit.Test;

public class systemTest {

    @Test
    public void testFullChain_ABCD() {
        // Arrange – create real chain A → B → C → D
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
}
