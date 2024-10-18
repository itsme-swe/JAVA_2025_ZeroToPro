package StringsInJava.StringBufferClass.BufferClassMethods;

public class Insertmethod {
  public static void main(String[] args) {

    StringBuffer sb = new StringBuffer("Hello World");

    sb.insert(5, " Java"); // inserting "java" at index value 5.

    System.out.println(sb); // output: Hello Java World
  }
}
