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
    return n;    
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
      scnr.close();
   }
}