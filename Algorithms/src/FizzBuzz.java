public class FizzBuzz {
    public void fizzBuzz(int n) {
        for (int number = 0; number <= n; number++) {
            if (number % 15 == 0) {
                System.out.println("Fizz Buzz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");
            }else{
                System.out.println(number);
            }
        }
    }
}
