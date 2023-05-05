import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class SubtractorTest {
    @Test
    void testSubtractWithNegativeResult() {
        Subtractor subtractor = new Subtractor();
        Subtractor.Result expectedResult = Subtractor.Result.NEGATIVE;
        assertEquals(expectedResult,subtractor.subtract(1,4));

    }
    @Test
    void testSubtractWithPositiveResult() {
        Subtractor subtractor = new Subtractor();
        Subtractor.Result expectedResult = Subtractor.Result.POSITIVE;
        assertEquals(expectedResult,subtractor.subtract(4,1));
    }

    @Test
    void testSubtractWithEquality() {
        Subtractor subtractor = new Subtractor();
        Subtractor.Result expectedResult = Subtractor.Result.EQUALITY;
        assertEquals(expectedResult,subtractor.subtract(4,4));
    }
}

