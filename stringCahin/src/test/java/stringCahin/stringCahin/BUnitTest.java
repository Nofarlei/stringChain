/*
    Commit note:
    Unit test for class B.
    Purpose:
    - Validate that B adds the character 'E'.
    - Use CStub to isolate B from the rest of the chain.
*/

package stringCahin.stringCahin;

import static org.junit.Assert.*;
import org.junit.Test;

public class BUnitTest {

    @Test
    public void testB_AddsE() {
        // Arrange – use CStub instead of real C
        CStub cStub = new CStub();
        B b = new B(cStub);

        // Act
        String result = b.process("H");

        // Assert – expected: "HE"
        assertEquals("HE", result);
    }
}
