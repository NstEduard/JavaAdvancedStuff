package Calculator;

public class ScientificCalculator extends CalculatorSimple {
    public double atPower(int a, int pow) {
        return Math.pow(a, pow);
    }

    public double sqrRoot(int a) {
        return Math.sqrt(a);
    }
}
