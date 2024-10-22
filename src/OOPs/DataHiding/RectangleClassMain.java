/*
 * We'll be using 'private' keyword to hide the class properties and to access those properties we will be using 'getter()' and 'setter()' method.
 */

package OOPs.DataHiding;

public class RectangleClassMain {
  public static void main(String[] args) {

    Rectangle r1 = new Rectangle();

    r1.setLength(5);
    r1.setBreadth(10);

    System.out.println("The area of rectangle: " + r1.area());

  }
}
