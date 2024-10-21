package OOPs.StudentClass;

public class Student {

  public int rollNo;
  public String name;
  public String course;
  public int marks1, marks2, marks3;

  public int total() {
    return marks1 + marks2 + marks3;
  }

  public float average() {
    return (float) total() / 3;
  }

  public char grade() {
    if (average() >= 60) {
      return 'A';
    } else {
      return 'B';
    }
  }

  public String details() {
    return "RollNum: " + rollNo + "\n" + "StudentName: " + name + "\n" + "Course: " + course + "\n";
  }

}
