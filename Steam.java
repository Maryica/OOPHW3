import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Steam implements Iterable<Student> {
    protected int groupNumber;
    protected List<Student> studentList = new ArrayList<>();

    public Steam(int groupNumber) {
        this.groupNumber = groupNumber;
        this.studentList = new ArrayList<>();
    }

    public Steam() {
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void removeStudent(Student student) {
        studentList.remove(student);
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public Iterator<Student> iterator() {
        return studentList.iterator();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("В группе ").append(groupNumber).append(" - ").append(studentList.size()).append(" студентов")
                .append("\n");
        for (Student student : studentList) {
            result.append(student.toString()).append("\n");
        }
        return result.toString();
    }
}