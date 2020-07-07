import Calculator.ScientificCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScientificCalculatorTest {
    ScientificCalculator scientificCalculator = new ScientificCalculator();

    @Test
    public void atPowerTest() {
        int a = 2;
        int pow = 3;

        double result = scientificCalculator.atPower(2, 3);

        assert result == 8;
    }

    @Test
    public void sqrRootTest() {
        int a = 4;

        double result = scientificCalculator.sqrRoot(a);
        assert result == 2;
    }
}
