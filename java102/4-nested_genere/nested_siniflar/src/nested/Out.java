package nested;
// outer class
public class Out {
    public int a = 5;

    // inner class
    public class In{
        public int a = 10;

        public void run(){
            int a = 1;
            System.out.println(a);
            System.out.println(this.a);
        }

    }
    public static class StaticIn{
        public static int a = 10;

        public static void run(){
            int a = 1;
            System.out.println(a);
            System.out.println(StaticIn.a);
        }
    }
    public void run(){
        In in = new In();
        in.run();
    }
}
