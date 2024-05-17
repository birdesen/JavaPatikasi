import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Macera Oyunun Hoşgeldiniz.");
        System.out.print("Bir isim giriniz: ");
        String name = input.nextLine();
        Player player = new Player(name);
        SafeHouse safeHouse = new SafeHouse(player);
        System.out.println("Hoşgeldin " + player.getName() + "!");
        player.selectChar();

        while (true) {
            player.printPlayerInfo();
            Location location = null;
            System.out.println("- - - - - - - - - - - - - - - BÖLGELER - - - - - - - - - - - - - - -");
            System.out.println("① - Güvenli Ev ➔ Burada güvendesiniz ve canınızı yenileyebilirsiniz");
            System.out.println("② - Eşya Dükkanı ➔ Silah veya zırh alabilirsiniz");
            System.out.println("③ - Mağara ➔ Zombilerle savaşabilir, para ve 'Yemek' kazanabilirsin");
            System.out.println("④ - Orman ➔ Vampirlerle savaşabilir, para ve 'Odun' kazanabilirsin");
            System.out.println("⑤ - Nehir ➔ Ayılarla savaşabilir, para ve 'Su' kazanabilirsin");
            System.out.println("⑥ - Maden ➔ Yılanlarla savaşabilir, para, sihah veya zırh kazanabilirsin");
            System.out.println("⓪ - Çıkış yap");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.print("Bir bölge seçiniz: ");

            int selectLoc = input.nextInt();

            switch (selectLoc) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                case 6:
                    location = new Mine(player);
                    break;
                case 0:
                    location = null;
                    break;
                default:
                    location = new SafeHouse(player);
                    break;
            }

            if (location == null) {
                System.out.println("Çıkış yaptınız görüşmek üzere");
                break;
            }
            if (!location.onLocation()) {
                System.out.println("❌ ❌ ❌ ❌ ❌ ❌ ❌ ❌ ❌  GAME OVER  ❌ ❌ ❌ ❌ ❌ ❌ ❌ ❌ ❌");
                break;
            }
            if(safeHouse.isWin()){
                System.out.println("⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐");
                System.out.println("⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐  TEBRİKLER KAZANDINIZ  ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐");
                System.out.println("⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐");
                break;
            }
        }
    }
}