package treeSet;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new OrderNoteComparator());
        // tam tersi sıralamak istersen .reversed() metodunu çağırabilirsin
        students.add(new Student("Ali", 20));
        // Student s1 = new Student("Ali", 30); aynı kod farklı yazılım
        students.add(new Student("Ayşe", 100));
        students.add(new Student("Mustafa", 45));
        students.add(new Student("Damla", 60));
        students.add(new Student("Damla", 60));

        for (Student stu : students) {
            System.out.println(stu.getName());
        }
    }
}
