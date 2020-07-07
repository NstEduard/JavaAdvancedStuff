package Calculator;

public class ArraysOperations {
    public int calcLength(int[] numbers) {
        return numbers.length;
    }

    // returns how many numbers are bigger then 5 are in the array
    public int returnNumbersBiggerThen(int[] numbers) {
        int count = 0;
        for (int elements = 0; elements < numbers.length; elements++
        ) {
            if (numbers[elements] > 5) {
                count++;
            }
        }
        return count;
    }
}
