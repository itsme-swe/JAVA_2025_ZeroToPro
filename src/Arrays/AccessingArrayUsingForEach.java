package Arrays;

import java.util.Scanner;

public class AccessingArrayUsingForEach {
  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {
      int[] arr = new int[5];

      System.out.print("Enter the elements of an array: ");

      // Taking input from user and storing elements in array
      for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
      }

      System.out.println("The elements stored in array are: ");

      // Accessing elements of an array by using for each loop
      for (int ele : arr) {
        System.out.print(ele + " ");
      }
    }
  }
}
