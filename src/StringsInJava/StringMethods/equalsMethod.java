package StringsInJava.StringMethods;

public class equalsMethod {
  public static void main(String[] args) {

    String str1 = "JAVA";

    String str2 = "java";

    String str3 = "python";

    String str4 = "python";

    String str5 = new String("java");

    System.out.println(str1.equals(str2)); // Method will return false bcoz cases are different.

    System.out.println(str3.equals(str4)); // Method will return true bcoz cases and content is same.

    System.out.println(str1.equalsIgnoreCase(str2)); // Method will return true only when content is same and it will
                                                     // ignore the cases.

    System.out.println(str2.compareTo(str3));

    System.out.println(str2 == str5); // Output will be false bcoz '==' operator compare references.
  }
}
