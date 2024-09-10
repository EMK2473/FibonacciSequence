package FibonacciSequence;

import java.util.Scanner;

public class FibonacciSequence {
   
   public static int fibonacci(int n) {
    int prevInt = 0;
    int currentInt = 1;
    
    if (n < 0) {
        return -1;
    }
    if (n <= 1) {
        return n;
    }

    for(int i = 2; i <= n; ++i) {
        int fib = prevInt + currentInt;
        prevInt = currentInt;
        currentInt = fib;    
    }
    return currentInt;    
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
      scnr.close();
   }
}