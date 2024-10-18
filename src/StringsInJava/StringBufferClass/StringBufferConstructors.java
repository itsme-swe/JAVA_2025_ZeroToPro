package StringsInJava.StringBufferClass;

public class StringBufferConstructors {
  public static void main(String[] args) {

    // StringBuffer constructors
    StringBuffer sb = new StringBuffer();

    StringBuffer sb1 = new StringBuffer("Harsh");

    StringBuffer sb2 = new StringBuffer(100);

    System.out.println(sb.capacity()); // output: 16 ⇒ Use to know how many character can be stored inside StringBuffer

    System.out.println(sb1.capacity()); // output: 21 ⇒ bcoz default capacity is 16 and now when we passed the string it
                                        // will add defualt capacity + length of string.

    System.out.println(sb2.capacity()); // 100 bcoz we set the capacity by our own.
  }
}
