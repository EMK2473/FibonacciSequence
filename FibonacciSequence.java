package FibonacciSequence;

import java.util.Scanner;

public class FibonacciSequence {
   
   public static int fibonacci(int n) {
      /* Type your code here. */       
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
   }
}