package StringsInJava.StringBufferClass.BufferClassMethods;

public class Replacemethod {
  public static void main(String[] args) {

    StringBuffer sb = new StringBuffer("Hello Python World");

    sb.replace(6, 12, "Java");

    System.out.println(sb); // output: Hello Java World

    sb.delete(6, 10);

    System.out.println(sb); // output: Hello World
  }
}
