/*
 * Write a function to print ypur name "N" number of times.
 */
package MethodsInJava;

import java.util.Scanner;

public class PrintNameFunc {
  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {

      System.out.print("Enter the value of n: ");

      int n = sc.nextInt();

      printName(n);
    }
  }

  public static void printName(int n) {

    for (int i = 0; i < n; i++) {
      System.out.println(i + " : " + "My name is Harsh");
    }
  }
}
