package StringsInJava.StringMethods;

public class replaceMethod {
  public static void main(String[] args) {

    String carName = "Rokx";

    String newCarName = carName.replace('k', 'x'); // Need to store in new ref. bcoz method returns new string.

    System.out.println(newCarName); // output: Roxx
  }
}
