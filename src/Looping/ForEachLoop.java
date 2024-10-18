package Looping;

public class ForEachLoop {
  public static void main(String[] args) {

    String[] car = { "Volvo", "BMW", "Nexa", "Tata", "Mahindra" };

    for (String ele : car) {
      System.out.print(ele + " "); // Volvo BMW Nexa Tata Mahindra
    }
  }
}
