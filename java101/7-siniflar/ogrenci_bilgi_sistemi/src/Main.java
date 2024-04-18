public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Birdesen Oge", "MTH", "5548302292");
        Teacher t2 = new Teacher("Egehan Oge", "MSC", "5062094232");

        Course math = new Course("Math", "001", "MTH", 0.8);
        Course msc = new Course("Music", "002", "MSC", 0.3);
        Course phy = new Course("Physics", "003", "PHY",0.7);


        Student s1 = new Student("Birde", "001", "4", math, msc, phy);
        Student s2 = new Student("Ege", "002", "3", math, msc, phy);
        s1.addBulkExamNote(0, 100, 0,100,0,100);
        s1.isPass();





    }
}
