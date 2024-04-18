public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int noteSoz;
    double oran;

    Course(String name, String code, String prefix, double oran ) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.noteSoz = 0;
        this.oran = oran;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("öğretmenin branşı ve dersin prefixi uyuşmamaktadır.");
        }

    }


    void printTeacherInfo() {
        this.teacher.print();

    }

}
