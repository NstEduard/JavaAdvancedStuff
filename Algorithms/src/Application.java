public class Application {
    public static void main(String[] args) {

        System.out.println("---- Print the greatest common divisor of two numbers ----");
        GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
        System.out.println(greatestCommonDivisor.gcm(16, 30));


        System.out.println("---- Prints the smallest element of an array ----");
        SmallestElement smallestElement = new SmallestElement();
        int[] numbers = new int[]{2, 5, 1, 8, 12, -5};
        System.out.println(smallestElement.smallestNumber(numbers));


        System.out.println("---- Prints Fizz, Buzz or Fizz Buzz if the numbers are divided by 3 ,5 or 15");
        FizzBuzz fizz = new FizzBuzz();
        fizz.fizzBuzz(20);

        System.out.println("---- Print Fibonacci number ----");
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        System.out.println(fibonacciSeries.fib(45));
        long start = System.currentTimeMillis();
        System.out.println(FibonacciSeries.fibonacci(100_000));
        long end = System.currentTimeMillis();
        System.out.println((end - start));

        System.out.println("---- Print index of a given element of an array using BinarySearch ----");
        BinarySearch binarySearch = new BinarySearch();
        int[] num = new int[]{1, 5, 8, 12, 24, 25, 33, 34, 54, 62};
        System.out.println(binarySearch.searchElement(num, 25));

    }
}
