public class BinarySearch {

    public int searchElement(int[] numbers, int element) {

        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (numbers[middle] == element) {
                return middle;
            }
            if (numbers[middle] < element) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
