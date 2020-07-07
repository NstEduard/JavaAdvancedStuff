import Calculator.CalculatorSimple;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorSimpleTest {
    CalculatorSimple calculatorSimple = new CalculatorSimple();

    @Test
    public void sumTest() {
        System.out.println("Testam adunarea");
        int a = 3;
        int b = 2;
        int result = calculatorSimple.sum(a, b);

        assert result == 5;
    }

    @Test
    public void subtractionTest() {
        int a = 3;
        int b = 2;
        int result = calculatorSimple.subtract(a, b);

        assert result == 1;
    }

    @Test
    public void multiplyTest() {
        int a = 3;
        int b = 2;
        int result = calculatorSimple.multiply(a, b);

        assertEquals(result, 6);
    }

    @Test
    public void divisionTest() {
        int a = 6;
        int b = 2;
        double result = calculatorSimple.division(a, b);

        assert result == 3;
    }
}
