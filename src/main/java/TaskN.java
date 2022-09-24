import java.util.Random;

public class TaskN {
  public static void main(String[] args) {
 Student student = new Student("Vovka","55");
 Teacher teacher = new Teacher("Grigory","Algebra");
    System.out.println(student.getGroupName());
    System.out.println(teacher.getSubjectName());
    System.out.println();
    student.printInfo();
    teacher.printInfo();
    System.out.println(student.getName());
    System.out.println(teacher.getName());
  }
}