/*
    הערת Commit:
    בדיקת אינטגרציה בין B → C.
    בוצע שימוש ב־DStub כדי לבודד את B ו־C ללא המשך השרשרת.
*/

package stringCahin.stringCahin;

import static org.junit.Assert.*;
import org.junit.Test;

public class Integration_B_CTest {

    @Test
    public void testIntegration_BtoC_withDStub() {
        // Arrange – מציבים DStub במקום D האמיתי
        DStub dStub = new DStub();     // מחליף את D
        C realC = new C(dStub);        // C אמיתי
        B realB = new B(realC);        // B אמיתי

        // Act – מפעילים את B
        String result = realB.process("H");

        // Assert:
        // B אמור להוסיף 'E' → HE
        // C אמור להוסיף 'L' → HEL
        assertEquals("HEL", result);
    }
}
