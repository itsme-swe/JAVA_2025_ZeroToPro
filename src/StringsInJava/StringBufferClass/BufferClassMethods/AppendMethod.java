package StringsInJava.StringBufferClass.BufferClassMethods;

public class AppendMethod {
  public static void main(String[] args) {

    StringBuffer sb = new StringBuffer();

    sb.append("Learning Java");
    System.out.println(sb.capacity()); // output will be 16 bcoz StringBuffer object can store 16 char

    sb.append(" Complete");
    System.out.println(sb.capacity()); // Now the output will be 34 bcoz StringBuffer by default double the capacity
                                       // from its default state. And it is calculated in this way "old capacity*2 + 2"

    System.out.println(sb.length()); // output: 22 this is length of string.

  }
}
