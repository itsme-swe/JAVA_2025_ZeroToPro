package OOPs.StudentClass;

public class StudentClassMain {
  public static void main(String[] args) {

    Student s1 = new Student();

    s1.rollNo = 1;
    s1.name = "John";
    s1.course = "CS";
    s1.marks1 = 70;
    s1.marks2 = 80;
    s1.marks3 = 65;

    System.out.println("Total Marks: " + s1.total());
    System.out.println("Total average: " + s1.average());
    System.out.println("Detail of student:\n " + s1.details());

  }
}
