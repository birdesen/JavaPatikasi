public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int noteSoz1, int note2, int noteSoz2, int note3, int noteSoz3) {

        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;

        }
        if (noteSoz1 >= 0 && noteSoz1 <= 100) {
            this.c1.noteSoz = noteSoz1;
        }

        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (noteSoz2 >= 0 && noteSoz2 <= 100) {
            this.c2.noteSoz = noteSoz2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
        if (noteSoz3 >= 0 && noteSoz3 <= 100) {
            this.c3.noteSoz = noteSoz3;
        }
    }

    void isPass() {
        this.average = ((this.c1.note * this.c1.oran) + (this.c1.noteSoz * (1 - this.c1.oran))
                + (this.c2.note * this.c2.oran) + (this.c2.noteSoz * (1 - this.c2.oran))
                + (this.c3.note * this.c3.oran) + (this.c3.noteSoz * (1 - this.c3.oran))) / 3.0;
        printNote();
        System.out.println("Ortalamanız: " + this.average);
        if (this.average > 55) {
            System.out.println("Tebrikler sınıfı geçtiniz");
            this.isPass = true;
        } else {
            System.out.println("Sınıfta kaldınız");
            this.isPass = false;
        }
    }

    void printNote() {
        System.out.println(this.c1.name + " Yazılı Notu : " + this.c1.note);
        System.out.println(this.c1.name + " Sözlü Notu : " + this.c1.noteSoz);
        System.out.println(this.c2.name + " Yazılı Notu : " + this.c2.note);
        System.out.println(this.c2.name + " Sözlü Notu : " + this.c2.noteSoz);
        System.out.println(this.c3.name + " Yazılı Notu : " + this.c3.note);
        System.out.println(this.c3.name + " Sözlü Notu : " + this.c3.noteSoz);
    }


}
