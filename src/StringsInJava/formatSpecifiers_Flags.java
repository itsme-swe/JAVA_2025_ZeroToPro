/*
 * (-)  ⇒ Left justify
 * (+)  ⇒ Sign
 * (0)  ⇒ Zero Padding
 * ('') ⇒ Space
 * (,)  ⇒ Grouping Seprator
 * (()  ⇒ Parenthesis 
 */

package StringsInJava;

public class formatSpecifiers_Flags {
  public static void main(String[] args) {
    int num = 20;

    int newNum = -110;

    System.out.printf("Width %10d%n", num); // output: Width 5061992

    System.out.printf("Symbol %+d", newNum); // output: Symbol -110

    System.out.printf("%-5d", newNum);
  }
}
