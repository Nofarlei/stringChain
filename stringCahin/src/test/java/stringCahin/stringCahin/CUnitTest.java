/*
    Commit note:
    Unit test for class C.
    Purpose:
    - Validate that C adds the character 'L'.
    - Use DStub to isolate C from the rest of the chain.
*/

package stringCahin.stringCahin;

import static org.junit.Assert.*;
import org.junit.Test;

public class CUnitTest {

    @Test
    public void testC_AddsL() {
        // Arrange – use DStub instead of real D
        DStub dStub = new DStub();
        C c = new C(dStub);

        // Act
        String result = c.process("HE");

        // Assert – expected: "HEL"
        assertEquals("HEL", result);
    }
}
