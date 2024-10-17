package StringsInJava.StringMethods;

public class valueOfMethod {
  public static void main(String[] args) {
    char[] name = { 'H', 'A', 'R', 'S', 'H' };

    int age = 32;

    float weight = 70.5f;

    String newName = String.valueOf(name); // Method use to convert any data type into string.
    System.out.println(newName);

    String myAge = String.valueOf(age);
    System.out.println(myAge);

    String weigh = String.valueOf(weight);
    System.out.println(weigh);

    // verifying the data type whether belongs to string or not
    if (newName instanceof String) {
      System.out.println("It's an String");
    }

    if (myAge instanceof String) {
      System.out.println("Yes it's an String");
    }

    if (Integer.valueOf(age) instanceof Integer) {
      System.out.println("Yes its an Integer");
    }
  }
}
