import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Teacher {

    private String name;
    private Map<Integer, List<Student>> students;

    public Teacher(String name, Map<Integer, List<Student>> students) {
        this.name = name;
        this.students = students;
    }

    public void addStudent(Student student) {
        int studentAge = student.getAge();
        if (students.containsKey(studentAge)) {
            List<Student> studentList = students.get(studentAge);
            studentList.add(student);
            students.replace(studentAge, studentList);
        } else {
            List<Student> studentList = new ArrayList<>();
            studentList.add(student);
            students.put(studentAge, studentList);
        }
    }

    public void printStudentInfo() {
        System.out.println(students);
    }
}
