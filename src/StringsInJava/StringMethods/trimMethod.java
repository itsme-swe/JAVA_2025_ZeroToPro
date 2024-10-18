package StringsInJava.StringMethods;

import java.util.Scanner;

public class trimMethod {
  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter your name:      ");

      String name = sc.nextLine().trim(); // Here this trim() method will remove all the leading and trailing spaces.

      System.out.println(name);
    }
  }
}
