package StringsInJava.StringMethods;

public class startsWithMethod {
  public static void main(String[] args) {

    String name = "My name is Harsh";

    System.out.println(name.startsWith("name")); // The output will be false bcoz string is not starting with word
                                                 // "name".

    System.out.println(name.endsWith("h")); // The output will be true bcoz string ends at letter "h".
  }
}
