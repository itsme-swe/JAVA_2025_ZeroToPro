package OOPs.DataHiding;

public class Rectangle {

  // hiding data by using "private" keyword
  private int length;
  private int breadth;

  public int getLength() {
    return length;
  }

  public void setLength(int l) {

    if (l > 0) {
      length = l;
    } else {
      length = 0;
    }
  }

  public int getBreadth() {
    return breadth;
  }

  public void setBreadth(int b) {

    if (b > 0) {
      breadth = b;
    } else {
      breadth = 0;
    }
  }

  public double area() {
    return length * breadth;
  }
}
