package Arrays.QuestionsOnArray;

import java.util.Scanner;

public class SumOfValues {
  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {

      System.out.print("Enter the size of an array: ");
      int n = sc.nextInt();

      int[] arr = new int[n];

      System.out.print("Enter the elements of an array: ");

      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      System.out.print("The sum of array elements is: ");

      int sum = 0;

      for (int ele : arr) {
        sum += ele;
      }

      System.out.println(sum);
    }
  }
}

// output : The sum of array elements is: 15
