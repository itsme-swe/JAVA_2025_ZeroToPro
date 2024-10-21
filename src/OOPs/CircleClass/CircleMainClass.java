package OOPs.CircleClass;

public class CircleMainClass {
  public static void main(String[] args) {

    // Creating an object of the class "Circle"
    Circle c1 = new Circle();

    c1.radius = 7;

    System.out.println("Area: " + c1.area()); // Prints the area of the circle

    System.out.println("Perimeter: " + c1.perimeter());

    System.out.println("Circumference: " + c1.circumference());

  }
}
