/*
🍁 Calculate the area of triangle.
 */

package BasicsOfJava;

import java.util.Scanner;

public class PracticeQues_AreaOftriangle {
  public static void main(String[] args) {

    float base;
    float height;
    float area;

    System.out.println("Enter the base and height");

    try (Scanner sc = new Scanner(System.in)) {
      base = sc.nextFloat();
      height = sc.nextFloat();
    }

    area = base * height / 2;

    System.out.println("Area of triangle is " + area);

  }
}
