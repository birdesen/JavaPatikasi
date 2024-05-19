public class Main {
    public static void main(String[] args) {

        int a = 20;
        // Integerin üstüne command tuşu ile tıklarsan sınıfa ait metodları görebilirsin
        Integer b = 30;
        String c = "Birdesen";
        String d = b.toString(); // İntegerdan string veriye çevirme
        String e = "10";
        int f = Integer.parseInt(e);

        int x = 10;
        // Autoboxing
        Integer y = x;
        // Boxing : ilkel veri tipini wrapper sınıfa çevirmektir.
        Integer z = Integer.valueOf(x);

        // AutoUnboxing
        int w = z;
        // Unboxing : Wrapper sınıfını ilkel veri tipine çevirmektir.
        int t = z.intValue();
    }
}
