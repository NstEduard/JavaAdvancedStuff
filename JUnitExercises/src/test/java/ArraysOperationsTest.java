import Calculator.ArraysOperations;
import org.junit.Test;

public class ArraysOperationsTest {

    ArraysOperations arraysOperations = new ArraysOperations();

    @Test
    public void calcLengthTest() {
        int[] numbers = {2, 4, 9, 3, 8};
        int result = arraysOperations.calcLength(numbers);
        assert result == 5;
    }

    @Test
    public void returnNumbersBiggerThenTest() {
        int[] numbers = {2, 4, 9, 3, 8};
        int result = arraysOperations.returnNumbersBiggerThen(numbers);
        assert result == 2;
    }
}
