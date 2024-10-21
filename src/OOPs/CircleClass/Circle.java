package OOPs.CircleClass;

// Class representing a Circle with properties and methods
public class Circle {

  public double radius; // properties or attributes of class

  // methods of class
  public double area() {
    return Math.PI * radius * radius;
  }

  public double perimeter() {
    return 2 * Math.PI * radius;
  }

  public double circumference() {
    return perimeter();
  }
}
