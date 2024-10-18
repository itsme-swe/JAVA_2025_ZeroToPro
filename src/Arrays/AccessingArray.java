package Arrays;

public class AccessingArray {
  public static void main(String[] args) {

    int[] arr = { 20, 30, 40, 50, 60 };

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    System.out.println(arr.length); // output: 5
  }
}

// ".length" is the property used to find the elements present in array.
