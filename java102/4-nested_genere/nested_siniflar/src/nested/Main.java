package nested;

public class Main {
    public static void main(String[] args) {
        // Nested Class
        //      1 - Inner Nested Class
        //          - static
        //          - non-static
        //      2 - Local Class
        //      3 - Anonymus Class

        Out o = new Out();
        o.run();
        System.out.println("- - - - - - ");
        Out.In in = o.new In();
        in.run();
        System.out.println("- - - - - - ");
        Out.StaticIn.run();
        System.out.println("- - - - - - ");
        Local l = new Local();
        l.run();
        System.out.println("- - - - - - ");
        Anonim a = new Anonim(){
            @Override
            public void run(){
                System.out.println(this.a);
                System.out.println("Override edilmiş run metodu çalıştı");
            }
        };
        a.run();


    }
}
