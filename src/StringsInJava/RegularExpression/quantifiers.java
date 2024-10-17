package StringsInJava.RegularExpression;

public class quantifiers {
  public static void main(String[] args) {

    String str1 = "abbbcccc";
    String str2 = "acde";

    String name = "Harsh";

    String carName = "Virtus";

    System.out.println(str1.matches("[abc]*")); // true char should be from abc only and '*' means any number of times
    System.out.println(str2.matches("[abc]*")); // flase bcoz char need to be only abc.
    System.out.println(str2.matches("[a-z]*")); // true bcoz any char from a to z

    System.out.println(name.matches("[a-z A-z]{5}")); // true bcoz any char from small letter a to z or capital letter A
                                                      // to Z but length of string should be 5 only. {5} this denotes
                                                      // the length.

    System.out.println(carName.matches("[a-z A-z]{5}")); // false bcoz length exceeds more than 5 letters.

    System.out.println(carName.matches("[a-z A-z]{6}{8}")); // true bcoz carName "Virtus" is of min 6 letters and we can
                                                            // exceed till 8 letters.
  }
}
