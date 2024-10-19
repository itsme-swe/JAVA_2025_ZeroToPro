package Arrays;

import java.util.Scanner;

public class MultiDimensionalArray {
  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {

      int[][] arr = new int[4][3];

      System.out.println("Enter the elements of 2D array: ");

      for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
          arr[i][j] = sc.nextInt();
        }
      }

      System.out.println("The elements in 2D array are: ");

      for (int temp[] : arr) {
        for (int ele : temp) {
          System.out.print(ele + " ");
        }
        System.out.println();
      }
    }

  }
}
