package StringsInJava.StringBufferClass.BufferClassMethods;

public class toStringMethod {
  public static void main(String[] args) {

    StringBuffer sb = new StringBuffer("Hello World");

    String str = sb.toString();

    System.out.println(str);

    if (str instanceof String) {
      System.out.println("It's an String");
    }
  }
}
