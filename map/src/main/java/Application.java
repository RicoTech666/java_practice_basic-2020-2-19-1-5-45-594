import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) {
        Student stu1 = new Student("Linda", 18);
        Student stu2 = new Student("Cindy", 19);
        Student stu3 = new Student("Mary", 19);
        List<Student> studentList1 = new ArrayList<>();
        List<Student> studentList2 = new ArrayList<>();
        studentList1.add(stu1);
        studentList2.add(stu2);
        studentList2.add(stu3);

        Map<Integer, List<Student>> students = new HashMap<>();
        students.put(stu1.getAge(), studentList1);
        students.put(stu2.getAge(), studentList2);

        System.out.println("Before adding new students:");
        Teacher teacher = new Teacher("Bob", students);

        teacher.printStudentInfo();

        teacher.addStudent(new Student("Ben", 19));
        teacher.addStudent(new Student("Solider", 20));

        System.out.println("After adding new students: ");
        teacher.printStudentInfo();
    }

}
