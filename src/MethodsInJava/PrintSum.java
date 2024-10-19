/*
 * Write a function to print sum from 1 to n.
 */
package MethodsInJava;

import java.util.Scanner;

public class PrintSum {
  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {

      System.out.print("Enter the value of n: ");

      int n = sc.nextInt();

      printSum(n);

    }
  }

  public static void printSum(int n) {

    int sum = 0;

    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    System.out.println("Printing sum: " + sum);
  }
}
