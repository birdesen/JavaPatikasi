public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Muhammed Ali", 10, 100, 90, 30);
        Fighter f2 = new Fighter("Mark Tyson", 9, 100, 99, 20);

        Match match = new Match(f1, f2, 80, 100);

        match.run();
    }
}
