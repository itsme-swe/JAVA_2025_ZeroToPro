package StringsInJava.RegularExpression;

public class metaCharacters {
  public static void main(String[] args) {

    String str1 = "A";
    String str2 = "12";
    String str3 = "5";
    String str4 = "$";

    System.out.println(str1.matches("\\w")); // true bcoz '\w' any alphabet or digit but single symbol only.
    System.out.println(str2.matches("\\w")); // false bcoz there are two symbols
    System.out.println(str3.matches("\\w")); // true

    System.out.println(str1.matches("\\d")); // false bcoz '\d' for any digits not alphabets
    System.out.println(str3.matches("\\d")); // true

    System.out.println(str1.matches("\\D")); // true bcoz '\D' for any alphabet but not for any digit
    System.out.println(str3.matches("\\D")); // false
    System.out.println(str4.matches("\\D"));
  }
}
