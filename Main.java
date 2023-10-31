
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Иванов", "Иван", "Иванович", 1, 4);
        Student student2 = new Student("Петров", "Петр", "Петрович", 2, 4);
        Student student3 = new Student("Николаев", "Николай", "Николаевич", 3, 4);
        Student student4 = new Student("Иванова", "Ольга", "Ивановна", 4, 4);
        Student student5 = new Student("Петрова", "Екатерина", "Петровна", 5, 4);
        Student student6 = new Student("Николаева", "Светлана", "Николаевна", 6, 5);
        Student student7 = new Student("Смирнов", "Константин", "Константинович", 7, 4);
        Student student8 = new Student("Зайцева", "Елена", "Сергеевна", 8, 5);
        Student student9 = new Student("Алексеев", "Алексей", "Алексеевич", 9, 5);
        Student student10 = new Student("Морозова", "Нина", "Владимировна", 10, 4);

        Steam group1 = new Steam(101);
        group1.addStudent(student1);
        group1.addStudent(student2);
        System.out.println(group1);

        Steam group2 = new Steam(102);
        group2.addStudent(student3);
        group2.addStudent(student4);
        group2.addStudent(student5);
        System.out.println(group2);

        Steam group3 = new Steam(103);
        group3.addStudent(student6);
        group3.addStudent(student7);
        group3.addStudent(student8);
        System.out.println(group3);

        Steam group4 = new Steam(104);
        group4.addStudent(student9);
        group4.addStudent(student10);
        System.out.println(group4);

        Controller stream1 = new Controller(1);
        stream1.addGroup(group1);
        stream1.addGroup(group2);
        stream1.addGroup(group4);

        Controller stream2 = new Controller(2);
        stream2.addGroup(group4);

        List<Controller> streamsList = new ArrayList<>();
        streamsList.add(stream1);
        streamsList.add(stream2);
        System.out.println(streamsList);
        System.out.println("Отсортированный список по количеству групп в потоках");
        StreamServis streamService = new StreamServis();
        streamService.sort(streamsList);
        System.out.println(streamsList);
    }
}
