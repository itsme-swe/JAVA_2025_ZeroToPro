package MethodsInJava;

public class VariableArgs {
  public static void main(String[] args) {

    show();
    show(10, 20, 30);
    System.out.print("Anonymous array: ");
    show(new int[] { 50, 40, 30, 20, 10 });

  }

  public static void show(int... x) {

    for (int ele : x) {
      System.out.print(ele + " ");
    }
    System.out.println();
  }
}
