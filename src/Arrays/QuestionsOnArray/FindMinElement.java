package Arrays.QuestionsOnArray;

public class FindMinElement {
  public static void main(String[] args) {

    int[] arr = { 10, 20, 30, -5, 50 };

    int min = Integer.MAX_VALUE;

    for (int i : arr) {
      if (i < min) {
        min = i;
      }
    }
    System.out.print("The minimum value in array is: " + min); // output: -5
  }
}
