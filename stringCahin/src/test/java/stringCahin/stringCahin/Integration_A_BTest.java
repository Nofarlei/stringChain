/*
    Commit message: fixed integration test A->B
    Explanation:
    - Removed the stray 'tt' text that caused compilation errors.
    - Replaced with the correct integration test using CStub.
*/

package stringCahin.stringCahin;

import static org.junit.Assert.*;
import org.junit.Test;

public class Integration_A_BTest {

    @Test
    public void testIntegration_AtoB_withCStub() {
        // Arrange:
        CStub cStub = new CStub();    // stub replaces C
        B realB = new B(cStub);       // real B
        A realA = new A(realB);       // real A

        // Act:
        String result = realA.process("");

        // Assert:
        assertEquals("HE", result);
    }
}
