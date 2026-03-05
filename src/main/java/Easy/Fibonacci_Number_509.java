package Easy;

public class Fibonacci_Number_509 {
    public int fib(int n) {
      if(n<=1)
    return n;
    return fib(n-2)+fib(n-1);
    }
}
