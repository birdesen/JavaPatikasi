package hRankPriorityQueueList;

import java.util.*;

//Create the Student and Priorities classes here.
class Student {
    private int id;
    private String name;
    private double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getCGPA() {
        return this.cgpa;
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {
        List<Student> students = new ArrayList<Student>();
        for (int i = 0; i < events.size(); i++) {
            String[] event = events.get(i).split(" ");
            if (event[0].equals("ENTER")) {
                students.add(new Student(Integer.valueOf(event[3]), event[1], Double.valueOf(event[2])));
            } else {
                Collections.sort(students, new StudentComparetor());
                if (students.size() > 0) {
                    students.remove(0);
                }
            }
        }
        return students;
    }
}

class StudentComparetor implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.getCGPA() == s2.getCGPA()) {
            if (s1.getName().compareTo(s2.getName()) == 0) {
                return s1.getID() - s2.getID();
            } else {
                return s1.getName().compareTo(s2.getName());
            }
        } else {
            return Double.compare(s2.getCGPA(), s1.getCGPA());
        }
    }
}

public class Main {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}
