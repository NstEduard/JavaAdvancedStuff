import java.math.BigInteger;

public class FibonacciSeries {
    public long fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static BigInteger fibonacci(int n) {
        BigInteger[] partialResult = new BigInteger[n+1];
        partialResult[0] = BigInteger.ZERO;
        partialResult[1] = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            partialResult[i] = partialResult[i-1].add(partialResult[i-2]);
        }
        return partialResult[n];
    }
}
