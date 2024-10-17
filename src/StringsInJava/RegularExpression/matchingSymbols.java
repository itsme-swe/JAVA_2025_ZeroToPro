package StringsInJava.RegularExpression;

public class matchingSymbols {
  public static void main(String[] args) {

    String str1 = "a";
    String str2 = "ace";

    String str3 = "d";
    String str4 = "ab";

    System.out.println(str1.matches(".")); // true bcoz '.' is for any single symbol
    System.out.println(str2.matches(".")); // false

    System.out.println(str3.matches("[abc]")); // false bcoz [abc] stands for any single char from either a or b or c
                                               // other than these all will be false.
    System.out.println(str4.matches("[abc]")); // false bcoz str4 refering to double digits.

    System.out.println(str3.matches("[^abc]")); // true bcoz str3 refers to symbol 'd' and [^abc] means any char other
                                                // than abc.
  }
}

/*
 * 🍁 Matching Symbols only supports single symbol
 */
