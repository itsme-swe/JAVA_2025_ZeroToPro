package MethodsInJava;

public class MethodCreation {
  public static void main(String[] args) {

    callMyName();

    int result = getSum(10, 20);
    System.out.println("The sum of a and b is: " + result);
  }

  public static void callMyName() {
    System.out.println("Harsh Mehra");
  }

  public static int getSum(int a, int b) {
    int sum = a + b;
    return sum;
  }

}

/*
 * output:
 * Harsh Mehra
 * The sum of a and b is: 30
 */
