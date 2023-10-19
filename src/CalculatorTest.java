import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testConversion() {
        // Тестирование базовых математических выражений
        assertEquals(5.0, Calculator.conversion("2 + 3"), 0.001);
        assertEquals(8.0, Calculator.conversion("4 * 2"), 0.001);
        assertEquals(3.0, Calculator.conversion("9 - 6"), 0.001);
        assertEquals(2.0, Calculator.conversion("8 / 4"), 0.001);

        // Тестирование математических выражений со скобками
        assertEquals(9.0, Calculator.conversion("(3 + 4) * 2 - 5"), 0.001);

        // Тестирование математических выражений с десятичными дробями
        assertEquals(6.5, Calculator.conversion("2.5 + 4"), 0.001);
        assertEquals(2.0, Calculator.conversion("15 / 7.5"), 0.001);

        // Тестирование сложных математических выражений
        assertEquals(13.0, Calculator.conversion("2 * (3 + 4) - 3 / (1 + 2)"), 0.001);
    }
}