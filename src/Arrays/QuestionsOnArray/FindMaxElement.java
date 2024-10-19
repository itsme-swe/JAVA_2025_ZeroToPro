package Arrays.QuestionsOnArray;

public class FindMaxElement {
  public static void main(String[] args) {

    int[] arr = { -20, -10, -40, -1, -30 };

    int max = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.print("The max element in array is " + max); // output: -1
  }
}
