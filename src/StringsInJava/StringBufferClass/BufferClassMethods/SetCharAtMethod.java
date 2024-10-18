package StringsInJava.StringBufferClass.BufferClassMethods;

public class SetCharAtMethod {
  public static void main(String[] args) {

    StringBuffer sb = new StringBuffer("Hello System Degign");

    sb.setCharAt(15, 's');

    System.out.println(sb); // output: Hello System Design
  }
}
