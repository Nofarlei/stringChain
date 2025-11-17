package stringCahin.stringCahin;

import static org.junit.Assert.*;
import org.junit.Test;

public class BUnitTest {

    @Test
    public void testBAddsOnlyBAndSendsCorrectPrefixToC() {
        // Arrange
        CStub cStub = new CStub();
        B b = new B(cStub);

        // Act
        String result = b.process("");

        // Assert
       

        // 2. B must return whatever C returns ("BX" from the stub)
        assertEquals("E", result);
    }
}
