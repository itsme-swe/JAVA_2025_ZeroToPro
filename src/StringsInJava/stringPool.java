package StringsInJava;

public class stringPool {
  public static void main(String[] args) {

    String str1 = "JAVA";
    String str2 = "JAVA";

    String str3 = new String("JAVA");

    System.out.println(str1 == str2); // output: true

    System.out.println(str2 == str3); // output: false bcoz str3 object is created inside heap memory.
  }
}

/*
 * The output is true because two different references holding same object
 * inside String Constant Pool. If objects are same java donot create new object
 * it redirect the new reference to the existing object only.
 */