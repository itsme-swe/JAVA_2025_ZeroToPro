package StringsInJava.StringMethods;

public class charAtMethod {
  public static void main(String[] args) {

    String str = "www.google.com";

    System.out.println(str.charAt(4)); // output: 'g'⇒ Need to pass index value to see the char present at index value.

    System.out.println(str.indexOf("o")); // output: '5'⇒ Method return the index value of char.

    System.out.println(str.lastIndexOf("o")); // output: 12 ⇒
  }
}
