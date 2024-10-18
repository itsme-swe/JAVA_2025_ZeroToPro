package StringsInJava.StringBufferClass.BufferClassMethods;

public class ReverseMethod {
  public static void main(String[] args) {

    StringBuffer sb = new StringBuffer("Hello Java");

    sb.reverse();

    System.out.println(sb); // output: avaJ olleH

    sb.deleteCharAt(5);

    System.out.println(sb); // output: avaJ lleH

  }
}
