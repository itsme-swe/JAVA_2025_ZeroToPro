package StringsInJava.StringBufferClass.BufferClassMethods;

public class TrimToSizeMethod {
  public static void main(String[] args) {

    StringBuffer sb = new StringBuffer("Hello Java World");

    System.out.println(sb.capacity()); // output: 32

    sb.trimToSize(); // Reduces the capacity of the StringBuffer to the current length.

    System.out.println(sb.capacity()); // output: 16
  }
}
