package OOPs.CircleClass;

public class CircleMainClass {
  public static void main(String[] args) {

    // Creating an object of the class "Circle"
    Circle c1 = new Circle();

    Circle c2 = new Circle();

    c1.radius = 7;

    c2.radius = 10;

    System.out.println("Area: " + c1.area()); // Prints the area of the circle

    System.out.println("Perimeter: " + c1.perimeter());

    System.out.println("Circumference: " + c1.circumference());

    System.out.println("Area of object c2: " + c2.area());

  }
}
